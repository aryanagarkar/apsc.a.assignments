//Arya Nagarkar
//AP computer science A
//Mr. Woffindin
//3-6-29
//Inheritance project
package assignments.personinheritence;

import java.util.ArrayList;

public class Teacher extends HumanBeing implements IEducator {

    private int GradeTaught;

    private String SchoolTaught;

    private ArrayList<String> CoursesTaught;

    public Teacher() {
        super();
        this.GradeTaught = 0;
        this.SchoolTaught = "";
    }

    public Teacher(String name, int age, int grade, String school, String gender) {
        super(name, age, gender);
        this.GradeTaught = grade;
        this.SchoolTaught = school;
    }

    public int getGradeTaught() {
        return GradeTaught;
    }

    public void setGradeTaught(int grade) {
        this.GradeTaught = grade;
    }

    public String getSchoolTaught() {
        return SchoolTaught;
    }

    public void setSchoolTaught(String school) {
        this.SchoolTaught = school;
    }

    public void addCourseTaught(String course) {
        CoursesTaught.add(course);
    }

    public void getCoursesTaught() {
        for (int i = 0; i < CoursesTaught.size(); i++) {
            System.out.print(CoursesTaught.get(i) + ", ");
        }
    }

    public String ToString() {
        return "This is " + getName() + " and is in " + GradeTaught + "th grade"
                + " and goes to " + SchoolTaught;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            if (obj.equals(this)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
