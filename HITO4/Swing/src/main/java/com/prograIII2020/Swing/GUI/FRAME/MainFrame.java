package com.prograIII2020.Swing.GUI.FRAME;

import com.prograIII2020.Swing.GUI.PANELS.AlphabetPanel;
import com.prograIII2020.Swing.GUI.PANELS.ButtonPanel;
import com.prograIII2020.Swing.GUI.PANELS.EmptyPanel;
import com.prograIII2020.Swing.GUI.PANELS.PanelImages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.*;

@Component
public class MainFrame extends JFrame {
    @Autowired
    private EmptyPanel emptyPanel;
    @Autowired
    private AlphabetPanel alphabetPanel;
    @Autowired
    private PanelImages panelImages;

    public MainFrame() {
        this.setTitle("PROGRA III 2020");
        this.setBounds(300, 200, 800, 600);
        this.setBackground(Color.blue);
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
        container.add(panelImages);
        container.add(emptyPanel);
    }
}