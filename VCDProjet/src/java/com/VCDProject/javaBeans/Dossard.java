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
import javax.persistence.OneToOne;

/**
 *
 * @author Benja
 */

//*****************************************************************************************************************************************************************/
//*********************************************************              CLASSE Dossard          ******************************************************************/
//*****************************************************************************************************************************************************************/
@Entity
public class Dossard implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int numRFID;
    int numDossard;

    
 @OneToOne(mappedBy="dossard")
private Participant participant;
  
//*****************************************************************************************************************************************************************/
//********************************************************     CONSTRUCTEURS CLASSE Dossard     *******************************************************************/
//*****************************************************************************************************************************************************************/           
    
    public Dossard() {
    }

    
//*****************************************************************************************************************************************************************/
//*****************************************************   CONSTRUCTEURS PAR COPIE CLASSE Dossard   ************************************************************/
//*****************************************************************************************************************************************************************/
    
    public Dossard(Dossard Dossard){
        this.numRFID = Dossard.numRFID;
        this.numDossard = Dossard.numDossard;
}
       
//*****************************************************************************************************************************************************************/
//*********************************************************     GETTER SETTER CLASSE Dossard     ******************************************************************/
//*****************************************************************************************************************************************************************/    
    
    public int getNumRFID() {
        return numRFID;
    }

    public void setNumRFID(int numRFID) {
        this.numRFID = numRFID;
    }

    public int getNumDossard() {
        return numDossard;
    }

    public void setNumDossard(int numDossard) {
        this.numDossard = numDossard;
    }
    
    
}

