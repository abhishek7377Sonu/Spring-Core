package com.nt;
/*
public class FibonaciSeries {
	public static void main(String[] args) {
		m1(8);
	}

	private static void m1(int n) {
		int a = 0;
		int b = 1;
		int sum = 0;
		int temp=0;
		while(temp<n-2) {
			sum=a+b;
			a=b;
			b=sum;
			temp++;
		}
		System.out.println(sum);
	}
}
*/
public class FibonaciSeries {
	int a=10;
			int b=20;
	void m1() {
		System.out.println(this.a);
		System.out.println(this.b);
		int a=5;
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(a);
		//System.out.println(FibonaciSeries.a);
	}
	public static void main(String[] args) {
		FibonaciSeries f1=new FibonaciSeries();
		System.out.println(f1.a);
		f1.m1();
	
		
	}
	
}
	