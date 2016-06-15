package Learn;

class Parent {
	int x;
	static{
		System.out.println("inside the static block");
		System.out.println("instance block inparent");
	
	}
	{
		String loaddriver = "intialized";
		System.out.println("loaddrivers...!!");
		System.out.println("instance block inparent");
	}

public Parent(){
	System.out.println("0 arg Parent");
}
public Parent(int x){
	this.x= x;
	System.out.println("1 arg Parent");
}
public Parent(int x, int y ){
	System.out.println("2 arg Parent");
}
}

class Test extends Parent{
	int x;
	
	
	static{
		System.out.println("inside the static block");
	
}

public Test() {
	
	System.out.println("0 arg child");
}

public Test(int x) {
	//super(10,20);
	
	//super(x,200);
	this();
	this.x = x;
	
	System.out.println("1 arg child");
}
}

public class Static{
	public static void main(String[] args) {
		Test t=new Test(10);
		
	}
}