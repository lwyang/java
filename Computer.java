package com.ylw.ele;

public class Computer {
	private String paiZi;
	private KeyBoard keyBoard;
	 private CPU cpu;
	 class KeyBoard{
		private String color="red";
		private int keyCut;
	
		
	}
	class CPU{
		private String brand;
		private float frep;
	}
	public static void main(String[] aargs) {
		Computer c=new Computer();
      KeyBoard kb=c.new KeyBoard();
     
	  // Computer.KeyBoard kb=new Computer.KeyBoard();
		
		System.out.println(kb.color="red");
	}
	
}
