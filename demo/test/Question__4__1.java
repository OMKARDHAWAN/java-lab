package com.demo.test;

import java.util.Scanner;
import com.demo.model.*;
import com.demo.service.*;

public class Question__4__1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TeamService service = new TeamServiceImpl();

        while (true) {
            System.out.println("\n1.Add Team");
            System.out.println("2.Delete Team");
            System.out.println("3.Delete Player");
            System.out.println("4.Display Batsman");
            System.out.println("5.Display By Speciality");
            System.out.println("6.Add Player");
            System.out.println("7.Update Coach");
            System.out.println("8.Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Team ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Team Name: ");
                    String tname = sc.nextLine();

                    System.out.print("Enter Coach Name: ");
                    String cname = sc.nextLine();

                    service.addTeam(new Team(tid, tname, cname));
                    break;

                case 2:
                    System.out.print("Enter Team ID to delete: ");
                    service.deleteTeam(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Team ID: ");
                    int tId = sc.nextInt();
                    System.out.print("Enter Player ID: ");
                    int pId = sc.nextInt();
                    service.deletePlayer(tId, pId);
                    break;

                case 4:
                    service.displayBatsman();
                    break;

                case 5:
                    System.out.print("Enter speciality: ");
                    sc.nextLine();
                    String sp = sc.nextLine();
                    service.displayBySpeciality(sp);
                    break;

                case 6:
                    System.out.print("Enter Team ID: ");
                    int teamId = sc.nextInt();
                    System.out.print("Enter Player ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Player Name: ");
                    String pname = sc.nextLine();

                    System.out.print("Enter Speciality: ");
                    String spec = sc.nextLine();

                    service.addPlayer(teamId, new Player(pid, pname, spec));
                    break;

                case 7:
                    System.out.print("Enter Team ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Coach Name: ");
                    String coach = sc.nextLine();

                    service.updateCoach(id, coach);
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }
}