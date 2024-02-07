package ru.gb;

import com.google.gson.Gson;
import ru.gb.domain.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Tom", "Ford", 30);

        //System.out.println("An object: " + ToStringBuilder.reflectionToString(person));


        String jsonPerson = new Gson().toJson(person);
        System.out.println("After serialization: " + jsonPerson);

        Person deserializedPerson  = new Gson().fromJson(jsonPerson, Person.class);
        System.out.println("After deserialization: " + deserializedPerson);
    }
}