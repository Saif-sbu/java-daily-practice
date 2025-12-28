package model;

public abstract class Student implements Reportable {
    private int id;
    private String name;
    private int score;

    public Student(){
    }

    public Student(int id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }

    public String toString(){
        return generateReport();
    }
}

