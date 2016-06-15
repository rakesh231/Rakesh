package Learn;
interface ITest {
	
	public boolean sendEmail();
	
	public boolean print();
}

abstract class yahoo implements ITest{

	public yahoo() {
		System.out.println("yahoo constractor initialized");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean sendEmail() {
		// TODO Auto-generated method stub
		System.out.println("sending email using yahoo server");
		return false;
	}
	
	
}

class rakesh extends yahoo{
	public rakesh() {
		System.out.println("rakesh constractor");
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean print() {
		System.out.println("Printing email using microsoft Drivers");
		return true;
	}
	
}

class gmail implements ITest{

	@Override
	public boolean sendEmail() {
		System.out.println("sending email using gmail server");
		return true;
	}

	@Override
	public boolean print() {
		System.out.println("Printing email using HP Drivers");
		return true;
	}
	
	
}

class gmailChild extends gmail{
	
	public gmailChild() {
		System.out.println("inside gmail child");// TODO Auto-generated constructor stub
	}
}

class outlook implements ITest{

	@Override
	public boolean sendEmail() {
		System.out.println("sending email using outlook server");
		return true;
	}

	@Override
	public boolean print() {
		System.out.println("Printing email using microsoft Drivers");
		return true;
	}
	
	
}


public class Inter2{
	
	public static void main(String[] args){
		
		ITest gmail = new gmail();
		
		gmail.sendEmail();
		
		gmail.print();
		
		
		ITest outlook = new outlook();
		
		outlook.sendEmail();
		
		outlook.print();
		
		rakesh r = new rakesh() ;
		
		r.sendEmail();
		
		gmailChild gc = new  gmailChild();
		gc.sendEmail();
		gc.print();
		
	} 
}

