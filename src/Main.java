import java.util.Scanner;
public class Main{
    public static void main(String[] args){ 
        menu();
    }

    public static void menu(){
        Scanner input = new Scanner(System.in);
        int choice;
       do{
        System.out.println("======= MENU =======");
        System.out.print("1. Add item\n2. View items\n3. Simple calculation\n4. Exit");
        System.out.print("\n=====================");
        System.out.print("\nEnter choice: (Only a number)");
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Adding item...");
                System.out.println(addItem(5));
                break;
            case 2:
                System.out.println("Viewing item...");
                viewItem();
                break;
            case 3:
                System.out.println("Calculating...");
                System.out.println(simpleCalc(5));
                break;
            case 4:
                System.out.println("Exiting...");
                exit();
                break;
            default:
                System.out.println("Invalid input. Please try again.");
            
        }
       } while (choice != 4);
       input.close();
    }

    public static int addItem(int a){
        int score = a;
        return score;
    }

    public static void viewItem(){
        int newAdded = addItem(5);
        System.out.println(newAdded);
        if (newAdded == 0){
            System.out.println("No number added yet.");
        }
        System.out.println("Number added " + newAdded);
    }

    public static double simpleCalc(double a){
        return Math.pow(a, 2);
    }

    public static void exit(){
        System.out.println("Goodbye!!");
    }

}