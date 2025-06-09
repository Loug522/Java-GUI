package com.guiproject;

import javax.swing.JFrame;


public class Window {
    
    JFrame window = new JFrame();
    
    public Window() {
        window.setVisible(true);
        window.setName("Super Mario World");
        window.setBounds(0, 0, 600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
