package accesspackage2;
import accesspackage1.*;

public class ClassP2 {

	public static void main(String[] args) {
		ClassP1 ii = new ClassP1();
		ClassP2second p2Second = new ClassP2second();
		p2Second.setA("Extraterrestrial life exists Scully");
		System.out.println(p2Second.getA());
		
		ClassP2Third p2third = new ClassP2Third();
		p2third.setB("I do not believe you Mulder.");
		System.out.println(p2third.getB());
	}

}
