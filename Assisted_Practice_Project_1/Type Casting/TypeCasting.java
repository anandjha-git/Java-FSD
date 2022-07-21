
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println("\tType Casting\n");
	
		char a = 'M';
		byte b=2;
		
		System.out.println("Value of char a = "+a);
		System.out.println("Value of byte b = "+b);
		System.out.println("\nImplicit Type Casting : \n");
		
		//Implicit Type Casting
		short c = b;
		int d = c;
		int e = a;
		long f = e;
		float g = f;
		double h = g;
		
		System.out.println("Value of short c = "+c);
		System.out.println("Value of int d = "+d);
		System.out.println("Value of int  e = "+e);
		System.out.println("Value of long f = "+f);
		System.out.println("Value of float g = "+g);
		System.out.println("Value of double h = "+h);
		
		System.out.println("\nExplilicit Type Casting : \n");
		
		//Explicit Type Casting
		double aa = 84.445;
		float bb = (float)aa;
		long cc = (long)bb;
		int dd = (int)cc;
		char ee = (char)dd;
		short ff = (short)ee;
		byte gg = (byte)ff;
		
		System.out.println("Value of double aa = "+aa);
		System.out.println("Value of float bb = "+bb);
		System.out.println("Value of long cc = "+cc);
		System.out.println("Value of int dd = "+dd);
		System.out.println("Value of char ee = "+ee);
		System.out.println("Value of short ff = "+ff);
		System.out.println("Value of byte gg = "+gg);
		
	}

}

// Output

/*
Type Casting

Value of char a = M
Value of byte b = 2

Implicit Type Casting : 

Value of short c = 2
Value of int d = 2
Value of int  e = 77
Value of long f = 77
Value of float g = 77.0
Value of double h = 77.0

Explilicit Type Casting : 

Value of double aa = 84.445
Value of float bb = 84.445
Value of long cc = 84
Value of int dd = 84
Value of char ee = T
Value of short ff = 84
Value of byte gg = 84
*/