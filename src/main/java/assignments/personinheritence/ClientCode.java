package assignments.personinheritence;

import java.util.ArrayList;
import java.util.Scanner;

// Dummy comment
public class ClientCode {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        Scanner scanner = new Scanner(System.in);

        Person p1 = new Person();
        Person p2 = new Person();

        Student s1 = new Student();
        Student s2 = new Student();

        people.add(p1);
        people.add(p2);
        people.add(s1);
        people.add(s2);

        TakeUserInput(people, scanner);
        System.out.println();
        System.out.println("Result:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).ToString());
        }
        
        for(int j = 0; j < people.size(); j++){
            System.out.println("Name of Person number " + j + ":" + people.get(j).getName());
            System.out.println("Age of Person number " + j + ":" + people.get(j).getAge());
            if (people.get(j) instanceof Student) {
               System.out.println("Grade of Person number " + j + ":" + ((Student) (people.get(j))).getGrade());
               System.out.println("School of Person number " + j + ":" + ((Student) (people.get(j))).getSchool());
            }
        }
        
        s1.addFriend("Balen");
        s1.addFriend("Aidan");
        s1.addFriend("Ryan");
        s1.addFriend("Ally");
        System.out.println("This is a list of " + s1.getName() + "'s friends:");
        s1.getFriends();
        
        s1.addCourse("Spanish");
        s1.addCourse("P.E.");
        s1.addCourse("Drama");
        s1.addCourse("Computer science");
        s1.addCourse("Math");
        s1.addCourse("English");
        s1.addCourse("Biology");
        s1.addCourse("World history");
        System.out.println("This is a list of " + s1.getName() + "'s courses:");
        s1.getCourses();
        
        boolean equal = s1.equals(s2);
        if(equal == false){
            System.out.println("s1 is not equal to s2");
        }
        else{
            System.out.println("s1 is equal to s2");
        }
        
        Student Balen = new Student("Balen", 15, 10, "Big picture", "boy");
        System.out.println();
        Balen.introduceYourself();
        Balen.gender();
    }
    

    public static void TakeUserInput(ArrayList<Person> list, Scanner scanner) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Person number " + i + ":");
            System.out.println();
            System.out.println("What's this person's name?");
            String name = scanner.next();
            list.get(i).setName(name);
            System.out.println("What's this person's age?");
            int age = scanner.nextInt();
            list.get(i).setAge(age);
            if (list.get(i) instanceof Student) {
                System.out.println("What's this person's grade?");
                int grade = scanner.nextInt();
                ((Student) (list.get(i))).setGrade(grade);
                System.out.println("What's this person's school?");
                String School = scanner.next();
                ((Student) (list.get(i))).setSchool(School);
            }
            System.out.println();
        }
    }

}
