package com.company;

import java.util.Scanner;

public class HumanResources {
    Scanner input = new Scanner(System.in);

    public void add_Doctor(Tree Doctors) {

        System.out.print("Insert Doctor ID : ");
        int Id = input.nextInt();

        System.out.print("Insert Doctor Name : ");
        String Name = input.next();

        System.out.print("Insert Doctor Date of birth : ");
        String dateOfBirth = input.next();

        System.out.print("Insert Doctor phone number : ");
        String phone = input.next();

        System.out.print("Insert Doctor Email : ");
        String email = input.next();

        System.out.print("Insert Doctor Departemt : ");
        String Departemtn = input.next();
        Doctor newDoctor = new Doctor(Id,Name,dateOfBirth,phone,email,Departemtn);
        Doctors.add(newDoctor);
    }

    public void add_Patient(Tree Patient){
            System.out.print("Insert Patient ID : ");
            int Id = input.nextInt();

            System.out.print("Insert Patient Name : ");
            String Name = input.next();

            System.out.print("Insert Patient Date of birth : ");
            String dateOfBirth = input.next();

            System.out.print("Insert Patient phone number : ");
            String phone = input.next();

            System.out.print("Insert Patient Email : ");
            String email = input.next();

            System.out.print("Insert Patient histroy : ");
            String histroy = input.next();
            Patient newPatient = new Patient(Id,Name,dateOfBirth,phone,email,histroy);
            Patient.add(newPatient);
        }

    public void update_Doctor(Tree a , int id){
        // search about id
        NodeTree s = a.find(id);
        if(s == null) {System.out.println("--------- ------  Doctor Not found");}
        else{
            Doctor req = (Doctor)s.data;
            // show data in ID
            System.out.println("Name is : "+req.name);
            System.out.println("date of birth is : "+req.dataBirth);
            System.out.println("phone number is : "+req.phone);
            System.out.println("email is : "+req.Email);
            System.out.println("Departemtn is : "+req.Departemtn);

            // change in data
            System.out.println("To update doctor INFO");
            System.out.print("Insert Doctor Name : ");
            req.name = input.next();
            System.out.print("Insert Doctor Date of birth : ");
            req.dataBirth = input.next();
            System.out.print("Insert Doctor phone number : ");
            req.phone = input.next();
            System.out.print("Insert Doctor Email : ");
            req.Email = input.next();
            System.out.print("Insert Doctor Departemt : ");
            req.Departemtn = input.next();
        }

    }
    public void update_Patient(Tree a,int id){
        NodeTree s = a.find(id);
        if(s == null) {System.out.println("--------- ------  Doctor Not found");}
        else{
            // search about id
            Patient req = (Patient) s.data;
            // show data in ID
            System.out.println("Name is : "+req.name);
            System.out.println("date of birth is : "+req.dataBirth);
            System.out.println("phone number is : "+req.phone);
            System.out.println("email is : "+req.Email);
            System.out.println("HistoryDisease is : "+req.historyDisease);

            // change in data
            System.out.println("To update Patient INFO");
            System.out.print("Insert Patient Name : ");
            req.name = input.next();
            System.out.print("Insert Patient Date of birth : ");
            req.dataBirth = input.next();
            System.out.print("Insert Patient phone number : ");
            req.phone = input.next();
            System.out.print("Insert Patient Email : ");
            req.Email = input.next();
            System.out.print("Insert Patient Departemt : ");
            req.historyDisease = input.next();
        }

    }
    public void delete_Doctor(Tree a , int id){
      a.delete(a.root , id);
    }
    public void delete_Patient(Tree a , int id){
        a.delete(a.root ,id);
    }

}
