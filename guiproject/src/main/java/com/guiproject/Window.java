package com.guiproject;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Window {
    private JFrame window;
    private JButton button;
    private int height;
    private int width;

    public Window(int height, int width) {
        window = new JFrame();
        button = new JButton("Click Me!");
        this.height = height;
        this.width = width;
    }
      
    
    public void Window() {
        window.setSize(width, height);
        window.setTitle("Platformer");
        window.add(button);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setVisible(true);
    }
}
