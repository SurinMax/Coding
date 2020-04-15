package com.surin.match;

public class test {

	public static void main(String[] args) {
		int a = 3;
		int b = 2;
		int res = (a/b);
		if(a%b > 0) {
			res+=1;
		}
		res*=2;
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(res);

	}

}
