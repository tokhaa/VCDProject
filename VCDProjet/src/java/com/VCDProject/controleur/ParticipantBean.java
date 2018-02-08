/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VCDProject.controleur;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Moussa
 */
@Named
@RequestScoped
public class ParticipantBean implements Serializable {

    @PersistenceContext
    EntityManager em;               //Verification

    
}
