package day0818_01_abstract;

public class Main02 {
    public static void main(String[]args){
        DataBaseMoudule db = new OracleDatabaseMoudule();
        int iRet = db.insert("test");
        System.out.println(iRet);

        System.out.println("===================");

        String sRet = db.select();
        System.out.println(sRet);

        System.out.println(DataBaseMoudule.DB_VERSION);
        System.out.println("===================");

        System.out.println(DataBaseMoudule.add(1,2));

    }
}
