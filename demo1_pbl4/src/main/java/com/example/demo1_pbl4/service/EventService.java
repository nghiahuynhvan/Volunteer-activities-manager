package com.example.demo1_pbl4.service;

import com.example.demo1_pbl4.model.Event;
import com.example.demo1_pbl4.model.User;

import java.util.List;

public interface EventService {
    List<Event> getAllEvents();
    Event getEventById(Long eventId);
    Event insertEvent(Event event);
    void updateEvent(Event event);
    boolean deleteEvent(Long eventId);

    List<Event> findEventByLocationAndKeyword(String location,String keyword);
}
