package MVC;

public class CalculatorModel {

	public int findArea(int length, int width){
		int areaAnswer = 0;
		areaAnswer = length * width;
		return areaAnswer;
	}
	
	public int findCir(int length, int width) {
		int cirAnswer = 0;
		cirAnswer = (length * 2) + (width * 2);
		return cirAnswer;
	}

}
