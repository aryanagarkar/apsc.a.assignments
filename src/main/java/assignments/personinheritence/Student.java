package assignments.personinheritence;

import java.util.ArrayList;

//Student class
public class Student extends Person implements HumanBeing {

    private int Grade;
    private String School;
    private String Gender;
    private ArrayList<String> Courses;

    public Student() {
        super();
        this.Grade = 0;
        this.School = "";
    }

    public Student(String name, int age, int grade, String school) {
        super(name, age);
        this.Grade = grade;
        this.School = school;
    }
    
     public Student(String name, int age, int grade, String school, String gender) {
        super(name, age);
        this.Grade = grade;
        this.School = school;
        this.Gender = gender;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        this.Grade = grade;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        this.School = school;
    }

    public void addCourse(String course) {
        Courses.add(course);
    }

    public void getCourses(){
        for(int i = 0; i < Courses.size(); i++){
            System.out.print(Courses.get(i) + ", ");
        }
    }
    
    public String ToString() {
        return "This is " + getName() + " and is in " + Grade + "th grade"
                + " and goes to " + School;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            if (obj.equals(this)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String introduceYourself() {
        return "Hi, my name is " + getName() + "and I am in " + Grade
                + "th grade at " + School;
    }
    
    public void gender(){
        System.out.println("I'm a " + Gender);
    }
}
