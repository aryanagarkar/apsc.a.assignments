package assignments.personinheritence;

import java.util.ArrayList;

/**
 *
 * @author arya
 */
public class Teacher extends HumanBeing implements IEducator {

    private int GradeTaught;
    private String SchoolTaught;
    private ArrayList<String> CoursesTaught;

    /**
     *
     */
    public Teacher() {
        super();
        this.GradeTaught = 0;
        this.SchoolTaught = "";
    }

    /**
     *
     * @param name
     * @param age
     * @param grade
     * @param school
     * @param gender
     */
    public Teacher(String name, int age, int grade, String school, String gender) {
        super(name, age, gender);
        this.GradeTaught = grade;
        this.SchoolTaught = school;
    }

    /**
     *
     * @return grade taught
     */
    public int getGradeTaught() {
        return GradeTaught;
    }

    /**
     *
     * @param grade
     */
    public void setGradeTaught(int grade) {
        this.GradeTaught = grade;
    }

    /**
     *
     * @return school taught
     */
    public String getSchoolTaught() {
        return SchoolTaught;
    }

    /**
     *
     * @param school
     */
    public void setSchoolTaught(String school) {
        this.SchoolTaught = school;
    }

    /**
     *
     * @param course
     */
    public void addCourseTaught(String course) {
        CoursesTaught.add(course);
    }

    /**
     *
     */
    public void getCoursesTaught() {
        for (int i = 0; i < CoursesTaught.size(); i++) {
            System.out.print(CoursesTaught.get(i) + ", ");
        }
    }

    /**
     *
     * @return a string describing this object
     */
    public String ToString() {
        return "This is " + getName() + " and is in " + GradeTaught + "th grade"
                + " and goes to " + SchoolTaught;
    }

    /**
     *
     * @param obj
     * @return whether the two objects are equal
     */
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            if (obj.equals(this)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /**
     *
     * @return type of this object
     */
    public String getType() {
        return "Teacher";
    }

    /**
     *
     * @return department of this object
     */
    public String getDepartment() {
        return "Department of education";
    }
}
