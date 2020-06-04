package com.mthree.dtos;

import com.mthree.models.Events;

public class UserDTO {

    private int userId;

    private String personName;

    private int age;

    private String occupation;

    private Events eventId;

    public UserDTO(int userId, String personName, int age, String occupation, Events eventId) {
        this.userId = userId;
        this.personName = personName;
        this.age = age;
        this.occupation = occupation;
        this.eventId = eventId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
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

    public Events getEventId() {
        return eventId;
    }

    public void setEventId(Events eventId) {
        this.eventId = eventId;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", personName='" + personName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", eventId=" + eventId +
                '}';
    }
}
