package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers {
    @Override
    public String playMusic() {
        return "Playing Music with Sony Speakers.";
    }
}
