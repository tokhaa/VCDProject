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
/**********************************************************              CLASSE Sponsor          ******************************************************************/
/******************************************************************************************************************************************************************/
@Entity

public class Sponsor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idSponsor;
    String libelle;
    String image;

/******************************************************************************************************************************************************************/
/*********************************************************     CONSTRUCTEURS CLASSE Sponsor     *******************************************************************/
/******************************************************************************************************************************************************************/           
        
    public Sponsor() {
    }

/******************************************************************************************************************************************************************/
/**********************************************************     GETTER SETTER CLASSE Sponsor     ******************************************************************/
/*** @return ******************************************************************************************************************************************************/        
    
    public int getIdSponsor() {
        return idSponsor;
    }

    public void setIdSponsor(int idSponsor) {
        this.idSponsor = idSponsor;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
