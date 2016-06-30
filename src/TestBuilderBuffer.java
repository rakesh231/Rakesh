
public class TestBuilderBuffer {
	public static void main(String[] args) {
		String nameString = new String("Rakhee"); // immutable
		StringBuffer nameBuffer = new StringBuffer("Rakhee");// Mutable ; Synchronized
		StringBuilder nameBuilder = new StringBuilder("Rakhee");// Mutable ; non Synchronized

		
		System.out.println("nameString Ref "+nameString+" : "+nameString.hashCode());
		System.out.println("nameBuffer Ref "+nameBuffer+" : "+nameBuffer.hashCode());
		System.out.println("nameBuilder Ref "+nameBuilder+" : "+nameBuilder.hashCode());
		
		nameString += " RakeshJava" ; // x +=5;  -->  x = x+5;
		nameBuffer.append(" RakeshJava");
		nameBuilder.append(" RakeshJava");
		
		System.out.println("nameString Ref "+nameString+" : "+nameString.hashCode());
		System.out.println("nameBuffer Ref "+nameBuffer+" : "+nameBuffer.hashCode());
		System.out.println("nameBuilder Ref "+nameBuilder+" : "+nameBuilder.hashCode());
		
		
	}
}