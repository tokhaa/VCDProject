/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.VCDProject.javaBeans;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author Moussa
 */
//Clé primaire plusieurs attribut donc on utilise @Embeddable
@Embeddable
class ParcoursCategorieID implements Serializable {
    
    private Long idParcours;    
    private Long idCategorie;

    public ParcoursCategorieID() {
    }

    public ParcoursCategorieID(Long idParcours, Long idCategorie) {
        this.idParcours = idParcours;
        this.idCategorie = idCategorie;
    }

    public Long getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(Long idParcours) {
        this.idParcours = idParcours;
    }

    public Long getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ParcoursCategorieID other = (ParcoursCategorieID) obj;
        if (!Objects.equals(this.idParcours, other.idParcours)) {
            return false;
        }
        return true;
    }
    
}
