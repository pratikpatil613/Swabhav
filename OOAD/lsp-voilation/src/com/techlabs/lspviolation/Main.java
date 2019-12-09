package com.techlabs.lspviolation;

import java.awt.Rectangle;

public class Main {
	public static void main(String[] args) {
		Rectangel r = new Rectangel(10, 20);
		Square s = new Square(30);
		
		shouldNotChange_width_if_Heigh_is_notChannge(r);
		shouldNotChange_width_if_Heigh_is_notChannge(s);
		r.setHeight(100);
		
		
	}

	public static void shouldNotChange_width_if_Heigh_is_notChannge(Rectangel r) {
           double before=r.getWidth();
           System.out.println(before);
           double after=r.getWidth();
           System.out.println(after);
           
           
           
		
		
	
	}

}
