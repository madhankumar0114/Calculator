package calc.madhan.operation.impl;

import calc.madhan.operation.Operation;
import calc.madhan.types.OperationType;

public final class OperatorFactory {

	private OperatorFactory() {

	}

	public static Operation getOperation(OperationType operationType) {
		switch (operationType) {
		case ADD:
			return new AddOperation();
		case SUB:
			return new SubtractOperation();
		case MUL:
			return new MultiplyOperation();
		case DIV:
			return new DivideOperation();
		case MOD:
			return new ModulusOperation();
		case MADH:
			return new MadhOperation();
		default:
			throw new RuntimeException("noki adiyada potta kanna");
		}		
	}
}
