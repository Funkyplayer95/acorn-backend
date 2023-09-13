package day0913_01;

import java.util.ArrayList;

public class FileClient {
    public static void main(String[] args) {
        String fName = "C:\\Users\\hbi2\\Desktop\\acorn-studyBackend\\JavaIntelliJ\\src\\day0913_01\\데이터정보저장.txt";
        String serchWord = "경기";

        FileDriver fdr = new FileDriverImpl();
        ArrayList<String> aStrList = fdr.fileOpen(fName);
        String sRet = fdr.searchContents(aStrList, serchWord);
        System.out.println(sRet);
    }
}
