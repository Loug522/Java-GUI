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
        button = new JButton("CLICK ME!");
        this.height = height;
        this.width = width;
    }
    
    public void Window() {
        // BUTTON
        window.add(button);
        button.setBounds(250, 275, 100, 50);
        
        
        // WINDOW
        window.setLayout(null); // This will allow resizing of components
        window.setSize(width, height);
        window.setTitle("Platformer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         window.setVisible(true);
    }
}
