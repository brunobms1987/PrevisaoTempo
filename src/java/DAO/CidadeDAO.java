/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.Conexao;
import Model.Cidade;
import Model.CidadeApi;
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
public class CidadeDAO {

    public Boolean inserirCidade(Cidade cidade) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO CIDADE (id_cidade) values (?)");
        Connection conn = Conexao.conectar();
        try {
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ps.setInt(1, cidade.getCidadeApi().getId());
            ps.execute();
            ps.close();
            return true;
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }

    }

    public List<Cidade> listarCidades() {

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM Cidade ");
        sb.append("INNER JOIN CidadeApi on cidadeApi.id = cidade.id_cidade order by cidadeApi.name");

        Connection conn = Conexao.conectar();
        try {
            PreparedStatement ps = conn.prepareStatement(sb.toString());
            ResultSet rs = ps.executeQuery();
            List<Cidade> cidades = new ArrayList<>();
            while (rs.next()) {
                Cidade c = new Cidade();
                c.setCodigo(rs.getInt("codigo"));
                CidadeApi cidadeApi = new CidadeApi();
                cidadeApi.setId(rs.getInt("id_cidade"));
                cidadeApi.setName(rs.getString("name"));
                c.setCidadeApi(cidadeApi);
                cidades.add(c);
            }
            rs.close();
            ps.close();
            return cidades;
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

}
