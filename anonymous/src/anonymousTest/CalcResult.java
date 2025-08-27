package anonymousTest;

public class CalcResult {
//	CalcResult calcResults = {new sum(), new subtract(), new multiple(), new divide()};
	private int num1;
	private int num2;
	private int add;
	private int subtract;
	private int multiple;
	private double divide;
	private CalcResult calcResult;
	
	public CalcResult() {;}
	public CalcResult(int num1, int num2, int add, int subtract, int multiple, double divide) {
		this.num1 = num1;
		this.num2 = num2;
		this.add = add;
		this.subtract = subtract;
		this.multiple = multiple;
		this.divide = divide;
		this.calcResult = calcResult;
	}
	int getNum1() {
		return num1;
	}
	void setNum1(int num1) {
		this.num1 = num1;
	}
	int getNum2() {
		return num2;
	}
	void setNum2(int num2) {
		this.num2 = num2;
	}
	int getAdd() {
		return add;
	}
	void setAdd(int add) {
		this.add = add;
	}
	int getSubtract() {
		return subtract;
	}
	void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	int getMultiple() {
		return multiple;
	}
	void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	double getDivide() {
		return divide;
	}
	void setDivide(double divide) {
		this.divide = divide;
	}
	
	public int add(int num1, int num2) {
		add = num1 + num2;
		return add;
	}
	public int subtract(int num1, int num2) {
		subtract = num1 - num2;
		return subtract;
	}
	public int multiple(int num1, int num2) {
		multiple = num1 * num2;
		return multiple;
	}
	public double devide(int num1, int num2) {
		divide = num1 / num2;
		return divide;
	}
	
//	public int calcResult(int num1, int num2) {
//		multiple = num1 * num2;
//		return multiple;
//	}
//	public double devide(int num1, int num2) {
//		divide = num1 / num2;
//		return divide;
//	}
	
}
