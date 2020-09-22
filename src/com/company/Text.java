package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Text extends JFrame{
    static JTextArea jt;
    public static void createGUI() {
        JPanel p = new JPanel();
        jt = new JTextArea("\n\n\nplease write something");

        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(jt);

        Font font = new Font("Verdana", Font.PLAIN, 14);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(font);

        JMenu newMenu = new JMenu("Шрифт");
        newMenu.setFont(font);
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Times New Roman");
        txtFileItem.setFont(font);
        newMenu.add(txtFileItem);

        JMenuItem txt1FileItem = new JMenuItem("MS Sans Serif");
        txt1FileItem.setFont(font);
        newMenu.add(txt1FileItem);

        JMenuItem txt2FileItem = new JMenuItem("Courier New");
        txt2FileItem.setFont(font);
        newMenu.add(txt2FileItem);

        JMenu new1Menu = new JMenu("Цвет шрифта");
        new1Menu.setFont(font);
        fileMenu.add(new1Menu);

        JMenuItem colorFileItem = new JMenuItem("Синий");
        colorFileItem.setFont(font);
        new1Menu.add(colorFileItem);

        JMenuItem color1FileItem = new JMenuItem("Красный");
        color1FileItem.setFont(font);
        new1Menu.add(color1FileItem);

        JMenuItem color2FileItem = new JMenuItem("Черный");
        color2FileItem.setFont(font);
        new1Menu.add(color2FileItem);
        txtFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Times New Roman", Font.PLAIN, 14);
                jt.setFont(f);
            }
        });
        txt1FileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("MS Sans Serif", Font.PLAIN, 14);
                jt.setFont(f);
            }
        });
        txt2FileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Font f = new Font("Courier New", Font.PLAIN, 14);
                jt.setFont(f);
            }
        });
        colorFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.setForeground(Color.BLUE);
            }
        });
        color1FileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.setForeground(Color.RED);
            }
        });
         color2FileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jt.setForeground(Color.BLACK);
            }
        });
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(270, 225));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                createGUI();
            }
        });
    }
}
