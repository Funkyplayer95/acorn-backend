package day0913_01.fsearchClient;

import day0913_01.FileDriver;
import day0913_01.FileDriverImpl;

import java.util.ArrayList;

public class Runmain {
    public static void main(String[] args) {
        String fName = "C:\\Users\\hbi2\\Desktop\\acorn-studyBackend\\JavaIntelliJ\\src\\day0913_01\\fsearchClient\\데이터정보저장.txt";

        FileDriver fdr = new FileDriverImpl();
        ArrayList<String> sArrList = fdr.fileOpen(fName);
        String sTarget = fdr.searchContents(sArrList, "서울");
        System.out.println(sTarget);
    }
}
