package day2.java;

public class StaticEx1 {
	
	    static int x = 33;
	
        public static int add(int num1, int num2) {
        	System.out.println("X value : " + x);
        	return num1 + num2;
        	
        }
        // static blocks always gets executed first
        static {
        	System.out.println("I am from static block");
        }
        static {
        	System.out.println("I am from second static block");
        }
        public static void main(String [] args) {
        	
        	System.out.println("Result is " + add(20, 30));
        	System.out.println("X value : " + x);
        	
        }
}
