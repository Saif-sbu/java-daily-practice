import java.util.Scanner;
import model.Storage;
public class Main {
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        int choice = 0;
        Storage storage = new Storage();
       do{
        System.out.println("======= MENU =======");
        System.out.print("1. Add item\n2. View items\n3. Simple calculation\n4. Exit");
        System.out.print("\n=====================\nEnter choice: (Only a number)");
        if (!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number.");
            input.next();
            continue;
        }
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Adding item:");
                System.out.println("Enter only integers (-1 to stop):");
                while (true){
                    if (!input.hasNextInt()){
                        System.out.println("Invalid input. Please enter an integer.");
                        input.next();
                        continue;
                    }
                    int v = input.nextInt();
                    if (v == -1){
                        break;
                    }
                    storage.add(v);
                }    
                System.out.println("Added item");
                break;
            case 2:
                System.out.println("Viewing item:");
                storage.getValues();
                System.out.println("Items viewed");
                break;
            case 3:
                System.out.println("Calculating:");
                System.out.println(storage.simpleCalc());
                System.out.println("Calculation complete.");
                break;
            case 4:
                System.out.println("Exiting..." + exit());
                break;
            default:
                System.out.println("Invalid input. Please try again.");
            
        }
       } while (choice != 4);
       input.close();
    
    }

    public static String exit(){
        return "Goodbye!!";
    }

}