/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VCDProject.javaBeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Benja
 */

//*****************************************************************************************************************************************************************/
//*********************************************************              CLASSE Parcours          *****************************************************************/
//*****************************************************************************************************************************************************************/
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
    
  @OneToMany
      private List<Participant> listeParticipant= new ArrayList<>();
  @ManyToMany
      private List<Categorie> listeCategorie= new ArrayList<>();
//****************************************************************************************************************************************************************/
//********************************************************     CONSTRUCTEURS CLASSE Participant     ***************************************************************/
//*****************************************************************************************************************************************************************/        
    
    public Parcours() {
    }

//*****************************************************************************************************************************************************************/
//*****************************************************   CONSTRUCTEURS PAR COPIE CLASSE Parcours   ***************************************************************/
//*****************************************************************************************************************************************************************/
    
    public Parcours(Parcours Parcours){
        this.idParcours = Parcours.idParcours;
        this.libelle = Parcours.libelle;
        this.distance = Parcours.distance;
        this.heureDepart = Parcours.heureDepart;
        this.image = Parcours.image;
}    
    
//*******************************************************************************************************************************************************************/
//**********************************************************     GETTER SETTER CLASSE Participant     ***************************************************************/
//*******************************************************************************************************************************************************************/ 
   
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


