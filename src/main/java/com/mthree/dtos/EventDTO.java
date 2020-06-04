package com.mthree.dtos;

import java.util.Date;

public class EventDTO {
    private int eventId;

    private String eventName;

    private String eventDuration;

    private Date startDateTime;

    private Date endDateTime;

    public EventDTO(int eventId, String eventName, String eventDuration, Date startDateTime, Date endDateTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDuration = eventDuration;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
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

    @Override
    public String toString() {
        return "EventDTO{" +
                "eventId=" + eventId +
                ", eventName='" + eventName + '\'' +
                ", eventDuration='" + eventDuration + '\'' +
                ", startDateTime=" + startDateTime +
                ", endDateTime=" + endDateTime +
                '}';
    }
}
