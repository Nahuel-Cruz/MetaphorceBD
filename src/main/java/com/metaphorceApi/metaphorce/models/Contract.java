package com.metaphorceApi.metaphorce.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contract")
public class Contract {
    @Id
    @Column(name = "contractType")
    private int contractType ;
    @Column(name = "nameContract")
    private String nameContract ;
    @Column(name = "descriptionContract")
    private String descriptionContract ;

    public int getContractType() {
        return contractType;
    }

    public void setContractType(int contractType) {
        this.contractType = contractType;
    }

    public String getNameContract() {
        return nameContract;
    }

    public void setNameContract(String nameContract) {
        this.nameContract = nameContract;
    }

    public String getDescriptionContract() {
        return descriptionContract;
    }

    public void setDescriptionContract(String descriptionContract) {
        this.descriptionContract = descriptionContract;
    }
}
