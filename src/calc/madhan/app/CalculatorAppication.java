package calc.madhan.app;

import java.util.Scanner;

import calc.madhan.Calculator;
import calc.madhan.CalculatorFactory;
import calc.madhan.operation.Operation;
import calc.madhan.operation.OperationType;
import calc.madhan.operation.OperatorFactory;

public class CalculatorAppication {

	public static void main(String[] args) {
		// TODO:next task
		// Madhan -> add, div, mod, madh
		// Madh -> a,b -> (a+b) + (a-b)

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please select your calculator type : ");
			System.out.println("1. Simple calculator");
			System.out.println("2. Complex calculator");

			int calcType = input.nextInt();
			Calculator calculator = CalculatorFactory.getCalculator(calcType);

			int i = 1;
			System.out.println("Available operations are\n");
			for (OperationType type : calculator.getAvailableOperations()) {
				System.out.println(i++ + ". " + type.getName());
			}

			int operationType = input.nextInt();
			Operation operation = OperatorFactory.getOperation(operationType);

			System.out.println("Enter two numbers:");
			double x = input.nextDouble();// 5
			double y = input.nextDouble();// 3
			calculator.setData(x, y, operation);

			System.out.println("Answer = " + calculator.calculate());
		}
	}
}
