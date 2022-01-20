package ua.step.part5.java8.utils;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * 
 * Лямбда в обработке событий для GUI
 *
 */
public class Task07
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Лямбда");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button = new JButton("Используй Лямбду Люк!");

        button.addActionListener(e -> showMessageDialog(frame, "Вся Сила в Лямбде!"));
System.out.println(frame.getFont());
        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}