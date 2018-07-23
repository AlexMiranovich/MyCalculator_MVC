package view;

import action.ClassActionListnerForCalculator;
import javax.swing.*;
import java.awt.*;

/**
 *
 * Class VIEW which creating imagine of face of calculator. Creating default
 * constructor which declare buttons ahd textarea in JFrame
 * @author  AlexMiranovich
 *
 */

public class ClassViewOfCalculator{

    public static JTextField jTextField;

    public ClassViewOfCalculator(){
        JFrame jFrame = new JFrame("Calculator");
        jFrame.setLayout(new BorderLayout());
        jFrame.setSize(400,500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jTextField = new JTextField();
        jTextField.setColumns(30);
        jTextField.setToolTipText("Please enter your numbers");

        JPanel jPanel_1 = new JPanel();
        JPanel jPanel_2 = new JPanel(new GridLayout(5,3));

        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_0 = new JButton("0");
        JButton jButton_RESULT = new JButton("=");
        JButton jButton_SUBTRACTION = new JButton("-");
        JButton jButton_ADD = new JButton("+");
        JButton jButton_MULTIPLY = new JButton("*");
        JButton jButton_DIVISION = new JButton("/");
        JButton jButton_CLEAR = new JButton("Clear");
        JButton jButton_DELETE = new JButton("Delete");


        jButton_1.addActionListener(new ClassActionListnerForCalculator());
        jButton_2.addActionListener(new ClassActionListnerForCalculator());
        jButton_3.addActionListener(new ClassActionListnerForCalculator());
        jButton_4.addActionListener(new ClassActionListnerForCalculator());
        jButton_5.addActionListener(new ClassActionListnerForCalculator());
        jButton_6.addActionListener(new ClassActionListnerForCalculator());
        jButton_7.addActionListener(new ClassActionListnerForCalculator());
        jButton_8.addActionListener(new ClassActionListnerForCalculator());
        jButton_9.addActionListener(new ClassActionListnerForCalculator());
        jButton_0.addActionListener(new ClassActionListnerForCalculator());
        jButton_RESULT.addActionListener(new ClassActionListnerForCalculator());
        jButton_SUBTRACTION.addActionListener(new ClassActionListnerForCalculator());
        jButton_ADD.addActionListener(new ClassActionListnerForCalculator());
        jButton_MULTIPLY.addActionListener(new ClassActionListnerForCalculator());
        jButton_DIVISION.addActionListener(new ClassActionListnerForCalculator());
        jButton_CLEAR.addActionListener(new ClassActionListnerForCalculator());
        jButton_DELETE.addActionListener(new ClassActionListnerForCalculator());

        jPanel_1.add(jTextField);
        jPanel_2.add(jButton_1);
        jPanel_2.add(jButton_2);
        jPanel_2.add(jButton_3);
        jPanel_2.add(jButton_4);
        jPanel_2.add(jButton_5);
        jPanel_2.add(jButton_6);
        jPanel_2.add(jButton_6);
        jPanel_2.add(jButton_7);
        jPanel_2.add(jButton_8);
        jPanel_2.add(jButton_9);
        jPanel_2.add(jButton_0);
        jPanel_2.add(jButton_ADD);
        jPanel_2.add(jButton_SUBTRACTION);
        jPanel_2.add(jButton_MULTIPLY);
        jPanel_2.add(jButton_DIVISION);
        jPanel_2.add(jButton_RESULT);
        jPanel_2.add(jButton_CLEAR);
        jPanel_2.add(jButton_DELETE);

        jFrame.add(jPanel_1,BorderLayout.NORTH);
        jFrame.add(jPanel_2,BorderLayout.SOUTH);

        jFrame.pack();
        jFrame.setVisible(true);

    }
}
