package com.integer.calculator;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JavaCalculatorCopy extends JFrame{

    JPanel Panel = new JPanel();
    JTextArea Input = new JTextArea(1,16);
    JTextArea Output = new JTextArea(1,16);
    JTextArea Debug = new JTextArea(5,16);
    JButton Button0 = new JButton("0");
    JButton Button1 = new JButton("1");
    JButton Button2 = new JButton("2");
    JButton Button3 = new JButton("3");
    JButton Button4 = new JButton("4");
    JButton Button5 = new JButton("5");
    JButton Button6 = new JButton("6");
    JButton Button7 = new JButton("7");
    JButton Button8 = new JButton("8");
    JButton Button9 = new JButton("9");
    JButton ButtonDecimalPoint = new JButton(".");
    JButton ButtonAns = new JButton("Ans");
    JButton ButtonMakeNegative = new JButton("(-)");
    JButton ButtonPlus = new JButton("+");
    JButton ButtonMinus = new JButton("-");
    JButton ButtonTimes = new JButton("*");
    JButton ButtonDividedBy = new JButton("/");
    JButton ButtonSquared = new JButton("^2");
    JButton ButtonPower = new JButton("^");
    JButton ButtonSquareRoot = new JButton("√");
    JButton ButtonEquals = new JButton("=");
    JButton ButtonReset = new JButton("Reset");
    String InputString;
    String FirstValue = new String();
    String SecondValue = new String();  
    int whatOperator = 20;
    double outputNumber;
    double AnsValue;
    double FirstNumber;
    double SecondNumber;
    boolean OutputInUse = false;

    public static void main(String[] args){

        new JavaCalculatorCopy();

    }

    public JavaCalculatorCopy(){

        SetDebugScreen();
        this.setSize(220, 390);
        Toolkit tk = Toolkit.getDefaultToolkit();               
        Dimension dim = tk.getScreenSize();             
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("De Wombat-Calculator");

        Panel.add(Input);

        ListenForButton lForButton = new ListenForButton();

        Button9.addActionListener(lForButton);
        Button8.addActionListener(lForButton);
        Button7.addActionListener(lForButton);
        ButtonPlus.addActionListener(lForButton);

        Button4.addActionListener(lForButton);
        Button5.addActionListener(lForButton);
        Button6.addActionListener(lForButton);
        ButtonMinus.addActionListener(lForButton);

        Button1.addActionListener(lForButton);
        Button2.addActionListener(lForButton);
        Button3.addActionListener(lForButton);
        ButtonTimes.addActionListener(lForButton);

        Button0.addActionListener(lForButton);
        ButtonAns.addActionListener(lForButton);
        ButtonEquals.addActionListener(lForButton);
        ButtonDividedBy.addActionListener(lForButton);

        ButtonSquareRoot.addActionListener(lForButton);
        ButtonPower.addActionListener(lForButton);
        ButtonDecimalPoint.addActionListener(lForButton);
        ButtonMakeNegative.addActionListener(lForButton);

        ButtonSquared.addActionListener(lForButton);
        ButtonReset.addActionListener(lForButton);

        Panel.add(Button7);
        Panel.add(Button8);
        Panel.add(Button9);
        Panel.add(ButtonPlus);

        Panel.add(Button4);
        Panel.add(Button5);
        Panel.add(Button6);
        Panel.add(ButtonMinus);

        Panel.add(Button1);
        Panel.add(Button2);
        Panel.add(Button3);
        Panel.add(ButtonTimes);

        Panel.add(Button0);
        Panel.add(ButtonAns);
        Panel.add(ButtonEquals);
        Panel.add(ButtonDividedBy);

        Panel.add(ButtonSquareRoot);
        Panel.add(ButtonPower);
        Panel.add(ButtonDecimalPoint);
        Panel.add(ButtonMakeNegative);

        Panel.add(ButtonSquared);

        Panel.add(Output);
        Panel.add(ButtonReset);
        Panel.add(Debug);

        this.add(Panel);

        this.setVisible(true);

    }

    private class ListenForButton implements ActionListener{

        public void actionPerformed(ActionEvent e){

            if(e.getSource() == Button0){
                SetButton("0");
            }else if(e.getSource() == Button1){
                SetButton("1");             
            }else if(e.getSource() == Button2){
                SetButton("2");
            }else if(e.getSource() == Button3){
                SetButton("3");
            }else if(e.getSource() == Button4){
                SetButton("4");
            }else if(e.getSource() == Button5){
                SetButton("5");
            }else if(e.getSource() == Button6){
                SetButton("6");
            }else if(e.getSource() == Button7){
                SetButton("7");
            }else if(e.getSource() == Button8){
                SetButton("8");
            }else if(e.getSource() == Button9){
                SetButton("9");
            }else if(e.getSource() == ButtonMakeNegative){
                SetButton("-");
            }else if(e.getSource() == ButtonDecimalPoint){
                SetButton(".");
            }else if(e.getSource() == ButtonPlus){
                SetButton(" + ", 0, 1);
            }else if(e.getSource() == ButtonMinus){
                SetButton(" - ", 1, 1);
            }else if(e.getSource() == ButtonTimes){
                SetButton(" * ", 2, 1);
            }else if(e.getSource() == ButtonDividedBy){
                SetButton(" / ", 3, 1);
            }else if(e.getSource() == ButtonPower){
                SetButton("^", 4, 1);   
            }else if(e.getSource() == ButtonSquared){
                SetButton("^2", 6, 1);
            }else if(e.getSource() == ButtonSquareRoot){
                SetButton("√", 5, 0);
            }else if(e.getSource() == ButtonEquals){ 
                if(SecondValue.equals("")|SecondValue.equals("-")){
                }else{
                    FirstNumber = Double.parseDouble(SecondValue);
                }
                if(whatOperator != 7){
                    SecondNumber = Double.parseDouble(FirstValue);
                }

                if(whatOperator == 0){
                    outputNumber = FirstNumber + SecondNumber;
                }else if(whatOperator == 1){
                    outputNumber = FirstNumber - SecondNumber;
                }else if(whatOperator == 2){
                    outputNumber = FirstNumber * SecondNumber;
                }else if(whatOperator == 3){
                    outputNumber = FirstNumber / SecondNumber;
                }else if(whatOperator == 4){
                    outputNumber = Math.pow(FirstNumber, SecondNumber);
                }else if(whatOperator == 5){
                    if(SecondValue.equals("")){
                        outputNumber = Math.sqrt(SecondNumber);
                    }else if(SecondValue.equals("-")){
                        outputNumber = -1 * Math.sqrt(SecondNumber);
                    }else{
                        outputNumber = FirstNumber * Math.sqrt(SecondNumber);
                    }
                }else if(whatOperator == 6){
                    outputNumber = Math.pow(FirstNumber, 2);
                }

                String AnsValue = Double.toString(outputNumber);
                Output.append(AnsValue);

                OutputInUse = true;
                SetDebugScreen();
            }else if(e.getSource() == ButtonReset){
                Reset();                
            }else if(e.getSource() == ButtonAns){
                SetButton("Ans");
                FirstValue = Double.toString(AnsValue);
            }           
        }   
    }

    private void SetDebugScreen(){
        Debug.setText("FirstValue: " + FirstValue + "\nSecondValue: " + SecondValue + "\nAns Value: " + AnsValue + "\nwhatOperator: " + whatOperator);
    }

    public void Reset() {
        Input.setText("");
        Output.setText("");
        FirstValue = "";
        SecondValue = "";
        whatOperator = 20;
        OutputInUse = false;
        SetDebugScreen();
    }

    public void SetButton(String i, int j, int k) {
        CheckOutput(k);
        if(whatOperator == 20){
            Input.append(i);
            whatOperator = j;
            PassData();
        }else if(whatOperator == 2){
            Input.append(i);
            whatOperator = j;           
        }
    }       

    public void SetButton(String i) {
        CheckOutput(0);
        Input.append(i);
        FirstValue += i;
    }

    private void PassData() {
        SecondValue = FirstValue;
        FirstValue = "";
    }

    private void CheckOutput(int h){
        if(OutputInUse && h == 0){
            Reset();            
        }else if(OutputInUse){
            Reset();
            FirstValue = Double.toString(AnsValue);
            Input.setText("Ans");
        }
    }
}