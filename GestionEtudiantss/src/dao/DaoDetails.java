/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Details;

/**
 *
 * @author djiby
 */
public class DaoDetails {
     private final String SQL_SELECT_MODULES="select * from details where modules=?";
     private final String SQL_SELECT_MODULES_CLASSE="select * from details where classe_id=?";
    private final String SQL_INSERT="INSERT INTO `gestion_etudiant_liage3`.`details` (`classe_id`, `professeur_id`, `annee`, `modules`) VALUES (?,?,?,?);";
    public int insert(Details detail){
        int nbreLigne=0;
        //traitement insertion
        return nbreLigne; 
    }
     public List<Details> findModulesProfesseur(Details modules){
         List<Details> lModules=new ArrayList<>();
        //recupération
        return lModules;
    }
      public Details findModulesProfesseurByClasse(int classe_id){
        Details modules = null;
                //recherche
                return modules;
    }
}
