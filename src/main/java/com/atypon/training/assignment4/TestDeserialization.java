package com.atypon.training.assignment4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class TestDeserialization {

    public static void main(String[] args) {
        Person person ;
        try(FileInputStream fileInputStream = new FileInputStream("SerializableFile.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            person = (Person) objectInputStream.readObject();
            System.out.println(person);
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
