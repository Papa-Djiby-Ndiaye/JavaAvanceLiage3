/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import models.Classe;
import models.Personne;
import models.Professeur;

/**
 *
 * @author djiby
 */
public class DaoPersonne {
    private final String SQL_SELECT_BY_CLASSE="select * from personne where type='Etudiant' and classe_id=?";
    public final String SQL_INSERT="INSERT INTO `gestion_etudiant_liage3`.`personne` (`nom_complet`, `type`, `tuteur`, `modules`, `grade`, `classe_id`) VALUES (?,?,?,?,?,?);";
    private final String SQL_SELECT_PROFESSEUR="select * from personne where matricule=?";
    public List<Personne> findByClasse(Classe classe){
        List<Personne> lEtudiants=new ArrayList<>();
        //recupération
        return lEtudiants;
    }
     public List<Personne> findProfesseur(Professeur prof){
        List<Personne> lProfesseurs=new ArrayList<>();
        //recupération
        return lProfesseurs;
    }
    
    public int insert(Personne pers){
       int nbreLigne=0;
       //Traitement d'insertion
       return nbreLigne;
    }
    public Professeur findProfesseurByMatricule(String matricule){
        Professeur professeur = null;
                //recherche
                return professeur;
    }
}
