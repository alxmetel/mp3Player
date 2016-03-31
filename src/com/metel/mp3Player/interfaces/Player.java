package com.metel.mp3Player.interfaces;

public interface Player {

    void play(String fileName);

    void stop();

    void pause();

    void setVolume(double value);

    void jump(double controlPosition);
    
}
