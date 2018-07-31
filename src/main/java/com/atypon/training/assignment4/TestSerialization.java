package com.atypon.training.assignment4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class TestSerialization {

    public static void main(String[] args) {
        //Create an instance of person and fill it with data
        Person person = new Person();
        person.setFirstName("Mohammad");
        person.setLastName("Abu Mayyaleh");
        person.setAge(20);
        person.setNotSerializedVariable("Not serialized data");
        //open the stream where the data will be put
        try (FileOutputStream fileOutputStream = new FileOutputStream("SerializableFile.txt");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);
            System.out.println("Object is successfully serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
