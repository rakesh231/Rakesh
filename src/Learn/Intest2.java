package Learn;

interface Honda{
	int Price = 22000;
	public void Accord ();
	public void coupe();
	public void sedan();
	
}
interface Nissan{
	int Price =24000;
	public void Ultima();
	public void coupe();
}

public class Intest2 implements Honda, Nissan{
	public static void main(String[] args) {
		//System.out.println(x);
		System.out.println(Honda.Price);
		System.out.println(Nissan.Price);
		
	}

	@Override
	public void Ultima() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Accord() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void coupe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sedan() {
		// TODO Auto-generated method stub
		
	}


}
