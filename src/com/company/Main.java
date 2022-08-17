package com.company;

import java.util.Scanner;
import java.util.function.DoublePredicate;

public class Main {

    public static void main(String[] args) {
        Tree Doctor = new Tree();
        Tree Patient = new Tree();
        LinkedList ReservationsGroup = new LinkedList();
        Stack Boold = new Stack();
        HumanResources M1 = new HumanResources();
        ReservationManag RM = new ReservationManag();
        Financial FM = new Financial();

        Scanner ss = new Scanner(System.in);
        int n = 0;
        while (n != 5) {
            System.out.println("---- Medical Clinic Function ----" +
                    "\n 1.Human Resources" +
                    "\n 2.Reservations " +
                    "\n 3.Financial management" +
                    "\n 4.Boold Units" +
                    "\n 5.Exit.");
            System.out.print("Enter the option number: ");
            n = ss.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Choose the operation you will perform^__^" +
                            " \n 1.Add Doctor." +
                            " \n 2.add Patient. " +
                            "\n  3.update Doctor." +
                            " \n 4.update Patient." +
                            " \n 5.delete Doctor. " +
                            "\n 6.delete Patient. " +
                            "\n 7. Exist.");
                    int PHum = ss.nextInt();
                    while (PHum != 7) {
                        switch (PHum) {
                            case 1: {
                                M1.add_Doctor(Doctor);
                                break;
                            }
                            case 2: {
                                M1.add_Patient(Patient);
                                break;
                            }
                            case 3: {
                                System.out.print("Insert Id Doctor : ");
                                int req_ID = ss.nextInt();
                                M1.update_Doctor(Doctor, req_ID);
                                break;
                            }
                            case 4: {
                                System.out.print("Insert Id Patient : ");
                                int req_ID = ss.nextInt();
                                M1.update_Patient(Patient, req_ID);
                                break;
                            }
                            case 5: {
                                int name = ss.nextInt();
                                M1.delete_Doctor(Doctor, name);
                                break;
                            }
                            case 6: {
                                int name = ss.nextInt();
                                M1.delete_Patient(Patient, name);
                                break;
                            }
                            default:
                                System.out.println("Wrong Insert ... ");
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    System.out.println("Choose the operation you will perform" +
                            " \n 1.Adding a reservation" +
                            " \n 2.Search_Reservat" +
                            " \n 3.delete_reservation" +
                            "\n 4.Dequeue to Doctor" +
                            "\n 5.Exit");
                    int PHum = ss.nextInt();
                    while (PHum != 5) {
                        switch (PHum) {
                            case 1: {
                                RM.addResevation(ReservationsGroup, Doctor);
                                break;
                            }
                            case 2: {
                                String name = ss.next();
                                RM.Search_Reservat(name, ReservationsGroup);
                                break;
                            }
                            case 3: {
                                int id = ss.nextInt();
                                RM.delete_reservation(id, ReservationsGroup);
                                break;
                            }
                            case 4: {
                                int id = ss.nextInt();
                                RM.dequeue_doctor(id, Doctor);
                                break;
                            }
                            case 5: {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Choose the operation you will perform" +
                            " \n 1.Salary Doctor" +
                            " \n 2.View Budgut of Clinic " +
                            " \n 3.deleting a reservation" +
                            " \n 4.Exit.");
                    int PHum = ss.nextInt();
                    while (PHum != 4) {
                        switch (PHum) {
                            case 1: {
                                System.out.println("Enter Id Doctor");
                                int id = ss.nextInt();
                                System.out.println("Salary Doctor = " + FM.salary_Doctor(id, Doctor));
                                break;
                            }
                            case 2: {
                                System.out.println("View Budgut:" + FM.View_Budgut(ReservationsGroup));
                                break;
                            }
                            case 3: {
                                break;
                            }
                        }
                        break;
                    }
                }
                case 4: {
                    System.out.println("Choose number :" +
                            "\n 1. Push boold." +
                            "\n 2. Pop blood " +
                            "\n 3. Peek Blood" +
                            "\n 4.Exit");
                    System.out.print("Enter Number of function : ");
                    int number = ss.nextInt();
                    while (number != 4) {
                        switch (number) {
                            case 1: {
                                RM.push_blood(Boold);
                                break;
                            }
                            case 2: {
                                RM.pop_blood(Boold);
                                break;
                            }
                            case 3: {
                                Boold.peek().printBoold();
                                break;
                            }
                            case 4: {
                                break;
                            }
                        }
                        break;
                    }
                  break;
                }
                case 5: {
                    System.exit(0);
                }

            }
        }
    }
}





