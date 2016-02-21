package college.people;

public class Teacher extends Person {
    private double salary = 0.0;
    private String subject = null;

    public String toString(){
        String rez = super.toString()+" salary="+salary+" subject="+subject;
        return rez;
    }

    public Teacher(String name, int age, String gender, double salary, String subject) {
        super(name, age, gender);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
