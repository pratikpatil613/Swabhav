package com.techlab.basic;

public class SwapTest {
	public static void main(String args[]) {
		int a=10,b=20;
		int arr[]= {10,20};
		int temp=a;
		     a=b;
		     b=temp;
		     System.out.println("a="+a);
		     System.out.println("b="+b);
	     swap(arr);   
	     System.out.println(arr[0]);
	     System.out.println(arr[1]);
	     
		    
	}
	static void swap(int a[]) {
		int temp=0,j=1;
		for(int i=0;i<j;i++) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		//	System.out.println(a);
	//		System.out.println(a[1]);
			
		}
	}


}
