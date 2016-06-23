class Test{
	int x;
	int y;
	public Test(int x, int y){
		this.x = x;
		this.y =y;
	}
}
public class CallbyValue {
	public static void main(String[] args) {
		System.out.println("pass by value");
		int x = 10;
		int y= 20;
		System.out.println("Before calling Method:" + x);
		method(x);
		System.out.println("After calling Method:" + x);
		System.out.println("call by reference");
		Test t = new Test(1000, 2000);
		System.out.println("Before Calling abc value :" +t);
		System.out.println("Before Calling abc y value:" +t.y);
		System.out.println("before Caling abc x value:" +t.x);
		abc(t);
		System.out.println("After calling abc x value: " +t.x);
	}

	static void abc(Test t1) {
		t1.x =5000;
		t1.y= 3000;
		
		
	}

	static void method(int x) {
		x =500;
		
	}

	
}
