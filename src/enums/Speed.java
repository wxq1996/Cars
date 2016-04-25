package enums;

//这个后面需要改
public enum Speed {
	MIN(3),//由于每一格算两米，所以这个地方要除以2，最低速是6米每秒
	NORMAL_1(4),
	NORMAL_2(5), 
	NORMAL_3(6),
	NORMAL_4(7),
	MAX(8);
	private int value = 0;
	private Speed(int value) {
		this.value = value;
	}
	public int value() {
		return this.value;
	}
}