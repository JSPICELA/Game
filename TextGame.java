import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import static java.awt.Color.*;
import javax.swing.JTextArea;

public class TextGame {

    JFrame window;
     Container con;
     JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
     JLabel titleNameLabel;
     Font titleFont = new Font("Times New Roman", Font.PLAIN,80);
     Font normalFont = new Font("Times New Roman", Font.PLAIN, 40);
     JButton startButton, choice1, choice2, choice3, choice4;
     JTextArea mainTextArea;

     TitleScreenHandler tsHandler = new TitleScreenHandler();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        new TextGame();
    }
    public TextGame(){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(black);
        window.setLayout(null);

        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(black);
        titleNameLabel = new JLabel("Hollowbrook");
        titleNameLabel.setForeground(white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400,200,100);
        startButtonPanel.setBackground(black);

        startButton = new JButton("START");
        startButton.setBackground(black);
        startButton.setForeground(white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);

        titleNamePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);

        window.setVisible(true);
    }

    public void createGameScreen(){

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(black);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Main text area.");
        mainTextArea.setBounds(100,100,500,250);
        mainTextArea.setBackground(black);
        mainTextArea.setForeground(white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250,350,300,300);
        choiceButtonPanel.setBackground(black);
        choiceButtonPanel.setLayout(new GridLayout(4,1)); //possibly need to import at the top

        con.add(choiceButtonPanel);

        choice1 = new JButton("Choice 1");
        choice1.setBackground(black);
        choice1.setForeground(white);
        choice1.setFont(normalFont);
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("Choice 2");
        choice2.setBackground(black);
        choice2.setForeground(white);
        choice2.setFont(normalFont);
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Choice 3");
        choice3.setBackground(black);
        choice3.setForeground(white);
        choice3.setFont(normalFont);
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Choice 4");
        choice4.setBackground(black);
        choice4.setForeground(white);
        choice4.setFont(normalFont);
        choiceButtonPanel.add(choice4);
    }

    public class TitleScreenHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            createGameScreen();
        }
    }

}

