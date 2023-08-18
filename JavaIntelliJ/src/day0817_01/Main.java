package com.acorn.inheritance;

public class Main {

	public static void main(String[] args) {	
		TVChild[] objArr1 = new TVChild[10];
		objArr1[0] = new TVChild(false, 10, 20);
		objArr1[1] = new TVChild(true, 20, 30);
		
		AudioChild[] objArr2 = new AudioChild[10];
		objArr2[0] = new AudioChild(true, 10);
		
		// 다형성(polymorphism)
		// 여러 데이터 타입의 자식 객체를 부모타입으로 부를 수 있음	
		AudioTVParent objParent1 = new TVChild(true, 30, 40);
		AudioTVParent objParent2 = new AudioChild(true, 10);
		
		// 부모는 자식의 레퍼런스를 저장하는 것이 가능: 배열 가능
		AudioTVParent[] objArr = new AudioTVParent[2];
		objArr[0] = new TVChild(true, 30, 40);
		objArr[1] = new AudioChild(true, 10);
		
		// 부모는 자신의 영역에 있는 
		// 필드나 메소드만 접근 가능: 제한 사항
		for(int i = 0; i < objArr.length; i++)
		{
			if(objArr[i] instanceof TVChild)
			{
				((TVChild)objArr[0]).watch();			
			} 
			else if(objArr[i] instanceof AudioChild)
			{
				((AudioChild)objArr[1]).tune();				
			}

		}
	}

}
