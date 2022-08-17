package com.company;

public class Financial {

    public int salary_Doctor(int id,Tree deq){

        Doctor Req = (Doctor)deq.find(id).data;
        int salary = 0;
        if(Req == null) System.out.println("Doctor has not found");
        else{
          LinkedList<Reservation> workDoctor = Req.Reservation;
          NodeLinked<Reservation> current = workDoctor.head;
          while(current != null){
              salary += current.data.prices;
              current = current.next;
          }
        }
        return salary;
    }
    public int View_Budgut(LinkedList<Reservation> res){
        NodeLinked<Reservation> current = res.head;
        int budgut = 0;
        while(current != null){
            budgut = current.data.prices;
        }
        return budgut;
    }

}
