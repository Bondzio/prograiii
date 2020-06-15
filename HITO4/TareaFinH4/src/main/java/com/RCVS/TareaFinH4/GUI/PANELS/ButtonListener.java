package com.RCVS.TareaFinH4.GUI.PANELS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent E) {
        JButton currentButton = (JButton) E.getSource();
        JOptionPane.showMessageDialog(null, "Button Pressed -> " + currentButton.getText());
    }
}
