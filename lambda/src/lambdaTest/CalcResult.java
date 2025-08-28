package lambdaTest;

public class CalcResult {
	private int sum;
	private int subtract;
	private double devide;
	private int multiple;
	
	public CalcResult() {;}
	public CalcResult(int sum, int subtract, double devide, int multiple) {
		this.sum = sum;
		this.subtract = subtract;
		this.devide = devide;
		this.multiple = multiple;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getSubtract() {
		return subtract;
	}
	public void setSubtract(int subtract) {
		this.subtract = subtract;
	}
	public double getDevide() {
		return devide;
	}
	public void setDevide(double devide) {
		this.devide = devide;
	}
	public int getMultiple() {
		return multiple;
	}
	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}
	
	
}
