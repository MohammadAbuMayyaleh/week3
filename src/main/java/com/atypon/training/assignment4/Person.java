package com.atypon.training.assignment4;

import java.io.Serializable;

/**
 * Created by Mohammad Abu Mayyaleh on 7/30/18.
 */
public class Person implements Serializable {

    /*
    Serializable : an interface used to identify classes whose objects can be written to (i.e., serialized)
    or read from (i.e., deserialized) some type of storage (e.g., file on disk, database field)
    or transmitted across a network.
    */

    private static final long serialVersionUID = 12345L;
    /*
    we need serialVersionUID during deserialization to verify that the sender ( the person who serializes)
    and receiver ( the person who deserializes) of a serialized object have loaded classes for that object that are
    compatible with respect to serialization. In case a receiver has loaded a class for the object that
    has a different serialVersionUID than that used to serialize, then deserialization will end with InvalidClassException.
    */

    //Any primitive and String instance can be serialized
    private String firstName;
    private String lastName;
    private int age;

    /*
    Static fields are not serialized because they are connected with the class
    and not an instance of the object
    */
    private static String staticVariable;

    //Transient keyword used to indicate that this attribute will not be serialized or deserialized
    private transient String notSerializedVariable;

    //Custom classes can be also serialized unless they also implement the serializable interface

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNotSerializedVariable() {
        return notSerializedVariable;
    }

    public void setNotSerializedVariable(String notSerializedVariable) {
        this.notSerializedVariable = notSerializedVariable;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", notSerializedVariable='" + notSerializedVariable + '\'' +
                '}';
    }
}
