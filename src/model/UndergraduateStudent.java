package model;
public class UndergraduateStudent extends Student {
    private String year;
    public UndergraduateStudent(){
        super();
    }
    public UndergraduateStudent(int id, String name, int score, String year){
        super(id, name, score);
        this.year = year;
    }

    public String getYear(){
        return year;
    }
    @Override
    public String generateReport(){
        return "ID: " + getId() + " Name: " + getName() + " Score: " + getScore() + " Year: " + getYear();
    }
    
}
