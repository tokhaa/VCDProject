/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VCDProject.javaBeans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Benja
 */

/******************************************************************************************************************************************************************/
/**********************************************************              CLASSE Parcours          *****************************************************************/
/******************************************************************************************************************************************************************/
@Entity
public class Parcours implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idParcours;
    String libelle;
    int distance;
    @Temporal(TemporalType.DATE)
    Date heureDepart = new Date();
    String image;

/******************************************************************************************************************************************************************/
/*********************************************************     CONSTRUCTEURS CLASSE Participant     ***************************************************************/
/******************************************************************************************************************************************************************/        
    
    public Parcours() {
    }
    
/******************************************************************************************************************************************************************/
/*********************************************************     GETTER SETTER CLASSE Participant     ***************************************************************/
/*** @return ******************************************************************************************************************************************************/ 
   
    public int getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(int idParcours) {
        this.idParcours = idParcours;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Date getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Date heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}


