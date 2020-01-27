package com.hms.model;

public class Prescription {
    private String id;
    private String patientsId;
    private String doctorsId;
    private String nameOfMedicine;
    private int doseMg;
    private int numberOfTablets;
    private int dailyDose;
    private String explanation;

    public Prescription(String id, String patientsId, String doctorsId, String nameOfMedicine, int doseMg, int numberOfTablets, int dailyDose, String explanation) {
        this.id = id;
        this.patientsId = patientsId;
        this.doctorsId = doctorsId;
        this.nameOfMedicine = nameOfMedicine;
        this.doseMg = doseMg;
        this.numberOfTablets = numberOfTablets;
        this.dailyDose = dailyDose;
        this.explanation = explanation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(String patientsId) {
        this.patientsId = patientsId;
    }

    public String getDoctorsId() {
        return doctorsId;
    }

    public void setDoctorsId(String doctorsId) {
        this.doctorsId = doctorsId;
    }

    public String getNameOfMedicine() {
        return nameOfMedicine;
    }

    public void setNameOfMedicine(String nameOfMedicine) {
        this.nameOfMedicine = nameOfMedicine;
    }

    public int getDoseMg() {
        return doseMg;
    }

    public void setDoseMg(int doseMg) {
        this.doseMg = doseMg;
    }

    public int getNumberOfTablets() {
        return numberOfTablets;
    }

    public void setNumberOfTablets(int numberOfTablets) {
        this.numberOfTablets = numberOfTablets;
    }

    public int getDailyDose() {
        return dailyDose;
    }

    public void setDailyDose(int dailyDose) {
        this.dailyDose = dailyDose;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return "Prescription{" + "id=" + id + ", patientId=" + patientsId + ", doctorId=" + doctorsId + ", nameOfMedicine=" + nameOfMedicine + ", doseMg=" + doseMg + ", numberOfTablets=" + numberOfTablets + ", dailyDose=" + dailyDose + ", explanation=" + explanation + '}';
    }

    
    
}
