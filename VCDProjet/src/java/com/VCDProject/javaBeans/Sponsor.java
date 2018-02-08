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

//*****************************************************************************************************************************************************************/
//*********************************************************              CLASSE Sponsor          ******************************************************************/
//*****************************************************************************************************************************************************************/
@Entity
public class Sponsor implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int idSponsor;
    String libelle;
    String image;
    
//*****************************************************************************************************************************************************************/
//*********************************************************             UML NIVEAU 2 CLASSE Sponsor          ******************************************************/
//*****************************************************************************************************************************************************************/

   // Il n'y a pas d'UML NIVEAU 2 pour la classe Sponsor, car elle n'a aucun lien avec les autres classes. 
    
//*****************************************************************************************************************************************************************/
//********************************************************     CONSTRUCTEURS CLASSE Sponsor     *******************************************************************/
//*****************************************************************************************************************************************************************/           
        
    public Sponsor() {
    }
  
//*****************************************************************************************************************************************************************/
//*****************************************************   CONSTRUCTEURS PAR COPIE CLASSE Sponsor   ****************************************************************/
//*****************************************************************************************************************************************************************/
    
    public Sponsor(Sponsor Sponsor){
        this.idSponsor = Sponsor.idSponsor;
        this.libelle = Sponsor.libelle;
        this.image = Sponsor.image;
}     
//*****************************************************************************************************************************************************************/
//*********************************************************     GETTER SETTER CLASSE Sponsor     ******************************************************************/
//*****************************************************************************************************************************************************************/        
    
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
