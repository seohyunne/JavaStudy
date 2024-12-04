package Lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lamda5 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Person p1 = new Person(1,"홍길동",30);
        Person p2 = new Person(1,"박성철",20);
        Person p3 = new Person(1,"허준석",50);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.forEach(person -> System.out.println(person));

        // 나이순 정렬
        Collections.sort(people,(pp1,pp2)-> pp1.getAge()- pp2.getAge());
        people.forEach(person -> System.out.println(person));

        Collections.sort(people,(pp1,pp2)-> pp1.getName().compareTo(pp2.getName()));
        people.forEach(person -> System.out.println(person));
    }
}



class Person{

    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name  +
                ", age=" + age;
    }

}
