import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

import java.awt.Component;

import javax.swing.JRadioButton;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import java.awt.Dimension;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;

import pattern1.P1controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class ui2 {

	private JFrame frame;
	private final JLabel lblCommand = new JLabel("Command:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ui2 window = new ui2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ui2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setSize(new Dimension(10, 10));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JTextPane Command = new JTextPane();
		  
		Command.setBounds(64, 51, 362, 40);
		
		final JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 101, 426, 152);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(Command);
		frame.getContentPane().add(textArea);
		
		final JCheckBox chckbxSharedSolution = new JCheckBox("Shared Solution");
		chckbxSharedSolution.setBounds(64, 4, 150, 36);
		frame.getContentPane().add(chckbxSharedSolution);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Implicit Invocation");
		chckbxNewCheckBox.setBounds(230, 11, 150, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblPattern = new JLabel("Pattern:");
		lblPattern.setBounds(3, 6, 73, 34);
		frame.getContentPane().add(lblPattern);
		lblCommand.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCommand.setBounds(0, 51, 76, 40);
		frame.getContentPane().add(lblCommand);
		int condition = JComponent.WHEN_FOCUSED;
		  InputMap iMap = Command.getInputMap(condition);
		  ActionMap aMap = Command.getActionMap();

		  String enter = "enter";
		  iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter);
		  aMap.put(enter, new AbstractAction() {
			
			 P1controller p1 = new P1controller();
		     @Override
		     public void actionPerformed(ActionEvent arg0) {
		    	
		       if(chckbxSharedSolution.isSelected()&&!chckbxNewCheckBox.isSelected()){
		        	System.out.println("Pattern" +Command.getText()+ "was called");
		        	try {
						textArea.setText(p1.run(Command.getText()));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		        	//display("Pattern1 was called");
		     } else if(chckbxNewCheckBox.isSelected()&&!chckbxSharedSolution.isSelected()){
		    	 	System.out.println("Pattern" +chckbxNewCheckBox.getText()+ "was called"+Command.getText());
		        	textArea.setText(Command.getText());
		     } else
		    	 textArea.setText("PLEASE TICK ONE PATTERN ONLY!!!");
		     }
			
		  });
		
	}
	
	
	}

