package controller;

import dao.conexao.Conexao;
import dao.conexao.ConexaoMysql;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Testa {

    public static void main(String[] args) throws SQLException {

        String sql = "SELECT * FROM CATEGORIA";

        Conexao conexao = new ConexaoMysql();

       ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();

       while (result.next()) {
           System.out.println(result.getString("nome"));
       }


    }

}
