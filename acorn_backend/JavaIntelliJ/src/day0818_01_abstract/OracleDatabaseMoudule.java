package day0818_01_abstract;

public class OracleDatabaseMoudule 
	implements DataBaseMoudule {

	@Override
	public int insert(String s) {
		System.out.println("Oracle Insert " + s);
		return 1;
	}

	@Override
	public String select() {
		String sRet = "Oracle select result";
		return sRet;
	}

}
