package com.RCS.DictionaryH4EX.GUI.FRAME;

import com.RCS.DictionaryH4EX.GUI.PANELS.AlphabetPanel;
import com.RCS.DictionaryH4EX.GUI.PANELS.EmptyPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class FrameMain extends JFrame {
    @Autowired
    private AlphabetPanel alphabetPanel;
    @Autowired
    private EmptyPanel emptyPanel;

    public FrameMain() {
        this.setTitle("DICCIONARIO HITO4");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.BLUE);
        this.setLayout(new GridLayout(2, 0));
    }

    @PostConstruct
    public void createPanelsMainFrame() {
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout());

        addPanels(container);

        this.add(container);
        this.setVisible(true);
    }

    public void addPanels(JPanel container) {
        container.add(alphabetPanel);
        container.add(emptyPanel);
    }
}
