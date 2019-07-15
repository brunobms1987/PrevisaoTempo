/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Model.CidadeApi;
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
public class CidadeApiDAO {
    
    public List<CidadeApi> listarCidadeApi(String sigla) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CidadeApi where sigla = '").append(sigla).append("'").append(" order by  name" );
        System.out.println(sb.toString());
        Connection conn = Conexao.conectar();
        try {
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ResultSet rs = ps.executeQuery();
            List<CidadeApi> cidadesApi = new ArrayList<>();
            while(rs.next()) {
                CidadeApi cidadeApi = new CidadeApi();
                PaisApi paisApi = new PaisApi();
                paisApi.setSigla(rs.getString("sigla"));
                cidadeApi.setPaisApi(paisApi);
                cidadeApi.setId(rs.getInt("id"));
                cidadeApi.setName(rs.getString("name"));
                cidadesApi.add(cidadeApi);
            }
            rs.close();
            ps.close();
            return cidadesApi;
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
    
    
    public CidadeApi obterCidadeApi(Integer id) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CidadeApi where id = ").append(id);
        System.out.println(sb.toString());
        Connection conn = Conexao.conectar();
        try {
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ResultSet rs = ps.executeQuery();            
            CidadeApi cidadeApi = new CidadeApi();
            if(rs.next()) {                
                PaisApi paisApi = new PaisApi();
                paisApi.setSigla(rs.getString("sigla"));
                cidadeApi.setPaisApi(paisApi);
                cidadeApi.setId(rs.getInt("id"));
                cidadeApi.setName(rs.getString("name"));                
            }
            rs.close();
            ps.close();
            return cidadeApi;
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
    
}
