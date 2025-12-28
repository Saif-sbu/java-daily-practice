import java.util.Scanner;
import model.*;
public class StudentMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StudentManager students = new StudentManager();
        int choose;
        do {
            System.out.println("Select a year:\n1. Add Undergraduate\n2. Add Graduate\n3. View All students\n4. View average score\n5. View highest score\n6. Exit");
            choose = input.nextInt();
            if (choose == 1){
                System.out.print("ID: ");
                int id = input.nextInt();
                System.out.print("name: ");
                String name = input.next();
                System.out.print("score: ");
                int score = input.nextInt();
                System.out.print("year: ");
                String year = input.next();
                Student student = new UndergraduateStudent(id, name, score, year);
                students.addStudent(student);

            } else if (choose == 2) {
                System.out.print("ID: ");
                int id = input.nextInt();
                System.out.print("name: ");
                String name = input.next();
                System.out.print("score: ");
                int score = input.nextInt();
                System.out.print("Research Area: ");
                String area = input.next();
                Student student = new GraduateStudent(id, name, score, area);
                students.addStudent(student);

            } else if (choose == 3){
                System.out.println(students.getStudentReport());
            } else if (choose == 4){
                System.out.println(students.getAverageScore());
            } else if (choose == 5){
                System.out.println(students.getHighestScore());
            } else if (choose == 6){
                System.out.println("Exiting.");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choose != 6);
        input.close();
    }


}
