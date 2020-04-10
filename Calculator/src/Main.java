
public class Main{
	public static void main(String[] args) {
		int i1 = 23;
		int i2 = 18;
		short s1 = 4;
		short s2 = 5;
		double d1 = 34.5;
		double d2 = 65.4;
		float f1 = 27;
		float f2 = 893;
		
		
		Calculator calc = new Calculator();
		System.out.println("Hej!");
		System.out.println("Summan av: "+i1 +" + "+i2 +" är: "+calc.addition(i1, i2));
		System.out.println("Differensen av: "+i1 +" - "+i2 +" är: "+calc.subtraction(i1, i2));
		System.out.println("Summan av: "+s1 +" + "+s2 +" är: "+calc.addition(s1, s2));
		System.out.println("Differensen av: "+s1 +" - "+s2 +" är: "+calc.subtraction(s1, s2));
		System.out.println("Summan av: "+d1 +" + "+d2 +" är: "+calc.addition(d1, d2));
		System.out.println("Differensen av: "+d1 +" - "+d2 +" är: "+calc.subtraction(d1, d2));
		System.out.println("Summan av: "+f1 +" + "+f2 +" är: "+calc.addition(f1, f2));
		System.out.println("Differensen av: "+f1 +" - "+f2 +" är: "+calc.subtraction(f1, f2));
	}

}
