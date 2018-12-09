package MVC;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
public class CalculatorView extends JFrame {

	private JLabel j1 = new JLabel("Enter in the length and width of the rectangle.");
	private JTextField jt1 = new JTextField(10);
	private JLabel j2 = new JLabel(" & ");
	private JTextField jt2 = new JTextField(10);
	private JLabel j3 = new JLabel(" = ");
	private JTextField jt3 = new JTextField(10);
	private JButton jbArea = new JButton("Area");
	private JButton jbCirc = new JButton("Circumference");
	
	
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		jt3.setEditable(false);
		setTitle("Calculator");
		setLocationRelativeTo(null);
		
		calcPanel.add(j1);
		calcPanel.add(jt1);
		calcPanel.add(j2);
		calcPanel.add(jt2);
		calcPanel.add(j3);
		calcPanel.add(jt3);
		calcPanel.add(jbArea);
		calcPanel.add(jbCirc);
	
		
		this.add(calcPanel);
	}
	public int getLength(){
		return Integer.parseInt(jt1.getText());
	}
	
	public int getWidth(){
		return Integer.parseInt(jt2.getText());
	}
	
	public void setAnswer(int answer) {
		jt3.setText(Integer.toString(answer));
	}
	
	void calcListen(ActionListener listen4Button) {
		jbArea.addActionListener(listen4Button);
		jbCirc.addActionListener(listen4Button);
	}
	
	void displayErrorMessage(String errorMessage) {

		// JOptionPane popup to notify user
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
