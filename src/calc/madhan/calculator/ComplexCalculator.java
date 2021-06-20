package calc.madhan.calculator;

import java.util.ArrayList;
import java.util.List;

import calc.madhan.types.OperationType;

public class ComplexCalculator extends SimpleCalculator {

	@Override
	public List<OperationType> getAvailableOperations() {
		List<OperationType> operations = new ArrayList<>(super.getAvailableOperations());
		operations.add(OperationType.MUL);
		operations.add(OperationType.DIV);
		operations.add(OperationType.MOD);
		return operations;
	}

}
