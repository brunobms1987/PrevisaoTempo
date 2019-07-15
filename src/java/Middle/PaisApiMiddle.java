/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Middle;

import DAO.PaisApiDAO;
import Model.PaisApi;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class PaisApiMiddle {
    public List<PaisApi> listarPaises() {
        PaisApiDAO countryDAO = new PaisApiDAO();
        return countryDAO.listarPaises();
    }
}
