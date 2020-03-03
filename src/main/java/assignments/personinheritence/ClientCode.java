package assignments.personinheritence;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arya
 */
public class ClientCode {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<HumanBeing> people = new ArrayList<HumanBeing>();
        Scanner scanner = new Scanner(System.in);

        HumanBeing p1 = new HumanBeing();
        HumanBeing p2 = new HumanBeing();

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        people.add(p1);
        people.add(p2);
        people.add(t1);
        people.add(t2);

        TakeUserInput(people, scanner);
        System.out.println();
        System.out.println("Result:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).ToString());
        }

        for (int j = 0; j < people.size(); j++) {
            System.out.println("Name of Person number " + j + ":" + people.get(j).getName());
            System.out.println("Age of Person number " + j + ":" + people.get(j).getAge());
            if (people.get(j) instanceof Teacher) {
                System.out.println("Grade of Person number " + j + ":" + ((Teacher) (people.get(j))).getGradeTaught());
                System.out.println("School of Person number " + j + ":" + ((Teacher) (people.get(j))).getSchoolTaught());
            }
        }

        t1.addFriend("Balen");
        t1.addFriend("Aidan");
        t1.addFriend("Ryan");
        t1.addFriend("Ally");
        System.out.println("This is a list of " + t1.getName() + "'s friends:");
        t1.getFriends();

        t1.addCourseTaught("Computer science");
        t1.addCourseTaught("Math");
        System.out.println("This is a list of thee courses " + t1.getName() + " teaches:");
        t1.getCoursesTaught();

        boolean equal = t1.equals(t2);
        if (equal == false) {
            System.out.println("s1 is not equal to s2");
        } else {
            System.out.println("s1 is equal to s2");
        }

        Teacher Sally = new Teacher("Sally", 27, 10, "Big picture", "girl");
        System.out.println();
        Sally.getType();
        Sally.getDepartment();
    }

    /**
     *
     * @param peopleList
     * @param scanner
     */
    public static void TakeUserInput(final ArrayList<HumanBeing> peopleList, Scanner scanner) {
        int count = 0;
        for (HumanBeing person : peopleList) {
            System.out.println("Person number " + count++ + ":");
            System.out.println();
            System.out.println("What's this person's name?");
            String name = scanner.next();
            person.setName(name);
            System.out.println("What's this person's age?");
            int age = scanner.nextInt();
            person.setAge(age);
            System.out.println("What's this person's gender?");
            String gender = scanner.next();
            person.setGender(gender);
            if (person instanceof Teacher) {
                System.out.println("What's the grade this person teaches?");
                int gradeTaught = scanner.nextInt();
                ((Teacher) person).setGradeTaught(gradeTaught);
                System.out.println("What's the school this person teaches?");
                String schoolTaught = scanner.next();
                ((Teacher) person).setSchoolTaught(schoolTaught);
            }
            System.out.println();
        }
    }

}
