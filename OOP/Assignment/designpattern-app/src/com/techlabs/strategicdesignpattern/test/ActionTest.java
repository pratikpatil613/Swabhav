package com.techlabs.strategicdesignpattern.test;

import com.techlabs.strategicdesignpattern.Action;
import com.techlabs.strategicdesignpattern.Contex;
import com.techlabs.strategicdesignpattern.Play;
import com.techlabs.strategicdesignpattern.Read;
import com.techlabs.strategicdesignpattern.Walk;

public class ActionTest {
	public static void main(String[] args) {
		Contex contex = new Contex(new Play());
		contex.doActon();
		
		 contex = new Contex(new Read());
		 contex.doActon();
		 
		 contex=new Contex(new Walk());
		 contex.doActon();
		 


	}

}
