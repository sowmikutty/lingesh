package org.bank;

public class GreenBank extends AxisBank{
	
	public void saving() {
		System.out.println("15%");

	}
	public static void main(String[] args) {
		GreenBank g = new GreenBank();
		g.current();
		g.fixed();
		g.saving();
	}
		
	}


