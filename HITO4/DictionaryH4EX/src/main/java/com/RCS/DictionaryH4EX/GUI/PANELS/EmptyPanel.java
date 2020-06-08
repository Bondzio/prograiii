package com.RCS.DictionaryH4EX.GUI.PANELS;

import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class EmptyPanel extends JPanel {
    public EmptyPanel() {
        this.setPreferredSize(new Dimension(500, 100));
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(2, 1));
    }
}
