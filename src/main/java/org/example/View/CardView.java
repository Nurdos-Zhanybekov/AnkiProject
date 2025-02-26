package org.example.View;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class CardView extends JFrame {
    private JComboBox<String> deckComboBox;
    private JTextField frontField;
    private JTextField backField;
    private JTextField tagField;
    private JButton addButton;
    private JButton closeButton;

    public CardView(){
        setLayout(new BorderLayout(10, 10));
        setBackground(new Color(43, 43, 43));
        setSize(700, 500);
        setLocationRelativeTo(null);

        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPanel.setBackground(getBackground());

        JLabel deckLabel = createLabel();
        deckComboBox = new JComboBox<>(new String[]{"das Vocabular1"});
        deckComboBox.setPreferredSize(new Dimension(150, 25));

        topPanel.add(deckLabel);
        topPanel.add(deckComboBox);

        JPanel centerPanel = new JPanel(new GridLayout(6, 1, 5, 5));
        centerPanel.setBackground(getBackground());

        centerPanel.add(createTitledFieldPanel("Front", frontField = new JTextField()));
        centerPanel.add(createTitledFieldPanel("Back", backField = new JTextField()));

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(getBackground());

        addButton = new JButton("Add");
        closeButton = new JButton("Close");

        bottomPanel.add(addButton);
        bottomPanel.add(closeButton);

        add(topPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);
    }

    private JLabel createLabel(){
        JLabel label = new JLabel("Deck: ");
        label.setForeground(Color.WHITE);
        return label;
    }

    private JPanel createTitledFieldPanel(String title, JTextField textField){
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(getBackground());
        TitledBorder border = BorderFactory.createTitledBorder(title);
        border.setTitleColor(Color.WHITE);
        panel.setBorder(border);
        panel.add(textField, BorderLayout.CENTER);
        return panel;
    }

    public void getCardView(){
        setVisible(true);
    }
}
