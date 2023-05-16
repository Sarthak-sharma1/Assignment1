package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BoseSpeakers implements Speakers {

    @Override
    public String playMusic() {
        return "Playing Music with Boss speakers.";
    }
}
