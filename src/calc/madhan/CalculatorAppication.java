package calc.madhan;

import java.util.List;
import java.util.Scanner;

import calc.madhan.calculator.Calculator;
import calc.madhan.calculator.CalculatorFactory;
import calc.madhan.operation.Operation;
import calc.madhan.operation.impl.OperatorFactory;
import calc.madhan.types.CalculatorType;
import calc.madhan.types.OperationType;

public class CalculatorAppication {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Please select your calculator type : ");

			int i = 1;
			for (CalculatorType type : CalculatorType.values()) {
				System.out.println(i++ + ". " + type.getName());
			}
			
			int calcType = input.nextInt();
			Calculator calculator = CalculatorFactory.getCalculator(CalculatorType.values()[calcType-1]);

			i = 1;
			System.out.println("Available operations are\n");
			List<OperationType> availableOperations = calculator.getAvailableOperations();
			for (OperationType type : availableOperations) {
				System.out.println(i++ + ". " + type.getName());
			}
			
			int operationType = input.nextInt();
			Operation operation = OperatorFactory.getOperation(availableOperations.get(operationType - 1));

			System.out.println("Enter two numbers:");
			double x = input.nextDouble();
			double y = input.nextDouble();
			calculator.setData(x, y, operation);

			System.out.println("Answer = " + calculator.calculate());
		}
	}
}
