/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author Garcia
 */
public class DaoAlunoImp {
    Connection con = null;
    PreparedStatement pstm= null;
    
     public int validaLogin (String u, int s) {
       int resposta= 0;
        ResultSet rs= null;
        con= new Conexao().getConnection();

       try{    
       pstm = con.prepareStatement("SELECT * from aluno where name=? and password=? ");
       pstm.setString(1,u);
       pstm.setInt(2, s);
       rs=this.pstm.executeQuery();
       if(rs.first()){
           resposta= rs.getRow();
       }
       this.pstm.close();
       }catch(SQLException inserterro){
           JOptionPane.showMessageDialog(null," Erro ao buscar! "+inserterro);
       }finally{
           try{
                con.close();
           }catch(SQLException errofechar){
                JOptionPane.showMessageDialog(null," Erro ao fechar conexão e buscar usuário! "+errofechar);
           }
       }return resposta; 
    }

}
