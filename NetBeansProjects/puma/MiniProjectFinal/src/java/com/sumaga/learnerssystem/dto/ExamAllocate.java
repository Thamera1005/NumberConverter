/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumaga.learnerssystem.dto;

/**
 *
 * @author Thamira
 */
public class ExamAllocate {
    private String reg;
    private String nic;
    private String shartName;
    private String contactNumber;

    public ExamAllocate(String reg, String nic, String shartName, String contactNumber) {
        this.reg = reg;
        this.nic = nic;
        this.shartName = shartName;
        this.contactNumber = contactNumber;
    }

    /**
     * @return the reg
     */
    
    
    public String getReg() {
        return reg;
    }

    /**
     * @param reg the reg to set
     */
    public void setReg(String reg) {
        this.reg = reg;
    }

    /**
     * @return the nic
     */
    public String getNic() {
        return nic;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(String nic) {
        this.nic = nic;
    }

    /**
     * @return the shartName
     */
    public String getShartName() {
        return shartName;
    }

    /**
     * @param shartName the shartName to set
     */
    public void setShartName(String shartName) {
        this.shartName = shartName;
    }

    /**
     * @return the contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * @param contactNumber the contactNumber to set
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
}
