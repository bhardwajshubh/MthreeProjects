package com.mthree.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Events {

    @Id
    @GeneratedValue
    private int eventId;

    private String eventName;

    private String eventDuration;

    private Date startDateTime;

    private Date endDateTime;

    @OneToMany(mappedBy = "event")
    private List<Users> users;

    public Events() {}

    public Events(int eventId, String eventName, String eventDuration, Date startDateTime, Date endDateTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDuration = eventDuration;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public Events(int eventId, String eventName, String eventDuration, Date startDateTime, Date endDateTime, List<Users> users) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDuration = eventDuration;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.users = users;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDuration() {
        return eventDuration;
    }

    public void setEventDuration(String eventDuration) {
        this.eventDuration = eventDuration;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Events{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDuration='" + eventDuration + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                '}';
    }
}
