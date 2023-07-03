package one.com;

public class WelcomeOne {

	public static void main(String[] args) {
		StringBuffer s= new StringBuffer("java");
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = new StringBuffer("python");
		
		int address = System.identityHashCode(s);
		System.out.println(address);
		int address1 = System.identityHashCode(s1);
		System.out.println(address1);
		int address2 = System.identityHashCode(s2);
		System.out.println(address2);
		int identityHashCode = System.identityHashCode(s.append(s1));
		System.out.println(identityHashCode);
		System.out.println("Welcome Wolrd!!!!!!!!");

	}

}
