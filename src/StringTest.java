
public class StringTest {
	public static void main(String[] args) {
		String name = "abc;nenu:rakesh";
		System.out.println(name+":"+name.hashCode());
		name = name.replace(";"," hi");
		name = name.replace("nenu", "hello");
		System.out.println(name+";"+name.hashCode());
		System.out.println(name);
		System.out.println("string length()"+name.length());
		String content = "hijavawelcomejavabyejavabolojava";
		String searchingWord ="java";
		int totallen = content.length();
		content = content.replace(searchingWord,"");
		int newlen= content.length();
		System.out.println((totallen-newlen)/searchingWord.length());
		name = name.replaceAll(name, "10");
		System.out.println(name);
	}

}