package college.people;

public class Student extends Person{
    private String idNumber = null;
    private double gpa = 0.0;

    public String toString(){
        String rez = super.toString()+" idNumber="+idNumber+" gpa="+gpa;
        return rez;
    }

    public Student(String name, int age, String gender, String idNumber, double gpa) {
        super(name, age, gender);
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
