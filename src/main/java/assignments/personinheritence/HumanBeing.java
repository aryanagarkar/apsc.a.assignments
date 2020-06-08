//Arya Nagarkar
//AP computer science A
//Mr. Woffindin
//3-6-29
//Inheritance project
package assignments.personinheritence;

import java.util.ArrayList;

public class HumanBeing implements ILivingBeing {

    private String Name;

    private String Gender;

    private int Age;

    private ArrayList<String> Friends;

    public HumanBeing(String name, int age, String gender) {
        this.Name = name;
        this.Age = age;
        this.Gender = gender;
    }

    public HumanBeing() {
        this.Name = "";
        this.Age = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void getFriends() {
        for (int i = 0; i < Friends.size(); i++) {
            System.out.print(Friends.get(i) + ", ");
        }
    }

    public void addFriend(String friend) {
        Friends.add(friend);
    }

    public String ToString() {
        return "This is " + Name + " and is " + Age + " years old.";
    }

    public String GetSpecies() {
        return "Homo sapien";
    }
}
