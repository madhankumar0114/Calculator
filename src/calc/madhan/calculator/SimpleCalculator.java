package calc.madhan.calculator;

import java.util.ArrayList;
import java.util.List;

import calc.madhan.types.OperationType;

public class SimpleCalculator extends Calculator {

	@Override
	public List<OperationType> getAvailableOperations() {
		List<OperationType> operations = new ArrayList<>();
		operations.add(OperationType.ADD);
		operations.add(OperationType.SUB);
		return operations;
	}

}
