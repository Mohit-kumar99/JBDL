package Assignment_2;

import java.util.ArrayList;
import java.util.Collections;

/*
Create a person class, it should contains the id, name, salary and age.
Make a ArrayList of this person class type and sort this array based on below criteria (Use Comparable interface)
  - Sort on the name, if the names are equal then sort on the basis of salary
 */
class Person implements Comparable<Person> {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Person(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Person other) {
        int nameCompare = this.name.compareTo(other.name);
        if (nameCompare == 0) {
            return Double.compare(this.salary, other.salary);
        } else {
            return nameCompare;
        }
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        // Create an ArrayList of Person objects
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1, "Ravi", 50000, 30));
        people.add(new Person(2, "Ashok", 60000, 25));
        people.add(new Person(3, "Mohit", 70000, 35));
        people.add(new Person(4, "Vishal", 40000, 28));


        Collections.sort(people);

        
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
