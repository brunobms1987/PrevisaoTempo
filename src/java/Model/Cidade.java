/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Bruno Martins
 */
public class Cidade {

    private Integer codigo;
    private CidadeApi cidadeApi;

    public Cidade() {
        this.cidadeApi = new CidadeApi();
    }

   public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public CidadeApi getCidadeApi() {
        return cidadeApi;
    }

    public void setCidadeApi(CidadeApi cidadeApi) {
        this.cidadeApi = cidadeApi;
    }
    
}
