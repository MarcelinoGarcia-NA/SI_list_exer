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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Questoes;

/**
 *
 * @author Garcia
 */
public class DaoQuestoesImp {
    Connection con = null;
    PreparedStatement pstm= null;
    
    
     public List<Questoes> questoes() {
        List<Questoes> lista = new ArrayList<Questoes>(); 
        
        ResultSet rs= null;
        con= new Conexao().getConnection();

       try{    
       pstm = con.prepareStatement("SELECT * from questoes ");
       rs=this.pstm.executeQuery();
        if(rs.first()){
           do{
              Questoes quest=new Questoes();
              quest.setPergunta(rs.getString("pergunta"));
              quest.setResposta(rs.getString("resposta"));
              lista.add(quest);
        }while(rs.next());
           
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
       }return lista; 
    }
}
