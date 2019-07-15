/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Middle;

import DAO.CidadeDAO;
import Model.Cidade;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class CidadeMiddle {
    
    CidadeDAO cidadeDAO;
    public Boolean inserirCidade(Cidade cidade) {
        cidadeDAO = new CidadeDAO();
        return cidadeDAO.inserirCidade(cidade);
    }
    
    public List<Cidade> listarCidades() {
        cidadeDAO = new CidadeDAO();
        return cidadeDAO.listarCidades();
    }
    
}
