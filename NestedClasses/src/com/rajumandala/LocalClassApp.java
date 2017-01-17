package com.rajumandala;
/*
 * Local classes in Java are like inner classes (non-static nested classes) that are defined inside a method or scope block ({ ... }) inside a method.
 */

class OuterEnclosing {
	public void printText() {
		class Local {

		}
		Local local = new Local();
	}
}

public class LocalClassApp {
	public static void main(String[] args) {

	}
}
