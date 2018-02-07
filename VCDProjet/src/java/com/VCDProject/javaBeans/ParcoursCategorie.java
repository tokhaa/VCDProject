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
/******************************************************              CLASSE ParcoursCategorie          ************************************************************/
/******************************************************************************************************************************************************************/
@Entity

public class ParcoursCategorie implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Temporal(TemporalType.DATE)
    Date tempsMaxOr = new Date();
    @Temporal(TemporalType.DATE)
    Date tempsMaxArgent = new Date();
    @Temporal(TemporalType.DATE)
    Date tempsMaxBronze = new Date();

//*****************************************************************************************************************************************************************/
//********************************************************     CONSTRUCTEURS CLASSE ParcoursCategorie     *********************************************************/
//*****************************************************************************************************************************************************************/               
    
    public ParcoursCategorie() {
    }

//*****************************************************************************************************************************************************************/
//*****************************************************   CONSTRUCTEURS PAR COPIE CLASSE ParcoursCategorie   ******************************************************/
//*****************************************************************************************************************************************************************/
    
    public ParcoursCategorie(ParcoursCategorie ParcoursCategorie){
        this.tempsMaxOr = ParcoursCategorie.tempsMaxOr;
        this.tempsMaxArgent = ParcoursCategorie.tempsMaxArgent;
        this.tempsMaxBronze = ParcoursCategorie.tempsMaxBronze;
} 
    
//******************************************************************************************************************************************************************/
//**********************************************************     GETTER SETTER CLASSE ParcoursCategorie     ********************************************************/
//******************************************************************************************************************************************************************/        
 
    public Date getTempsMaxOr() {
        return tempsMaxOr;
    }

    public void setTempsMaxOr(Date tempsMaxOr) {
        this.tempsMaxOr = tempsMaxOr;
    }

    public Date getTempsMaxArgent() {
        return tempsMaxArgent;
    }

    public void setTempsMaxArgent(Date tempsMaxArgent) {
        this.tempsMaxArgent = tempsMaxArgent;
    }

    public Date getTempsMaxBronze() {
        return tempsMaxBronze;
    }

    public void setTempsMaxBronze(Date tempsMaxBronze) {
        this.tempsMaxBronze = tempsMaxBronze;
    }
}
    
   
