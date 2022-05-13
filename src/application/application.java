package application;
import java.util.List;
import entities.user;
import entities.birthday;
import entities.console;
import entities.meeting;
import entities.task;

public class application {

    static user[] Users = new user[1000];
    static int numUsers = 0;

    public static void main(){
        boolean execution = true;

        while(execution){
            System.out.println("============= MENU =============");
            System.out.println("| 1 - LOGIN                    |");
            System.out.println("| 2 - NEW USER                 |");
            System.out.println("| 3 - REMOVE USER              |");
    	    System.out.println("| 4 - SHOW USER LIST           |");
    	    System.out.println("|                              |");
    	    System.out.println("| 0 - EXIT                     |");
            System.out.println("================================");
            System.out.println("ENTER YOUR CHOICE: ");
            int option = Integer.parseInt(console.readLine());

            switch (option) {
                case 1:{
                    break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    break;
                }
                default:{
                    break;
                }
            }
            
        }
    }

    public static void printSchedule(){
        System.out.println("====== SHOW THE SCHEDULE =======");

    }
    
    
}