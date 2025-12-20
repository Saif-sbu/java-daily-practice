import java.util.Scanner;
public class Main{
    public static void main(String[] args){ 
        Scanner input = new Scanner(System.in);
        int choice;
        int[] data = new int[10];
       do{
        System.out.println("======= MENU =======");
        System.out.print("1. Add item\n2. View items\n3. Simple calculation\n4. Exit");
        System.out.print("\n=====================");
        System.out.print("\nEnter choice: (Only a number)");
        choice = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Adding item...");
                addItem(data);
                break;
            case 2:
                System.out.println("Viewing item...");
                viewItem(data);
                break;
            case 3:
                System.out.println("Calculating...");
                System.out.println(simpleCalc(data));
                break;
            case 4:
                System.out.println("Exiting...");
                System.out.println(exit());
                break;
            default:
                System.out.println("Invalid input. Please try again.");
            
        }
       } while (choice != 4);
       input.close();
    
    }

    public static void addItem(int[] data){
        int size = 0;
        System.out.println("Add numbers (only integers for now) in a single line with space between them. To stop, write anything beside a number");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            if (size == data.length){
                int[] c = new int[data.length*2];
                System.arraycopy(data, 0, c, 0, data.length);
                data = c;
            }
            data[size] = input.nextInt();
            size++;
        }

    }

    public static String checkZeroes(int[] data){
        for (int i : data){
            if (i != 0){
                return "Some elements were added.";
            }
        }
        return "No items were added.";
    }
    public static void viewItem(int[] data){
        String str = checkZeroes(data);
        if (str.equals("No items were added.")){
            System.out.println(str);
        } else {
            for (int i = 0; i < data.length; i++){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Items viewed.");
    }

    public static int simpleCalc(int[] data){
        int sum = 0;
        for (int i = 0; i < data.length; i++){
            sum += data[i];
        }
        return sum;
    }

    public static String exit(){
        return "Goodbye!!";
    }

}