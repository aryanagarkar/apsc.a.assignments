package assignments.personinheritence;

import java.util.ArrayList;

//Person class
public class Person {

    private String Name;
    private int Age;
    private ArrayList<String> Friends;

    public Person(String name, int age) {
        this.Name = name;
        this.Age = age;
    }

    public Person() {
        this.Name = "";
        this.Age = 0;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }
    
    public void getFriends(){
        for(int i = 0; i < Friends.size(); i++){
            System.out.print(Friends.get(i) + ", ");
        }
    }

    public void addFriend(String friend) {
        Friends.add(friend);
    }

    public String ToString() {
        return "This is " + Name + " and is " + Age + " years old.";
    }
}
