package com.csi.springcore;

public class Address {

	public Address(String str)
	{
		
	}
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("shivani");
		a.hashCode();
		System.out.println(a.hashCode());
		StringBuffer a1=new StringBuffer("shivani");
		System.out.println(a1.hashCode());
		System.out.println(a.equals(a1));
		System.out.println(a==a1);
		
		String s=new String("java");
		String s1=new String("java");
		System.out.println(s.hashCode());
		System.out.println(s.equals(s1));
		System.out.println(s1.hashCode());
		System.out.println(s==s1);
	}
}
