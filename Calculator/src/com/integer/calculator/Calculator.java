package com.integer.calculator;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener
{

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField textField = new JTextField();

    private JButton btnOne = new JButton("1");
    private JButton btnTwo = new JButton("2");
    private JButton btnThree = new JButton("3");
    private JButton btnPlus = new JButton("+");
    private JButton btnFour = new JButton("4");
    private JButton btnFive = new JButton("5");
    private JButton btnSix = new JButton("6");
    private JButton btnMinus = new JButton("-");
    private JButton btnSeven = new JButton("7");
    private JButton btnEight = new JButton("8");
    private JButton btnNine = new JButton("9");
    private JButton btnStar = new JButton("*");
    private JButton btnPoint = new JButton(".");
    private JButton btnZero = new JButton("0");
    private JButton btnEquals = new JButton("=");
    private JButton btnSlash = new JButton("/");
    private JButton btnBack = new JButton("Back");
    private JButton btnClear = new JButton("Clear");

    private String textFieldInput;
    private JButton[] myButtons =
    { btnOne, btnTwo, btnThree, btnPlus, btnFour, btnFive, btnSix, btnMinus,
        btnSeven, btnEight, btnNine, btnStar, btnPoint, btnZero, btnEquals,
        btnSlash, btnClear, btnBack };



    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                try
                {
                    Calculator frame = new Calculator();
                    frame.setVisible(true);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Calculator()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        positionTextField();
        positionButtons();

        for (JButton jButton : myButtons)
        {
            jButton.addActionListener(this);
            contentPane.add(jButton);
        }

    }

    public void positionTextField()
    {
        textField.setFont(new Font("Dialog", Font.PLAIN, 20));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBounds(46, 12, 380, 42);
        contentPane.add(textField);
        textField.setColumns(10);
    }

    public void positionButtons()
    {
        btnOne.setBounds(46, 79, 60, 31);
        btnTwo.setBounds(139, 79, 60, 31);
        btnThree.setBounds(230, 79, 60, 31);
        btnPlus.setBounds(340, 79, 60, 31);
        btnFour.setBounds(46, 131, 60, 31);
        btnFive.setBounds(139, 131, 60, 31);
        btnSix.setBounds(230, 131, 60, 31);
        btnMinus.setBounds(340, 131, 60, 31);
        btnSeven.setBounds(46, 185, 60, 31);
        btnEight.setBounds(139, 185, 60, 31);
        btnNine.setBounds(230, 185, 60, 31);
        btnStar.setBounds(340, 185, 60, 31);
        btnPoint.setBounds(46, 231, 60, 31);
        btnZero.setBounds(139, 231, 60, 31);
        btnEquals.setBounds(230, 231, 60, 31);
        btnSlash.setBounds(340, 231, 60, 31);
        btnClear.setBounds(37, 292, 90, 48);
        btnBack.setBounds(139, 292, 90, 48);
    }

    public void setTextTo(String text)
    {
        textField.setText(textField.getText() + text);
        textField.requestFocus();
    }

    public void goBack()
    {
        if (!textField.getText().equals(""))
        {
            String text = textField.getText();
            String withoutLastChar = text.substring(0, text.length() - 1);
            textField.setText(withoutLastChar);
            textField.requestFocus();
        }
    }

    public void add()
    {
        int place = textFieldInput.indexOf("+");
        String firstChars = textFieldInput.substring(0, place);
        String lastChars = textFieldInput.substring(place + 1,
                textFieldInput.length());
        double firstCharsInt = Double.parseDouble(firstChars);
        double lastCharsInt = Double.parseDouble(lastChars);
        double result = firstCharsInt + lastCharsInt;
        String stringResult = Double.toString(result);
        textField.setText(stringResult);
    }

    public void substract()
    {
        int place = textFieldInput.indexOf("-");
        String firstChars = textFieldInput.substring(0, place);
        String lastChars = textFieldInput.substring(place + 1,
                textFieldInput.length());
        double firstCharsInt = Double.parseDouble(firstChars);
        double lastCharsInt = Double.parseDouble(lastChars);
        double result = firstCharsInt - lastCharsInt;
        String stringResult = Double.toString(result);
        textField.setText(stringResult);
    }

    public void multiply()
    {
        int place = textFieldInput.indexOf("*");
        String firstChars = textFieldInput.substring(0, place);
        String lastChars = textFieldInput.substring(place + 1,
                textFieldInput.length());
        double firstCharsInt = Double.parseDouble(firstChars);
        double lastCharsInt = Double.parseDouble(lastChars);
        double result = firstCharsInt * lastCharsInt;
        String stringResult = Double.toString(result);
        textField.setText(stringResult);
    }

    public void divide()
    {
        int place = textFieldInput.indexOf("/");
        String firstChars = textFieldInput.substring(0, place);
        String lastChars = textFieldInput.substring(place + 1,
                textFieldInput.length());
        double firstCharsInt = Double.parseDouble(firstChars);
        double lastCharsInt = Double.parseDouble(lastChars);
        double result = firstCharsInt / lastCharsInt;
        String stringResult = Double.toString(result);
        textField.setText(stringResult);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnOne)
        {
            setTextTo("1");
        }
        else if (e.getSource() == btnTwo)
        {
            setTextTo("2");
        }
        else if (e.getSource() == btnThree)
        {
            setTextTo("3");
        }
        else if (e.getSource() == btnPlus)
        {
            if (!textField.getText().contains("+"))
            {
                setTextTo("+");
            }
        }
        else if (e.getSource() == btnFour)
        {
            setTextTo("4");
        }
        else if (e.getSource() == btnFive)
        {
            setTextTo("5");
        }
        else if (e.getSource() == btnSix)
        {
            setTextTo("6");
        }
        else if (e.getSource() == btnMinus)
        {
            if (!textField.getText().contains("-"))
            {
                setTextTo("-");
            }
        }
        else if (e.getSource() == btnSeven)
        {
            setTextTo("7");
        }
        else if (e.getSource() == btnEight)
        {
            setTextTo("8");
        }
        else if (e.getSource() == btnNine)
        {
            setTextTo("9");
        }
        else if (e.getSource() == btnStar)
        {
            if (!textField.getText().contains("*"))
            {
                setTextTo("*");
            }
        }
        else if (e.getSource() == btnPoint)
        {
            if (!textField.getText().contains("."))
            {
                setTextTo(".");
            }
        }
        else if (e.getSource() == btnZero)
        {
            setTextTo("0");
        }
        else if (e.getSource() == btnEquals)
        {
            try
            {
                textFieldInput = textField.getText();

                if (textFieldInput.contains("+"))
                {
                    add();
                }
                else if (textFieldInput.contains("-"))
                {
                    substract();
                }
                else if (textFieldInput.contains("*"))
                {
                    multiply();
                }
                else if (textFieldInput.contains("/"))
                {
                    divide();
                }
                textField.requestFocus();
            }
            catch (Exception e2)
            {
                textField.setText("Invalid operation");
            }
        }
        else if (e.getSource() == btnSlash)
        {
            if (!textField.getText().contains("/"))
            {
                setTextTo("/");
            }
        }
        else if (e.getSource() == btnClear)
        {
            textField.setText("");
            textField.requestFocus();
        }
        else if (e.getSource() == btnBack)
        {
            goBack();
        }

    }
}