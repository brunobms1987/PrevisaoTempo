/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Model.PaisApi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno Martins
 */
public class PaisApiDAO  {
    
    public List<PaisApi> listarPaises() {
        
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT sigla from PaisApi order by 1");
        
        Connection conn = Conexao.conectar();
        try {
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ResultSet rs = ps.executeQuery();
            List<PaisApi> listaCountry = new ArrayList<>();
            while(rs.next()) {
                PaisApi paisApi = new PaisApi();
                paisApi.setSigla(rs.getString("sigla"));
                listaCountry.add(paisApi);
            }
            rs.close();
            ps.close();
            return listaCountry;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
        
    }
    
}   
