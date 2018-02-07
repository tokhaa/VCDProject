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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Benja
 */
/******************************************************************************************************************************************************************/
/*********************************************************              CLASSE PARTICIPANT          ***************************************************************/
/******************************************************************************************************************************************************************/
@Entity
public class Participant implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idParticipant;
    
    String nom;
    String prenom;
    @Temporal(TemporalType.DATE)
    Date dateNaissance = new Date();
    Boolean sexe;
    String adresse;
    String ville;
    String pays;
    String mail;
    char remarque;
    String certificat;
    boolean licence;
    boolean verificationParticipant;
    boolean verificationDocument;
    float tempsParcours;
    @Temporal(TemporalType.DATE)
    Date dateInscription = new Date();
    boolean isAbandon;
    
    
@ManyToOne
private Parcours parcours;

@ManyToOne
private Categorie categorie;

  @OneToOne
private Dossard dossard;


/******************************************************************************************************************************************************************/
/*********************************************************     CONSTRUCTEURS CLASSE Participant     ***************************************************************/
/******************************************************************************************************************************************************************/    
    
    public Participant() {
    }
    
/******************************************************************************************************************************************************************/
/******************************************************   CONSTRUCTEURS PAR COPIE CLASSE Participant   ************************************************************/
/*** @param p******************************************************************************************************************************************************/
    
    public Participant(Participant p){
        this.idParticipant = p.idParticipant;
        this.nom = p.nom;
        this.prenom = p.prenom;
        this.dateNaissance = p.dateNaissance;
        this.sexe = p.sexe;
        this.adresse = p.adresse;
        this.ville = p.ville;
        this.pays = p.pays;
        this.mail = p.mail;
        this.remarque = p.remarque;
        this.certificat = p.certificat;
        this.licence = p.licence;
        this.verificationParticipant = p.verificationParticipant;
        this.verificationDocument = p.verificationDocument;
        this.tempsParcours = p.tempsParcours;
        this.dateInscription = p.dateInscription;
        this.isAbandon = p.isAbandon;
}
    
/******************************************************************************************************************************************************************/
/*********************************************************     GETTER SETTER CLASSE Participant     ***************************************************************/
/*** @return ******************************************************************************************************************************************************/    
    
    public int getIdParticipant() {
        return idParticipant;
    }

    public void setIdParticipant(int idParticipant) {
        this.idParticipant = idParticipant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Boolean getSexe() {
        return sexe;
    }

    public void setSexe(Boolean sexe) {
        this.sexe = sexe;
    }

    public String getAddresse() {
        return adresse;
    }

    public void setAddresse(String addresse) {
        this.adresse = addresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public char getRemarque() {
        return remarque;
    }

    public void setRemarque(char remarque) {
        this.remarque = remarque;
    }

    public String getCertificat() {
        return certificat;
    }

    public void setCertificat(String certificat) {
        this.certificat = certificat;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public boolean isVerificationParticipant() {
        return verificationParticipant;
    }

    public void setVerificationParticipant(boolean verificationParticipant) {
        this.verificationParticipant = verificationParticipant;
    }

    public boolean isVerificationDocument() {
        return verificationDocument;
    }

    public void setVerificationDocument(boolean verificationDocument) {
        this.verificationDocument = verificationDocument;
    }

    public float getTempsParcours() {
        return tempsParcours;
    }

    public void setTempsParcours(float tempsParcours) {
        this.tempsParcours = tempsParcours;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public boolean isIsAbandon() {
        return isAbandon;
    }

    public void setIsAbandon(boolean isAbandon) {
        this.isAbandon = isAbandon;
    }
    
    
}
