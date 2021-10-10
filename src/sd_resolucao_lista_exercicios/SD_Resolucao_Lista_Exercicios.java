/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sd_resolucao_lista_exercicios;

import conexao.Conexao;
import controller.AlunoController;
import controller.QuestoesController;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import model.Questoes;

/**
 *
 * @author Garcia
 */
public class SD_Resolucao_Lista_Exercicios {
    
    public static void main(String[] args) {
        AlunoController aluno= new AlunoController();
        String name = JOptionPane.showInputDialog(null, "Informe seu nome:");
        int password =   parseInt(JOptionPane.showInputDialog(null, "Informe seu password:"));
        int resposta_validacao = (aluno.validaLogin(name,password));
      
        if(resposta_validacao==1){
            JOptionPane.showMessageDialog(null,"Logado com sucesso");
            QuestoesController questoes = new QuestoesController();
            List<Questoes> x= questoes.questoes();
            int acertos=0,erros=0;
          
             String resposta=JOptionPane.showInputDialog(null,x.get(0).getPergunta()+"\n"+"A:"+x.get(0).getResposta()+
             "\n"+"B:"+"Modelo de computação"+
             "\n"+"C:"+"Modelo de extração"+
             "\n"+"D:"+"Modelo de codificação"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("A")){
                 acertos++;
             }else{
                 erros++;
             } 
             resposta=JOptionPane.showInputDialog(null,x.get(1).getPergunta()+"\n"+"A:"+x.get(1).getResposta()+
             "\n"+"B:"+" um conjunto de micro-serviços dependentes que se apresenta a seus usuários como um sistema único e coerente [2]."+
             "\n"+"C:"+" um conjunto de computadores independentes que se apresenta interligagos por rede UTP"+
             "\n"+"D:"+"um conjunto de computadores independentes que se apresenta interligagos por rede HTTP"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("A")){
                 acertos++;
             }else{
                 erros++;
             } 
              resposta=JOptionPane.showInputDialog(null,x.get(2).getPergunta()+"\n"+"A:"+"Disponibilização de recursos ciptrografado e Transparência de dados"+
             "\n"+"B:"+" Disponibilização de recursos ciptrografado e Transparência de requisição"+
             "\n"+"C:"+x.get(2).getResposta()+
             "\n"+"D:"+"Disponibilização de recursos nativos e Transparência de distribuição"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("C")){
                 acertos++;
             }else{
                 erros++;
             } 
              resposta=JOptionPane.showInputDialog(null,x.get(3).getPergunta()+"\n"+"A:"+"Modelos cliente-servidor e servidor-controlador"+
             "\n"+"B:"+x.get(3).getResposta()+
             "\n"+"C:"+"Modelos servidor-to-servidor e peer-to–peer"+
             "\n"+"D:"+"Modelos cliente-roteador e cliente-peer"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("B")){
                 acertos++;
             }else{
                 erros++;
             } 
             resposta=JOptionPane.showInputDialog(null,x.get(4).getPergunta()+"\n"+"A:"+"para designar um conjunto bem conhecido de escalonagem"+
             "\n"+"B:"+"para designar um conjunto bem conhecido de aqrquivos"+
             "\n"+"C:"+"para designar um arquivo bem conhecido de regras e ciptografia"+
             "\n"+"D:"+x.get(4).getResposta()        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("D")){
                 acertos++;
             }else{
                 erros++;
             } 
              JOptionPane.showMessageDialog(null,"Acertos: "+acertos+"\n"+"erros:"+erros);
        }else{
            JOptionPane.showMessageDialog(null,"Aluno não se encontra na base de dados!"+"\n"+"Você terá acesso há uma versão demostração!");
            List<Questoes> x= new ArrayList<Questoes>();
            Questoes pergunta1= new Questoes();
            pergunta1.setPergunta("Qual desse é um modelo fundamental?");
            pergunta1.setResposta("Modelos de interação");
            x.add(pergunta1);
            
            Questoes pergunta2= new Questoes();
            pergunta2.setPergunta("Um sistema distribuído pode ser definido como ?");
            pergunta2.setResposta(" um conjunto de computadores independentes que se apresenta a seus usuários como um sistema único e coerente [2].");
            x.add(pergunta2);
            
            Questoes pergunta3= new Questoes();
            pergunta3.setPergunta("Qual o objetivo de um sistema distribuido?");
            pergunta3.setResposta("Disponibilização de recursos compartilhado e Transparência de distribuição");
            x.add(pergunta3);
             
            Questoes pergunta4= new Questoes();
            pergunta4.setPergunta("Quais os modelos de arquitetura?");
            pergunta4.setResposta("Modelos cliente-servidor e peer-to–peer");
            x.add(pergunta4);
            
            Questoes pergunta5= new Questoes();
            pergunta5.setPergunta("O termo protocolo é usado:");
            pergunta5.setResposta("para designar um conjunto bem conhecido de regras e formatos");
            x.add(pergunta5);
            
            int acertos=0,erros=0;
             
             String resposta=JOptionPane.showInputDialog(null,x.get(0).getPergunta()+"\n"+"A:"+x.get(0).getResposta()+
             "\n"+"B:"+"Modelo de computação"+
             "\n"+"C:"+"Modelo de extração"+
             "\n"+"D:"+"Modelo de codificação"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("A")){
                 acertos++;
             }else{
                 erros++;
             } 
             resposta=JOptionPane.showInputDialog(null,x.get(1).getPergunta()+"\n"+"A:"+x.get(1).getResposta()+
             "\n"+"B:"+" um conjunto de micro-serviços dependentes que se apresenta a seus usuários como um sistema único e coerente [2]."+
             "\n"+"C:"+" um conjunto de computadores independentes que se apresenta interligagos por rede UTP"+
             "\n"+"D:"+"um conjunto de computadores independentes que se apresenta interligagos por rede HTTP"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("A")){
                 acertos++;
             }else{
                 erros++;
             } 
              resposta=JOptionPane.showInputDialog(null,x.get(2).getPergunta()+"\n"+"A:"+"Disponibilização de recursos ciptrografado e Transparência de dados"+
             "\n"+"B:"+" Disponibilização de recursos ciptrografado e Transparência de requisição"+
             "\n"+"C:"+x.get(2).getResposta()+
             "\n"+"D:"+"Disponibilização de recursos nativos e Transparência de distribuição"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("C")){
                 acertos++;
             }else{
                 erros++;
             } 
              resposta=JOptionPane.showInputDialog(null,x.get(3).getPergunta()+"\n"+"A:"+"Modelos cliente-servidor e servidor-controlador"+
             "\n"+"B:"+x.get(3).getResposta()+
             "\n"+"C:"+"Modelos servidor-to-servidor e peer-to–peer"+
             "\n"+"D:"+"Modelos cliente-roteador e cliente-peer"        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("B")){
                 acertos++;
             }else{
                 erros++;
             } 
             resposta=JOptionPane.showInputDialog(null,x.get(4).getPergunta()+"\n"+"A:"+"para designar um conjunto bem conhecido de escalonagem"+
             "\n"+"B:"+"para designar um conjunto bem conhecido de aqrquivos"+
             "\n"+"C:"+"para designar um arquivo bem conhecido de regras e ciptografia"+
             "\n"+"D:"+x.get(4).getResposta()        
             );
             resposta=toUpperCase(resposta);
             if (resposta.equals("D")){
                 acertos++;
             }else{
                 erros++;
             } 
              JOptionPane.showMessageDialog(null,"Acertos: "+acertos+"\n"+"erros:"+erros);
        }
    }
    
}
