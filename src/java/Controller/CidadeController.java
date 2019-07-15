/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import AcessosDados.AcessoCidade;
import AcessosDados.AcessoCidadeApi;
import AcessosDados.AcessoPaisApi;
import AcessosDados.AcessoPrevisao;
import Model.Cidade;
import Model.CidadeApi;
import Model.PaisApi;
import Model.Previsao;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Bruno Martins
 */
@ManagedBean
@ViewScoped
public class CidadeController {

    private Cidade cidade;
    private AcessoCidade acessoCidade;
    private List<Cidade> cidades;

    private AcessoPaisApi acessoPaisApi;
    private List<PaisApi> paisesApi;

    private AcessoCidadeApi acessoCidadeApi;
    private List<CidadeApi> cidadesApi;

    private String paisSelecionado;

    private AcessoPrevisao acessoPrevisao;
    private Previsao previsao;

    private Integer cidadeSelecionada;

    public void start() {
        this.cidade = new Cidade();
        this.cidades = new ArrayList<>();
        this.paisesApi = new ArrayList<>();
        this.cidadesApi = new ArrayList<>();
        this.acessoPaisApi = new AcessoPaisApi();
        this.acessoCidadeApi = new AcessoCidadeApi();
        this.setPaisesApi(acessoPaisApi.listarPaises());
        this.acessoCidade = new AcessoCidade();
        this.setCidades(acessoCidade.listarCidades());

    }

    public void listarCidades() {
        this.setCities(acessoCidadeApi.listarCidadePorPais(paisSelecionado));
    }

    public void limparCampos() {
        this.cidade = new Cidade();
        this.paisSelecionado = null;
    }

    public void inserirCidade() {
        acessoCidade = new AcessoCidade();
        if (this.acessoCidade.inserirCidade(this.cidade)) {
            Util.Mensagem.saveMessage("Cidade cadastrada com sucesso!", "S");
            limparCampos();
            carregarCidadesCadastradas();
        } else {
            Util.Mensagem.saveMessage("Ocorreu um erro inesperado ao tentar salvar essa cidade", "");
        }
    }

    public void carregarCidadesCadastradas() {
        acessoCidade = new AcessoCidade();
        setCidades(acessoCidade.listarCidades());
    }

    public void verificarPrevisao(Integer idCidade) {
        try {
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
            FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath() + "/detalhe.jsf?idCidade=" + idCidade);
            FacesContext.getCurrentInstance().responseComplete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }

    public void carregarDetalhePrevisao() {
        acessoCidadeApi = new AcessoCidadeApi();
        acessoPrevisao = new AcessoPrevisao();
        CidadeApi cidadeApi = acessoCidadeApi.obterCidadeApi(cidadeSelecionada);
        setCidade(new Cidade());
        getCidade().setCidadeApi(cidadeApi);
        setPrevisao(acessoPrevisao.obterPrevisao(cidadeSelecionada));
    }

    public void paginaInicial() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(request.getContextPath() + "/index.jsf");
        } catch (IOException ex) {
            Logger.getLogger(CidadeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        FacesContext.getCurrentInstance().responseComplete();
    }

    public List<PaisApi> getPaisesApi() {
        return paisesApi;
    }

    public void setPaisesApi(List<PaisApi> paisesApi) {
        this.paisesApi = paisesApi;
    }

    public List<CidadeApi> getCities() {
        return cidadesApi;
    }

    public void setCities(List<CidadeApi> cidadesApi) {
        this.cidadesApi = cidadesApi;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public AcessoCidade getCidadeBusiness() {
        return acessoCidade;
    }

    public void setCidadeBusiness(AcessoCidade acessoCidade) {
        this.acessoCidade = acessoCidade;
    }

    public List<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(List<Cidade> cidades) {
        this.cidades = cidades;
    }

    public String getPaisSelecionado() {
        return paisSelecionado;
    }

    public void setPaisSelecionado(String paisSelecionado) {
        this.paisSelecionado = paisSelecionado;
    }

    public Previsao getPrevisao() {
        return previsao;
    }

    public void setPrevisao(Previsao previsao) {
        this.previsao = previsao;
    }

    public Integer getCidadeSelecionada() {
        return cidadeSelecionada;
    }

    public void setCidadeSelecionada(Integer cidadeSelecionada) {
        this.cidadeSelecionada = cidadeSelecionada;
    }

}
