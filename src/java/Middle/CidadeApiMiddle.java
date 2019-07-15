/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Middle;

import DAO.CidadeApiDAO;
import Model.CidadeApi;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class CidadeApiMiddle {
    
    public List<CidadeApi> listarCidadePorPais(String sigla) {
        CidadeApiDAO cidadeApiDAO = new CidadeApiDAO();
        return cidadeApiDAO.listarCidadeApi(sigla);
    }
    
    
    public CidadeApi obterCidadeApi(Integer id) {
        CidadeApiDAO cidadeApiDAO = new CidadeApiDAO();
        return cidadeApiDAO.obterCidadeApi(id);
    }
    
}
