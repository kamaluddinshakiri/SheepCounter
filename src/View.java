import java.util.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.*;
import java.io.ObjectInputStream.GetField;
@author Kamaluddin Shakiri

public class View extends JFrame {
	
	private JButton decrement;
	private JButton increment;
	private JButton submit;
	private JTextField textField;
	private JTextField textField2;
	private JPanel panel;
	private GridLayout layout;
	private JLabel label;
	private Controller controller;
	private Model model;
	private JTextField initNumberField;
	private int inputNumber;
	private int initValue;
	
	public View() {
	    increment = new JButton("Increment");
	    decrement = new JButton("Decrement");
	    submit = new JButton("Submit");
	    initNumberField = new JTextField();
	    textField = new JTextField();
	    textField2 = new JTextField();
	    
	    textField2.setEditable(false);
	    panel = new JPanel();
	    label = new JLabel("Incomplete"); 
	    model = new Model(inputNumber, initValue, this);
	    controller = new Controller(this, model);
	    
	    layout = new GridLayout(4,2); // Grid layout sorts the components of the container in the order that it received
	    textField.setPreferredSize(new Dimension(100, 100));
	    label.setForeground(Color.red);
	    
	    //label.setBackground(Color.green); // Coloring the label
	    label.setOpaque(true); // with out this the color does not appear
	    
	    panel.add(textField2);
	    panel.add(textField);
	    panel.add(initNumberField);
	    panel.add(label);
	    panel.add(increment);
	    panel.add(decrement);
	    panel.add(submit);
	    
	    panel.setLayout(layout);
	    
	    increment.addActionListener(controller);
	    decrement.addActionListener(controller);
	    submit.addActionListener(controller);
	    
	    this.add(panel);
	    
	    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	    this.setSize(600, 800);
	    this.setVisible(true);
	}
	
	public void updateView() {
		textField2.setText(Integer.toString(model.getCount()));// used to make the increment show on the textfield
	}
	
	public void incomplete() {
		label.setText("Incomplete");
		label.setForeground(Color.red);
	}
	
	public void complete() {
		label.setText("Complete");
	    label.setForeground(Color.green);
	}
	
	public void inconsistence() {
		label.setText("Inconsistent");
		label.setForeground(Color.yellow);
	}
	
	public int getNumber() {
		String inputString = textField.getText();
		int number = Integer.parseInt(inputString);
		return number;
	}
	
	public int getInputFromUser() {
		String input = initNumberField.getText();
		int getNum = Integer.parseInt(input);
		
		return getNum;
	}
	
	public static void main(String[] args) {
		View view = new View();
	}	
}
