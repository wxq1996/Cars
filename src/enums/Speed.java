package enums;

//���������Ҫ��
public enum Speed {
	MIN(3),//����ÿһ�������ף���������ط�Ҫ����2���������6��ÿ��
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