/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bruno Martins
 */
public class Conexao {
    private static final String urlBanco = "jdbc:mysql://localhost:3306/previsaoTempo";
    private static final String userBanco = "root";
    private static final String passwordBanco = "";
    
    public static Connection conectar() {
        try {
            Connection conexaoBanco = DriverManager.getConnection(urlBanco, userBanco, passwordBanco);
            System.out.println("Conectado...");
            return conexaoBanco;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        conectar();
    }
}
