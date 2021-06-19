package calc.madhan;

import java.util.List;

import calc.madhan.operation.Operation;
import calc.madhan.operation.OperationType;

public abstract class Calculator {

	private double a;
	private double b;
	private Operation op;

	public void setData(double a, double b, Operation op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Operation getOp() {
		return op;
	}

	public void setOp(Operation op) {
		this.op = op;
	}

	public abstract List<OperationType> getAvailableOperations();

	public double calculate() {
		return op.apply(a, b);
	}

}
