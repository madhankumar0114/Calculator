package calc.madhan;

public final class CalculatorFactory {

	private CalculatorFactory() {

	}

	public static Calculator getCalculator(int calcType) {
		if (calcType == 1) {
			return new SimpleCalculator();
		} else if (calcType == 2) {
			return new ComplexCalculator();
		} else {
			throw new RuntimeException("noki adiyada potta kanna");
		}
	}
}
