/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VCDProject.javaBeans;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Benja
 */

/******************************************************************************************************************************************************************/
/**********************************************************              CLASSE Categorie          ****************************************************************/
/******************************************************************************************************************************************************************/
@Entity
public class Categorie implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idCategorie;
    int ageMini;
    int ageMaxi;
    
/******************************************************************************************************************************************************************/
/*********************************************************     CONSTRUCTEURS CLASSE Categorie     *****************************************************************/
/******************************************************************************************************************************************************************/        
    
    public Categorie() {
    }
    
/******************************************************************************************************************************************************************/
/**********************************************************     GETTER SETTER CLASSE Categorie     ****************************************************************/
/*** @return ******************************************************************************************************************************************************/ 
   
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    public int getAgeMini() {
        return ageMini;
    }

    public void setAgeMini(int ageMini) {
        this.ageMini = ageMini;
    }

    public int getAgeMaxi() {
        return ageMaxi;
    }

    public void setAgeMaxi(int ageMaxi) {
        this.ageMaxi = ageMaxi;
    }
}

