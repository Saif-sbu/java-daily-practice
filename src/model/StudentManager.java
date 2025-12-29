package model;
import java.util.Arrays;
import exceptions.InvalidScoreException;
import exceptions.EmptyStudentListException;
public class StudentManager {
    private Student[] students = new Student[10];
    private int size = 0;

    public StudentManager(){
    }

     private void resize(){
        if (size == students.length){
            students = Arrays.copyOf(students, students.length*2);
        }
    }
    
    public int getSize(){
        return size;
    }

    public void addStudent(Student student) throws InvalidScoreException {
        if (student.getScore() < 0 || student.getScore() > 100){
            throw new InvalidScoreException("Score must be between 0 and 100.");
        }
        resize();
        students[size] = student;
        size++;
    }

    public String getStudentReport() throws EmptyStudentListException{
        if (size == 0){
            throw new EmptyStudentListException("Students were not added.");
        }
        String report = "";
        for (int i = 0; i < size; i++){
            report += students[i].getId() + " ";
            report += students[i].getName() + " ";
            report += students[i].getScore() + "\n";
        }
        return report;
    }

    public double getAverageScore() throws EmptyStudentListException{
        if (size == 0){
            throw new EmptyStudentListException("Students were not added.");
        }
        return avgHelp(size-1);
    }
    public double avgHelp(int l){
        if (l < 0){
            return 0;
        }
        return avgHelp(l-1) + (double) students[l].getScore()/size;
    }

    public int getHighestScore() throws EmptyStudentListException{
        if (size == 0){
            throw new EmptyStudentListException("Students were not added.");
        }
        return highScoreHelp(0, students[0].getScore());
    }

    public int highScoreHelp(int index, int high){
        if (index == size){
            return high;
        }
        int highest = Math.max(students[index].getScore(), high);
        return highScoreHelp(index+1, highest);
    }
    /* 
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
        */

    

}
