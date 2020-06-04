package com.mthree.models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Users {

    @Id
    @GeneratedValue
    private int userId;

    private String personName;

    private int age;

    private String occupation;

    @ManyToOne
    @JoinColumn(name="eventId")
    @OnDelete(action= OnDeleteAction.CASCADE)
    private Events eventId;

    public Users() {}


    public Users(int userId, String personName, int age, String occupation) {
        this.userId = userId;
        this.personName = personName;
        this.age = age;
        this.occupation = occupation;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return personName;
    }

    public void setName(String personName) {
        this.personName = personName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
