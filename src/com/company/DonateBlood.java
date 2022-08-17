package com.company;

public class DonateBlood {
    private int id ;
    private String namePatient;
    private int numberUnits;

    public DonateBlood(int id , String namePatient , int numberUnits){
        this.id = id ;
        this.namePatient = namePatient;
        this.numberUnits = numberUnits;
    }

    public int getId(){
        return id;
    }
    public String getNamePatient(){
        return namePatient;
    }
    public int getNumberUnits(){
        return numberUnits;
    }
    public void printBoold(){
        System.out.println("ID : " + id);
        System.out.println("Name : " + namePatient);
        System.out.println("UnitBoold : " + numberUnits);
    }

}
