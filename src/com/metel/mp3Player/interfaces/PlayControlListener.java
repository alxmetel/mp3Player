package com.metel.mp3Player.interfaces;

public interface PlayControlListener {
    
    void playStarted(String name);
    
    void processScroll(int position);
    
    void playFinished();
    
}
