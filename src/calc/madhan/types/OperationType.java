package calc.madhan.types;

public enum OperationType {
	ADD("Add"), SUB("Subtract"), MUL("Multiply"), DIV("Divide"), MOD("Modulus"), MADH("Madh");

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
