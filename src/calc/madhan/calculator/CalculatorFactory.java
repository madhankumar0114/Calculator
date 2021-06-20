package calc.madhan.calculator;

import calc.madhan.types.CalculatorType;

public final class CalculatorFactory {

	private CalculatorFactory() {

	}

	public static Calculator getCalculator(CalculatorType calcType) {
		switch (calcType) {
		case SIMPLE:
			return new SimpleCalculator();
		case COMPLEX:
			return new ComplexCalculator();
		case MADHAN:
			return new MadhanCalculator();
		default:
			throw new RuntimeException("noki adiyada potta kanna");
		}
	}
}
