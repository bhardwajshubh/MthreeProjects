package com.mthree.dtos;

public class UserDTO {

    private int userId;

    private String personName;

    private int age;

    private String occupation;

    private int eventId;

    public UserDTO(int userId, String personName, int age, String occupation, int eventId) {
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

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
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
