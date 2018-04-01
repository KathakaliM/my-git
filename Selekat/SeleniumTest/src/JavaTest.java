

import java.util.Scanner;

public class JavaTest {
	int a = 10;
	int b = 20;
	int c;

	public void add() {
		
		 System.out.println("Input a " +a );
		c = a + b;
		System.out.println("adding two variable " + c);
	}

	
	public void mul()
	{
		c= a*b;
		System.out.println("mul two variable " +c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaTest Jt = new JavaTest();
		Jt.add();
		Jt.mul();

	}

}
