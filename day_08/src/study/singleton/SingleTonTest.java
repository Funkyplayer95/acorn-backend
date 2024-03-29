package study.singleton;

public class SingleTonTest { // 리모콘 같은 느낌. 딱하나만 생성하게
	private static SingleTonTest instance = null;
	
	private String name;
	
	private SingleTonTest() {}
	
	private SingleTonTest(String name) {
		this.name = name;
	}	
	
	public static SingleTonTest getInstance(String name) {
		
		if(instance == null) {
			instance = new SingleTonTest(name);
			System.out.println("생성한" + name + "객체를 리턴합니다.");
		}
		else {
			System.out.println("이미 생성된" + name + "객체를 리턴합니다.");			
		}
		return instance;
	}
	
}
