package org.example.View;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public MainView(){
        setTitle("Anki");
        setSize(700, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Public\\Java_PL_Course\\AnkiProject\\src\\main\\java\\thumbnails\\Anki-icon.svg.png");
        setIconImage(imageIcon.getImage());

        Color backgroundColor = new Color(43, 43, 43);
        Color textColor = new Color(220, 220, 220);

        getContentPane().setBackground(backgroundColor);

        JPanel navBar = getNavBar(textColor);
        JPanel deckPanel = getDeckPanel(textColor);

        add(navBar, BorderLayout.NORTH);
        add(deckPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JPanel getNavBar(Color textColor) {
        JPanel navBar = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 20));
        navBar.setBackground(new Color(50, 50, 50));

        String[] tabs = {"Decks", "Add", "List", "Statistic"};
        for(String tab : tabs){
            JButton tagButton = new JButton(tab);
            tagButton.setFocusPainted(false);
            tagButton.setForeground(textColor);
            tagButton.setFont(new Font("Arial", Font.BOLD, 15));
            tagButton.setBackground(new Color(50, 50, 50));
            tagButton.setBorderPainted(false);
            tagButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            navBar.add(tagButton);
        }
        return navBar;
    }

    private JPanel getDeckPanel(Color textColor){
        JPanel deckPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 100, 20));
        deckPanel.setBackground(new Color(40, 40, 40));


        JLabel deckLabel = new JLabel("Deck                                   New             Learning          Reviewing");
        deckLabel.setForeground(textColor);
        deckLabel.setFont(new Font("Arial", Font.BOLD, 14));
        deckPanel.add(deckLabel, BorderLayout.NORTH);

        JPanel deckRow = new JPanel(new GridLayout(1, 5, 0, 0));
        deckRow.setBackground(new Color(20, 20, 20));

        JLabel deckName = new JLabel("     das Vokabular1", SwingConstants.LEFT);
        JLabel newWords = new JLabel("                      0", SwingConstants.CENTER);
        JLabel learningWords = new JLabel("                     0", SwingConstants.CENTER);
        JLabel reviewWords = new JLabel("                     0", SwingConstants.CENTER);

        deckName.setForeground(textColor);
        newWords.setForeground(textColor);
        learningWords.setForeground(textColor);
        reviewWords.setForeground(textColor);

        JButton settingsButton = new JButton("\u2699");
        settingsButton.setForeground(textColor);
        settingsButton.setBackground(new Color(20, 20, 20));
        settingsButton.setBorderPainted(false);

        deckRow.add(deckName);
        deckRow.add(newWords);
        deckRow.add(learningWords);
        deckRow.add(reviewWords);
        deckRow.add(settingsButton);

        deckPanel.add(deckRow, BorderLayout.CENTER);
        return deckPanel;
    }
}
