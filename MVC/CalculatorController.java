package MVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CalculatorController {

	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model) {
		
		this.view = view;
		this.model = model;
		
		this.view.calcListen(new Listen());
	}
	
	class Listen implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			int length, width, answer = 0;
			
			JButton pushed = (JButton) (e.getSource());
			
			String text = pushed.getText();
			
			if (text.equals("Area")){
				try {
					length = view.getLength();
					width = view.getWidth();
					answer = model.findArea(length, width);
					view.setAnswer(answer);
				}
				catch (NumberFormatException ex) {

					System.out.println(ex);

					view.displayErrorMessage("You Need to Enter 2 Integers");
			}
			} else if(text.equals("Circumference")){
					try {
						length = view.getLength();
						width = view.getWidth();
						answer = model.findCir(length, width);
						view.setAnswer(answer);
					}
					catch (NumberFormatException ex) {

						System.out.println(ex);

						view.displayErrorMessage("You Need to Enter 2 Integers");
				}
				} else {
					// Do nothing
				}
		}
		
	}
}
