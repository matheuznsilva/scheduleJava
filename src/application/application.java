package application;
import java.util.List;
import java.util.Scanner;

import entities.user;
import exceptions.domineException;
import exceptions.emailInvalidException;
import entities.birthday;
import entities.commitment;
import entities.meeting;
import entities.schedule;
import entities.task;


public class application {

    static user[] Users = new user[1000];
    static int numUsers = 0;

    public static void main(String[] args){
        boolean execution = true;

        Scanner sc = new Scanner(System.in);    // inicia a variável que recebe informações do teclado 

        while(execution){
            System.out.println("============= MENU =============");
            //System.out.println("| 1 - LOGIN                    |");
            //System.out.println("| 2 - NEW USER                 |");
            //System.out.println("| 3 - REMOVE USER              |");
    	    //System.out.println("| 4 - SHOW USER LIST           |");
            System.out.println("| 1 - NEW USER                 |");
            System.out.println("| 2 - INSERT MEETING           |");
            System.out.println("| 3 - INSERT TASK              |");
            System.out.println("| 4 - INSERT BIRTHDAY          |");
    	    System.out.println("| 5 - SHOW USER LIST           |");
    	    System.out.println("| 6 - PRINT SCHEDULE           |");
    	    System.out.println("|                              |");
    	    System.out.println("| 0 - EXIT                     |");
            System.out.println("================================");
            System.out.print("ENTER YOUR CHOICE: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:{
                    addUser();
                    break;
                }
                case 2:{
                    addMeeting();
                    break;
                }
                case 3:{
                    addTask();
                    break;
                }
                case 4:{
                    addBirthday();
                    break;
                }
                case 5:{
                    listUser();
                    break;
                }
                case 6:{
                    printSchedule();
                    break;
                }
                case 0:{
                    execution = false;
                    break;
                }
                default:{
                    System.out.println("INVALID OPTION");
                }
            }
        }
        sc.close();
    }

    public static void printSchedule(){
        System.out.println("====== SHOW THE SCHEDULE =======");
        System.out.print("ENTER WITH USER ID: ");
        Scanner sc = new Scanner(System.in);
        Integer idUser = sc.nextInt();
        List<commitment> Commitments = Users[idUser].getSchedule().getCommitments();
        for(int i = 0; i<Commitments.size(); i++){
            System.out.println(Commitments.get(i).toString());
        }
        sc.close();
    }
    
    public static void listUser(){
        for(int i = 0; i<numUsers; i++){
            user User = Users[i];
            System.out.println(User.toString());
        }
    }

    public static void addUser(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== REGISTER A NEW USER ======");
		System.out.print("NAME: ");
		String name = sc.nextLine();
        System.out.print("EMAIL: ");
		String email = sc.nextLine();

        try{
            user User = new user();
            User.setNameUser(name);
            User.setEmailUser(email);
            Users[numUsers++] = User;
        } catch(emailInvalidException | domineException e){
            System.out.println("INVALID EMAIL");
        }
        sc.close();
    }

    public static void addMeeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======== INSERT MEETING ========");
        System.out.println();
        
        System.out.print("ENTER WITH USER ID");
        Integer userID = sc.nextInt();
        
        System.out.print("SUBJECT: ");
        String subject = sc.nextLine();
        
        System.out.print("START TIME: ");
        Integer startTime = sc.nextInt();
        
        System.out.print("END TIME: ");
        Integer endTime = sc.nextInt();
        
        System.out.print("LOCAL: ");
        String local = sc.nextLine();
        
        System.out.print("IS YOUR PRESENCE MANDATORY?: ");
        Boolean presence = sc.nextBoolean();

        meeting Meetings = new meeting();
        Meetings.setSubject(subject);
        Meetings.setStartTime(startTime);
        Meetings.setEndTime(endTime);
        Meetings.setLocal(local);
        Meetings.setPresence(presence);

        user User = Users[userID];
        schedule Schedule = User.getSchedule();
        Schedule.addCommitment(Meetings);
        sc.close();
    }

    public static void addBirthday(){
        Scanner sc = new Scanner(System.in);
        System.out.println("======= INSERT BIRTHDAY ========");
        System.out.println();
        
        System.out.print("ENTER WITH USER ID");
        Integer userID = sc.nextInt();
        
        System.out.print("SUBJECT: ");
        String subject = sc.nextLine();
        
        System.out.print("START TIME: ");
        Integer startTime = sc.nextInt();
        
        System.out.print("END TIME: ");
        Integer endTime = sc.nextInt();

        System.out.print("LOCAL: ");
        String local = sc.nextLine();
        
        System.out.print("BIRTHDAY PERSON: ");
        String birthdayPerson = sc.nextLine();

        birthday Birthday = new birthday();
        Birthday.setSubject(subject);
        Birthday.setStartTime(startTime);
        Birthday.setEndTime(endTime);
        Birthday.setLocal(local);
        Birthday.setBirthdayPerson(birthdayPerson);

        user User = Users[userID];
        schedule Schedule = User.getSchedule();
        Schedule.addCommitment(Birthday);
        sc.close();
    }
    
    public static void addTask(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========= INSERT TASK ==========");
        System.out.println();
        
        System.out.print("ENTER WITH USER ID");
        Integer userID = sc.nextInt();
        
        System.out.print("SUBJECT: ");
        String subject = sc.nextLine();
        
        System.out.print("START TIME: ");
        Integer startTime = sc.nextInt();
        
        System.out.print("END TIME: ");
        Integer endTime = sc.nextInt();
        
        System.out.print("EFFORT: ");
        Integer effort = sc.nextInt();
        
        System.out.print("PRIORITY: ");
        Integer priority = sc.nextInt();

        task Task = new task();
        Task.setSubject(subject);
        Task.setStartTime(startTime);
        Task.setEndTime(endTime);
        Task.setEffort(effort);
        Task.setPriority(priority);

        user User = Users[userID];
        schedule Schedule = User.getSchedule();
        Schedule.addCommitment(Task);
        sc.close();
    }
    
}