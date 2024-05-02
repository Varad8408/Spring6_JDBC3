package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    
    Speaker create(Speaker speaker);

    List<Speaker> findAll();

    Speaker getSpeaker(int id);

    Speaker update(Speaker speaker);

    void update(List<Object[]> pairs);

    void delete(int id);
}
