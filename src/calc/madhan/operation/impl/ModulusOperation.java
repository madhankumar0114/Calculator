package calc.madhan.operation.impl;

import calc.madhan.operation.Operation;

public class ModulusOperation implements Operation {

	@Override
	public double apply(double a, double b) {
		return a % b;
	}

}
