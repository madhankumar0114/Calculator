package calc.madhan.types;

public enum CalculatorType {
	SIMPLE("Simple"), COMPLEX("Complex"), MADHAN("Madhan");

	private String name;

	CalculatorType(String name) {
		this.name = name + " calculator";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
