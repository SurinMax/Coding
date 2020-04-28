package com.surin.clone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Obj1 obj1 = new Obj1();
		obj1.i = 1;
		Obj2 obj2 = new Obj2();
		obj1.obj2 = obj2;
		obj1.obj2.j = 1;
		
		Obj1 newObj1;
		newObj1 = obj1.clone();
		newObj1.i = 2;
		newObj1.obj2.j = 2;
		System.out.println(obj1.i);
		System.out.println(obj1.obj2.j);
		

		System.out.println(newObj1.i);
		System.out.println(newObj1.obj2.j);
	}

}

class Obj1 implements Cloneable {
	int i;
	Obj2 obj2;

	@Override
	protected Obj1 clone() throws CloneNotSupportedException {
		Obj1 obj1 = (Obj1)super.clone(); 
		obj1.obj2 = obj2.clone();
		return obj1;
	}
	
}

class Obj2 implements Cloneable{
	int j;

	@Override
	protected Obj2 clone() throws CloneNotSupportedException {
		return (Obj2)super.clone();
	}
	
}