package com.capgemini.march09;



public class Varargss {
	public static void main(String[] args) {
		
		Calci c=new Calci();
		System.out.println(c.add(5,6,7,8));
	}
	
	

}

class Calci{
	public int add(int ...n ) {
		int sum=0;
		for(int i:n)
			sum=sum+i;
		return sum;
	}
}
