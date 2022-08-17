package com.company;

public class Reservation {
    public int ID  ;
    int id_doctor;
    String name_patient;
    String date;
    int prices;

    public Reservation(int id,String name_patient , int id_doctor , String date , int prices){
        this.ID = id;
        this.name_patient = name_patient;
        this.id_doctor = id_doctor;
        this.date = date;
        this.prices = prices;
    }
    public void print_Reservation(){
        System.out.println("ID : " + ID);
        System.out.println("Name Patient :"+name_patient);
        System.out.println("Date : "+date);
        System.out.println("Prices : "+prices);
    }
}
