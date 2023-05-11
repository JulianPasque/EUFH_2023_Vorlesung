package com.eufhapi.eufhapi.Classes;

import java.time.LocalDate;

public class Treatment {

    private int iD;
    private LocalDate Date;
    private boolean isProphylaxis;
    private boolean isSpecialistTreatment;
    private boolean isReferred;
    private String Action;

    public Treatment(int iD, LocalDate date, boolean isProphylaxis, boolean isSpecialistTreatment, boolean isReferred,
            String action) {
        this.iD = iD;
        Date = date;
        this.isProphylaxis = isProphylaxis;
        this.isSpecialistTreatment = isSpecialistTreatment;
        this.isReferred = isReferred;
        Action = action;
    }

    public Treatment(int iD, LocalDate date) {
        this.iD = iD;
        Date = date;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public void setProphylaxis(boolean isProphylaxis) {
        this.isProphylaxis = isProphylaxis;
    }

    public void setSpecialistTreatment(boolean isSpecialistTreatment) {
        this.isSpecialistTreatment = isSpecialistTreatment;
    }

    public void setReferred(boolean isReferred) {
        this.isReferred = isReferred;
    }

    public void setAction(String action) {
        Action = action;
    }

    public int getiD() {
        return iD;
    }

    public LocalDate getDate() {
        return Date;
    }

    public boolean isProphylaxis() {
        return isProphylaxis;
    }

    public boolean isSpecialistTreatment() {
        return isSpecialistTreatment;
    }

    public boolean isReferred() {
        return isReferred;
    }

    public String getAction() {
        return Action;
    }

}
