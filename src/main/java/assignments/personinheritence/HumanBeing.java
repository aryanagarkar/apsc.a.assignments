package assignments.personinheritence;

import java.util.ArrayList;

/**
 *
 * @author arya
 */
public class HumanBeing implements ILivingBeing {

    private String Name;
    private String Gender;
    private int Age;
    private ArrayList<String> Friends;

    /**
     *
     * @param name
     * @param age
     * @param gender
     */
    public HumanBeing(String name, int age, String gender) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
    }

    /**
     *
     */
    public HumanBeing() {
        this.Name = "";
        this.Age = 0;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.Name = name;
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.Gender = gender;
    }

    /**
     *
     * @return age
     */
    public int getAge() {
        return Age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.Age = age;
    }

    /**
     *
     */
    public void getFriends() {
        for (int i = 0; i < Friends.size(); i++) {
            System.out.print(Friends.get(i) + ", ");
        }
    }

    /**
     *
     * @param friend
     */
    public void addFriend(String friend) {
        Friends.add(friend);
    }

    /**
     *
     * @return string describing this object
     */
    public String ToString() {
        return "This is " + Name + " and is " + Age + " years old.";
    }

    /**
     *
     * @return type of this object
     */
    public String getType() {
        return "HumanBeing";
    }
}
