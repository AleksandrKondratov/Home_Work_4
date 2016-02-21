package college.people;

public class CollegeStudent extends Student{
    private int year = 0;
    private String major = null;

    public String toString(){
        String rez = super.toString()+" year="+year+" major="+major;
        return rez;
    }

    public CollegeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major) {
        super(name, age, gender, idNumber, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
