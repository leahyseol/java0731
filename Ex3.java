package com.exam;

interface IHello {
	// static final int
	public static final int RED = 1;
	int BLUE = 2;

	// �޼ҵ�� �߻�޼ҵ常 ������ ��
	void sayHello();

	public abstract void sayGoodbye();
}

class MyHello implements IHello {// �������̽� ����(������ ���)
	@Override
	public void sayHello() {
		System.out.println("Hello");
	}

	@Override
	public void sayGoodbye() {
		System.out.println("Goodbye");
	}
}

public class Ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IHello.RED);
		System.out.println(IHello.BLUE);
		// IHello.RED=10;
		// IHello.BLUE=20

		// IHello hello=new IHello();
		IHello iHello = new MyHello(); // upcasting
		iHello.sayHello();
		iHello.sayGoodbye();

	}

}
