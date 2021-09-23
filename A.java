package org.testng;

import org.testng.annotations.Test;

public class A {
	
	@Test(priority=10)
	private void tc11() {
		System.out.println("test case 11");
	}
	
	@Test(priority=-2)
	private void tc12() {
		System.out.println("test case 12");
	}
	
	@Test(priority=-6)
	private void tc13() {
		System.out.println("test case 13");
	}

	@Test
	private void tc14() {
		System.out.println("test case 14");
	}

	@Test
	private void tc55() {
		System.out.println("test case 55");
	}
	
	@Test
	private void tc66() {
		System.out.println("test case 66");
	}

}
