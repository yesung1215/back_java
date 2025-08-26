package access;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;
	
	public Access1() {;}

	public Access1(int data1, int data2, int data3, int data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
//	getter 가져오는 거
	public int getData4() { // public: 어디서 사용할지 모르니 일단 붙이기
		return data4;
	}
	
//	setter 수정하는 거
	public void setData4(int data4) {
		this.data4 = data4;
	}
	
}
