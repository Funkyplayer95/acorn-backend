package com.acorn;

public class Study01 {

	public static void main(String[] args) {
		long startMillsTime = System.currentTimeMillis();
		long startNanoTime = System.nanoTime();
		System.out.println("Strat : Hello World!!");
		for(int i =0; i<1000; i++)
		{
			for(int j=0; j<1000; j++)
			{
				System.out.println();
			}
		}
		System.out.println("End : Hello World!!");
		long endMillsTime = System.currentTimeMillis();
		long endNanoTime = System.nanoTime();
		long duringMillsTime = (endMillsTime - startMillsTime);
		long duringSecsTime = (endMillsTime - startMillsTime)/1000;
		long duringMicrosTime = (endNanoTime - startNanoTime)/10000;
		System.out.println("Secs:" + duringSecsTime);
		System.out.println("Mills:" + duringMillsTime);
		System.out.println("Micros:" + duringMicrosTime);
		
	}

}
