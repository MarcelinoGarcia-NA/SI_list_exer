/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoAlunoImp;
import java.sql.ResultSet;

/**
 *
 * @author Garcia
 */
public class AlunoController {
    DaoAlunoImp dao= new DaoAlunoImp();
    
    public int validaLogin(String u,int s){
        return dao.validaLogin(u, s);
    }
}
