package Learn;

interface cold9{
	
	public void method1();
	public void method2();
	
}
class A implements cold9{

	@Override
	public void method1() {
		System.out.println("method1 test");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		System.out.println("method2 test");
		// TODO Auto-generated method stub
		
	}
	
}

class B extends A{
	public void method3(){
		System.out.println("Class B");
	}
	
	
}
public class Intest {
	public static void main(String[] args) {
		
		A c= new A();
		c.method1();
		c.method2();
		B b = new B();
		b.method3();
	}
	

}
