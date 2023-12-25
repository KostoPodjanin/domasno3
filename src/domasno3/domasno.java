package domasno3;

public class domasno {
	public class Calculator {
	    private int number1;
	    private int number2;

	    // Конструктор за иницијализација на броевите
	    public Calculator(int num1, int num2) {
	        this.number1 = num1;
	        this.number2 = num2;
	    }

	    // Метод за собирање на броевите
	    public int addNumbers() {
	        return number1 + number2;
	    }
	}

	public class Main {
	    private static Calculator calculator;

		public static void main(String[] args) {
	        // Дефинирање на два броја
	        int num1 = 5;
	        int num2 = 10;

	        // Креирање на објект од класата Calculator


	        calculator = null;
			// Собирање на броевите и прикажување на резултатот
	        int sum = calculator.addNumbers();
	        System.out.println("Сумата на броевите " + num1 + " и " + num2 + " е: " + sum);
	    }
	}
}
