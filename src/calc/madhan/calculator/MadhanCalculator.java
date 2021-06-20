package calc.madhan.calculator;

import java.util.ArrayList;
import java.util.List;

import calc.madhan.types.OperationType;

public class MadhanCalculator extends Calculator {

	@Override
	public List<OperationType> getAvailableOperations() {
		List<OperationType> operations = new ArrayList<>();
		operations.add(OperationType.ADD);
		operations.add(OperationType.DIV);
		operations.add(OperationType.MOD);
		operations.add(OperationType.MADH);
		return operations;
	}

}
