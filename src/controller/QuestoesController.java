/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoQuestoesImp;
import java.util.List;
import model.Questoes;

/**
 *
 * @author Garcia
 */
public class QuestoesController {
    DaoQuestoesImp questoes= new DaoQuestoesImp();

    public List<Questoes> questoes() {
        return questoes.questoes();
    }
    
    
}
