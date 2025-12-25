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
        Student s1 = new Student(110, "Saif", 97);
        UndergraduateStudent s2 = new UndergraduateStudent(111, "Ashley", 95, "Sophomore");
        GraduateStudent s3 = new GraduateStudent(112, "Lindsay", 99, "Neuroaesthetics");
        StudentManager m = new StudentManager();
        m.addStudent(s1);
        m.addStudent(s2);
        m.addStudent(s3);
        System.out.println(m.getStudentReport());
        System.out.println("Average: " + m.getAverageScore());
        System.out.println("Highest: " + m.getHighestScore());
        System.out.println("Ashley's year: " + s2.getYear());
        System.out.println("Lindsay's research area: " + s3.getResearchArea());
    }

}
