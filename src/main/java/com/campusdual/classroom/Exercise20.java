package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
List<Person> peopleList = new ArrayList<>();
peopleList.add(new Person("Javier" , "Prado"));
peopleList.add(new Teacher("Maria", "Fernandez", "Educacion"));
peopleList.add(new PoliceOfficer("Manuel", "Gimeno", "B-45"));
peopleList.add(new Doctor("Who", "Who", "Neurologia"));
return peopleList;
    }

    public static void showPeopleDetails(List<Person> people) {
for (Person person : people) {
    person.getDetails();
}
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }



}
