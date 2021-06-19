package calc.madhan.operation;

import calc.madhan.operation.impl.AddOperation;
import calc.madhan.operation.impl.DivideOperation;
import calc.madhan.operation.impl.ModulusOperation;
import calc.madhan.operation.impl.MultiplyOperation;
import calc.madhan.operation.impl.SubtractOperation;

public final class OperatorFactory {

	private OperatorFactory() {

	}

	public static Operation getOperation(int operationType) {
		if (operationType == 1) {
			return new AddOperation();
		} else if (operationType == 2) {
			return new SubtractOperation();
		} else if (operationType == 3) {
			return new MultiplyOperation();
		} else if (operationType == 4) {
			return new DivideOperation();
		} else if (operationType == 5) {
			return new ModulusOperation();
		} else {
			throw new RuntimeException("noki adiyada potta kanna");
		}
	}
}
