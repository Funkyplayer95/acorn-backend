package com.acorn;

public class _JAVA01 {

	public static void main(String[] args) {

		// 예제 1-1
		//		System.out.println("Hello World");

		//예제 2-1
		//		int year = 0;
		//		int age = 14;
		//		
		//		System.out.println(year);
		//		System.out.println(age);
		//		
		//		year = age +2000;
		//		age = age + 1;
		//		
		//		System.out.println(year);
		//		System.out.println(age);


		//예제 2-2
		//		int x = 10 , y = 20;
		//		int tmp = 0;
		//
		//		System.out.println("x:" + x + " y:" + y);
		//
		//		tmp = x;
		//		x = y;
		//		y = tmp;
		//		
		//		System.out.println("x:" + x + " y:" + y);
		
		//예제 2-3
		//		String name = "ja"+"va";
		//		String str = name + 0.8;
		//		
		//		System.out.println(name);
		//		System.out.println(str);
		//		System.out.println(7 + " ");
		//		System.out.println(" " +7);
		//		System.out.println(7 +"");
		//		System.out.println("" + 7);
		//		System.out.println(""+"");
		//		System.out.println(7+7+"");
		//		System.out.println(""+7+7);
		
		//예제 2-4
				byte b = 1;
				short s =2;
				char c = 'A';
				
				int finger = 10;
				long big = 100_000_000_000L;
				long hex = 0xFFFF_FFFF_FFFF_FFFFL;
				
				int octNum = 010;
				int hexNum = 0x10;
				int binNum = 0b10;
				
				System.out.printf("b=%d%n", b);
				System.out.printf("s=%d%n", s);
				System.out.printf("c=%c, %d %n",c, (int)c);
				System.out.printf("finger=[%5d]%n", finger); //여기서부터는 내일 물어보자
				System.out.printf("finger=[%-5d]%n", finger);
				System.out.printf("finger=[%05d]%n", finger);
				System.out.printf("big=%d%n", big);
				System.out.printf("hex=%#X%n", hex);
				System.out.printf("octNum=%o, %d%n", octNum, octNum);
				System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
				System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		
		//예제 2-7
		//		char ch = 'A';
		//		int code = (int)ch;
		//		
		//		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		//		
		//		char hch = '가';
		//		System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);
		
		//예제 2-8
//		System.out.println('\'');
//		System.out.println("abc\t123\b456");
//		System.out.println('\n');
//		System.out.println("\"Hello\"");
//		System.out.println("c:\\");
		
		
		
		


	}

}
