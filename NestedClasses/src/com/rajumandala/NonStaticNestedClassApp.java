package com.rajumandala;
/*
 * Non-static nested classes (inner classes) have access to the fields of the enclosing class, even if they are declared private.
 * 
 * Inner Class Shadowing: If a Java inner class declares fields or methods with the same names as field or methods in its enclosing class, 
 * the inner fields or methods are said to shadow over the outer fields or methods. 
 * 
 * Outer and Inner class contains a field named **name**. When the Inner class refers to **name** it refers to its own field. 
 * When Outer refers to **name** it also refers to its own field. 
 * for the Inner class to refer to the **name** field of the Outer class. To do so it has to prefix the **name** field reference with Outer.this.
 */
class OuterClass {
	private String text = "I am private!";
	private String name = "I am Outer Class";
	
	public void someMethod() {
		System.out.println("Printing from Outer Method "+name);
	}
	public class InnerClass {
		private String name = "I am Inner Class";
		public void printText() {
			System.out.println(text);
			
			//Inner Class Shadowing Outer field with same name
			System.out.println(name);
		}
		
		//Inner Class Shadowing Outer method with same method name
		public void someMethod() {
			System.out.println("Printing from Inner Method "+name);
			
			// Referring Outer field when inner field is shadowing
			System.out.println("Printing from Inner Method "+OuterClass.this.name);
		}
	}
}

public class NonStaticNestedClassApp {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();

		inner.printText();
		inner.someMethod();
	}
}
