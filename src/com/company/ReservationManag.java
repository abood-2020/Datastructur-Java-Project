package com.company;

import javax.print.Doc;
import java.util.Scanner;

public class ReservationManag {

    public void addResevation(LinkedList s,Tree a){
        Scanner input = new Scanner(System.in);
        System.out.print("Insert ID : ");
        int id = input.nextInt();
        System.out.print("Insert patient Name : ");
        String Name = input.next();

        System.out.print("Insert Doctor ID : ");
        int idDoctor = input.nextInt();

        System.out.print("Insert Doctor date : ");
        String date = input.next();

        System.out.print("Insert amount Reservation   : ");
        int prices = input.nextInt();

        Reservation newReservation = new Reservation(id,Name,idDoctor,date,prices);
        s.addLast(newReservation);
        if(a.find(idDoctor) == null) {
            System.out.println("Doctor not found");
        }
        else{
            NodeTree sss = a.find(idDoctor);
            Doctor req = (Doctor)sss.data;
            req.ReservtTodeay.addQueue(newReservation);
            req.Reservation.addLast(newReservation);
            s.addLast(newReservation);
        }

    }
    public void dequeue_doctor(int id , Tree deq){

        Doctor Req = (Doctor)deq.find(id).data;
        if(Req == null) System.out.println("Doctor has not found");
        else{
            Req.ReservtTodeay.dequeue();
            System.out.println("Success Delete");
        }
    }
    public void delete_reservation(int id,LinkedList<Reservation> res){
        NodeLinked<Reservation> current = res.head;
        Object o = null;
        while(current != null){
            if(current.data.ID == id){
                 o = current;
            }
            else{
                current = current.next;
            }
        }
        if(o != null ){
            res.delete(o);
            System.out.println("Success Delete");
        }
        else {
            System.out.println("Reservation Not null");
        }
    }
    public void Search_Reservat(String namePatient , LinkedList<Reservation> res){
        NodeLinked<Reservation> current = res.head;
        Reservation req = null;
        while(req!=null){
            if(current.data.name_patient == namePatient){
                req = current.data;
            }
            else{
                current = current.next;
            }
        }
        if(req == null) System.out.println("This Reservation has not found");
        else{
            System.out.println("Infromation Reservation : ");
            req.print_Reservation();
        }

    }
    public void push_blood(Stack ss){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id = s.nextInt();
        System.out.print("Enter Name : ");
        String name = s.next();
        System.out.print("Enter Number Unit : ");
        int unit = s.nextInt();
        DonateBlood blood = new DonateBlood(id,name,unit);
        ss.push(blood);
    }
    public void pop_blood(Stack s){
        s.pop();
    }
    public void peek(Stack s){
        s.peek();
    }

}

