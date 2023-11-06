public class University {
    private String universityName; // аты
    private String direction;  // напр
    private int passingGrade;  // проходной б
    private int trainingPeriod;  // период об
    public University(String universityName, String direction, int passingGrade, int trainingPeriod){
        this.universityName = universityName;
        this.direction = direction;
        this.passingGrade = passingGrade;
        this.trainingPeriod = trainingPeriod;

    }
    public University(){}
    public String getUniversityName(){
        return universityName;
    }
    public void setUniversityName(String consol){
        this.universityName = consol;
    }
    public String getDirection(){
        return direction;
    }
    public void setDirection(String cons){
        this.direction = cons;
    }
    public int getPassingGrade(){
        return passingGrade;
    }
    public void setPassingGrade(int con){
        this.passingGrade = con;
    }
    public int getTrainingPeriod(){
        return trainingPeriod = trainingPeriod;
    }
    public void setTrainingPeriod(int co){
        this.trainingPeriod = co;
    }
}
