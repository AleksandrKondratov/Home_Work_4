package college.people;

public class Main {
    public static void main(String[] args) {
        Person variant = new Person("Coach Bob", 27, "M");
        Teacher variant2 = new Teacher("Duke Java",34,"M",50000.0,"Computer Science");
        Student variant3 = new Student("Lynne Brooke",16, "F", "HS95129", 3.5);
        CollegeStudent variant4 = new CollegeStudent("Ima Frosh",18,"F","UCB123",4.0,1,"English");
        Person mas [] = new Person[4];
        mas [0] = variant;
        mas [1] = variant2;
        mas [2] = variant3;
        mas [3] = variant4;
        for (Person i : mas) {
            System.out.println(i.toString());
        }
    }
}
