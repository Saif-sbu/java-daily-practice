package model;
import java.util.Arrays;
public class StudentManager {
    private Student[] students = new Student[10];
    private int size = 0;
    
    private void resize(){
        if (size == students.length){
            students = Arrays.copyOf(students, students.length*2);
        }
    }

    public StudentManager(){
    }

    public int getSize(){
        return size;
    }

    public void addStudent(Student student){
        resize();
        students[size] = student;
        size++;
    }

    public String getStudentReport(){
        if (size == 0){
            return "No students";
        }
        String report = "";
        for (int i = 0; i < size; i++){
            report += students[i].getId() + " ";
            report += students[i].getName() + " ";
            report += students[i].getScore() + "\n";
        }
        return report;
    }

    public double getAverageScore(){
        if (size == 0){
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < size; i++){
            sum += students[i].getScore();
        }
        return sum / size;
    }
    public int getHighestScore(){
        if (size == 0){
            return 0;
        }
        int high = students[0].getScore();
        for (int i = 1; i < size; i++){
            if (students[i].getScore()  > high){
                high = students[i].getScore();
            }
        }
        return high;
    }
    public static void main(String[] args){

        Student[] students = {
            new UndergraduateStudent(113, "Darah", 98, "Freshman"),
            new UndergraduateStudent(114, "Lily", 95, "Junior"),
            new UndergraduateStudent(115, "Sophia", 94, "Sophomore"),
            new GraduateStudent(116, "Rosalie", 92, "Quantum Mechanics"),
            new GraduateStudent(117, "Isabella", 91, "Phonetics")
        };

        for (int i = 0; i < 5; i++){
            System.out.println(students[i].display());
        }
    }
}
