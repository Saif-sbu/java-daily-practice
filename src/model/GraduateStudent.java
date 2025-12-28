package model;
public class GraduateStudent extends Student {
    private String researchArea;
    public GraduateStudent(){
        super();
    }
    public GraduateStudent(int id, String name, int score, String researchArea){
        super(id, name, score);
        this.researchArea = researchArea;
    }

    public String getResearchArea(){
        return researchArea;
    }

    @Override
    public String generateReport(){
        return "ID: " + getId() + " Name: " + getName() + " Score: " + getScore() + " Research Area: " + getResearchArea();
    }
}
