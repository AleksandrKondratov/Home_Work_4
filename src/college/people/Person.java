package college.people;

public class Person {
    private String name = null;
    private int age = 0;
    private String gender = null;

    @Override
    public String toString(){
        String rez = "name="+name+" age="+age+" gender="+gender;
        return rez;
    };

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
