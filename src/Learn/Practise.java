package Learn;

public class Practise {
	public Practise(){
		System.out.println("inside the constructor");
	}

	public void Practise(){
		System.out.println("inside the method");

	}
	
	public static void main(String[] args) {
		Practise p = new Practise();
		p.Practise();
	}
}




