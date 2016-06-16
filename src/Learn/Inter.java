package Learn;


interface Ian{
	public boolean Menatality();
	public boolean Good();
}

class ability implements Ian{
	
	public ability(){
		System.out.println("ok");
		
	}

	@Override
	public boolean Menatality() {
		System.out.println("Stable");
		return false;
	}

	@Override
	public boolean Good() {
		System.out.println("Unstable");
		return false;
	}
	
}
class abilitychild extends ability{
	public abilitychild(){
		System.out.println("Extended class");
	}
	@Override
	public boolean Good() {
		System.out.println("Extended class inheited property");
		return true;
	}
}
class rakhee implements Ian{

	@Override
	public boolean Menatality() {
		System.out.println("Rakesh class");
		
		return true;
	}

	@Override
	public boolean Good() {
		System.out.println("Rakesh class details");
		
		return true;
	}
	
}
	class rchild extends rakhee{
		public rchild(){
			System.out.println("inside rchild");
		}
	}	
	
	
	/*abstract class pradeep implements Ian{

		@Override
		public boolean Menatality() {
			System.out.println("Last implemented class");
			return false;
		}

		//@Override
		//public boolean Good() {
			// TODO Auto-generated method stub
			//return false;
		}*/
		
	
public class Inter {
	public static void main(String[] args) {
		Ian ability = new ability();
		ability.Menatality();
		ability.Good();
		
		/*Ian Asha= new Asha();
		Asha.Menatality();
		Asha.Good();*/
		
		Ian rakhee = new rakhee();
		rakhee.Menatality();
		rchild rc = new rchild();
		rc.Menatality();
		
		ability ab= new ability();
		ab.Menatality();
		ab.Good();
	
		
	
	}
	
	}

