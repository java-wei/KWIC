import java.awt.EventQueue;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import java.awt.Component;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import pattern1.P1controller;
import pattern2.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;


public class UIController {

	private JFrame frame;
	private final JLabel lblCommand = new JLabel("Command:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIController window = new UIController();
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
	public UIController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
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
		chckbxSharedSolution.setBounds(84, 4, 150, 36);
		frame.getContentPane().add(chckbxSharedSolution);
		
		final JCheckBox chckbxNewCheckBox = new JCheckBox("Implicit Invocation");
		chckbxNewCheckBox.setBounds(230, 11, 150, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JLabel lblPattern = new JLabel("Architecture:");
		lblPattern.setBounds(3, 6, 103, 34);
		frame.getContentPane().add(lblPattern);
		lblCommand.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCommand.setBounds(0, 51, 76, 40);
		frame.getContentPane().add(lblCommand);
		
		
		int condition = JComponent.WHEN_FOCUSED;
		InputMap iMap = Command.getInputMap(condition);
		ActionMap aMap = Command.getActionMap();

		Controller.run("help");
		String enter = "enter";
		iMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enter);
		
		//when enter pressed react
		aMap.put(enter, new AbstractAction() {
			P1controller p1 = new P1controller();
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		    	
		       if(chckbxSharedSolution.isSelected()&&!chckbxNewCheckBox.isSelected()){
		        	try {
						textArea.setText(p1.runUIController(Command.getText()));
					} catch (Exception e) {
						e.printStackTrace();
					}
		       } else if(chckbxNewCheckBox.isSelected()&&!chckbxSharedSolution.isSelected()){
		        	textArea.setText(Controller.run(Command.getText()));
		       } else
		    	 	textArea.setText("PLEASE TICK ONE PATTERN ONLY!!!");
		     	}
			}
		);
		
	}
	
	
	}

