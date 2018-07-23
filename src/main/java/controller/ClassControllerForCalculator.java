package controller;

import model.ClassModelForCalculator;
import view.ClassViewOfCalculator;

/**
 *
 * Class CONTROLLER which creating imagine of face of calculator. Creating default
 * constructor which declare buttons ahd textarea in JFrame
 * @author  AlexMiranovich
 *
 */

public class ClassControllerForCalculator {

    public ClassControllerForCalculator() {
    }
    private static double a = 0.0D;
    private static int operator = 0;
    private ClassModelForCalculator cmfc = new ClassModelForCalculator();


    /**
     * Method used in ClassActionListnerForCalculator
     * @param name
     */
    public void clickButton(String name) {
        String lo;
        if (name.equals("1")) {
            lo = Long.toString((long) cmfc.getNUMBER_ONE());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("2")) {
            lo = Long.toString((long) cmfc.getNUMBER_TWO());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("3")) {
            lo = Long.toString((long) cmfc.getNUMBER_THREE());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("4")) {
            lo = Long.toString((long) cmfc.getNUMBER_FOUR());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("5")) {
            lo = Long.toString((long) cmfc.getNUMBER_FIVE());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("6")) {
            lo = Long.toString((long) cmfc.getNUMBER_SIX());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("7")) {
            lo = Long.toString((long) cmfc.getNUMBER_SEVEN());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("8")) {
            lo = Long.toString((long) cmfc.getNUMBER_EIGHT());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("9")) {
            lo = Long.toString((long) cmfc.getNUMBER_NINE());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("0")) {
            lo = Long.toString((long) cmfc.getNUMBER_ZERO());
            ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText().concat(lo));
        }
        if (name.equals("+")) {
            a = Double.parseDouble(ClassViewOfCalculator.jTextField.getText());
            operator = 1;
            ClassViewOfCalculator.jTextField.setText("");
        }
        if (name.equals("-")) {
            a = Double.parseDouble(ClassViewOfCalculator.jTextField.getText());
            operator = 2;
            ClassViewOfCalculator.jTextField.setText("");
        }
        if (name.equals("*")) {
            a = Double.parseDouble(ClassViewOfCalculator.jTextField.getText());
            operator = 3;
            ClassViewOfCalculator.jTextField.setText("");
        }
        if (name.equals("/")) {
            a = Double.parseDouble(ClassViewOfCalculator.jTextField.getText());
            operator = 4;
            ClassViewOfCalculator.jTextField.setText("");
        }
        if (name.equals("=")) {
            double b = Double.parseDouble( ClassViewOfCalculator.jTextField.getText() );
            double result = 0.0D;
            switch (operator) {
                case 1:
                    result = a + b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a * b;
                    break;
                case 4:
                    result = a / b;
                    break;
                default:
                    result = 0;
            }
            ClassViewOfCalculator.jTextField.setText("" + result );
        }
        if (name.equals("Clear")) {
            ClassViewOfCalculator.jTextField.setText("");
        }
        if (name.equals("Clear")) {
            String s = ClassViewOfCalculator.jTextField.getText();
            ClassViewOfCalculator.jTextField.setText("");
            for (int i = 0; i < s.length() - 1; i++)
                ClassViewOfCalculator.jTextField.setText(ClassViewOfCalculator.jTextField.getText() + s.charAt(i));
        }
    }
}


