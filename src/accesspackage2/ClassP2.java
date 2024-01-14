package accesspackage2;
import accesspackage1.*;

public class ClassP2 {

	public static void main(String[] args) {
		ClassP1 ii = new ClassP1();
		ClassP2second p2Second = new ClassP2second();
		p2Second.setA("IT IS A TEST AGENT SCULLY");
		System.out.println(p2Second.getA());
	}

}
