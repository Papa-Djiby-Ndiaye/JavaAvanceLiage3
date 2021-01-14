/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;

/**
 *
 * @author djiby
 */
public class DaoClasse {
    private final String SQL_INSERT="INSERT INTO `gestion_etudiant_liage3`.`classe` (`libelle`, `nbre_etudiant`) VALUES (?,?);"; 
    private final String SQL_SELECT_ALL="select * from classe";
    public int insert(Classe classe){
        int nbreLigne=0;
        //insertion et retrn nbre de ligne
        return nbreLigne;
        
    }
    
    public List<Classe> findAll(){
        List<Classe>lClasses=new ArrayList<>();
        //Remplir liste
        
        return lClasses;
    }
}
