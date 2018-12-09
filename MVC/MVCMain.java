package MVC;

public class MVCMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		CalculatorView view = new CalculatorView();
		CalculatorModel model = new CalculatorModel();
		CalculatorController control = new CalculatorController(view, model);
		view.setVisible(true);

	}

}
