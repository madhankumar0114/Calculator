package calc.madhan.operation;

public enum OperationType {
	ADD("Add"), SUB("Subtract"), MUL("Multiply"), DIV("Divide"), MOD("Modulus");

	private String name;

	OperationType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
