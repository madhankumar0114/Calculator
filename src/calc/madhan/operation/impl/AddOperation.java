package calc.madhan.operation.impl;

import calc.madhan.operation.Operation;

public class AddOperation implements Operation {

	@Override
	public double apply(double a, double b) {
		return a + b;
	}

}
