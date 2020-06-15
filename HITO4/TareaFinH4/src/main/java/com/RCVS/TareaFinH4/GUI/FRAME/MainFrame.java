package com.RCVS.TareaFinH4.GUI.FRAME;

import com.RCVS.TareaFinH4.GUI.PANELS.AlphabetPanel;
import com.RCVS.TareaFinH4.GUI.PANELS.EmptyPanel;
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

    public MainFrame() {
        this.setTitle("PROGRAMACION III TAREA FIN HITO 4");
        this.setBounds(300,200,800,600);
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(2,0));
        this.setLayout(new BorderLayout());
    }

    @PostConstruct
    public void PanelMFrame() {
        JPanel conta = new JPanel();
        conta.setLayout(new FlowLayout());
        addPanels(conta);
        this.add(conta);
        this.setVisible(true);
    }

    public void addPanels(JPanel cont) {
        cont.add(alphabetPanel);
        cont.add(emptyPanel);
    }
}
