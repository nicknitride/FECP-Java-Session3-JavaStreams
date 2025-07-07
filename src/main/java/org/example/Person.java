package org.example;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}'+"\n";
    }

}
