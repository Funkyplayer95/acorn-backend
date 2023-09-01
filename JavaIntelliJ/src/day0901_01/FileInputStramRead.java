package day0901_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class FileInputStramRead {
    public static void main(String[] args) throws FileNotFoundException {
        String sFileName = "test.txt";
        //파일 시스템 관리자에게 iNode 요청해서
        //기존 파일 시스템과 하드디스크 사이에 연결된 채널(스트림)정보 얻어옴
        File objFile = new File(sFileName);
        try {
            FileInputStream fis = new FileInputStream(objFile);
//            System.out.println(fis.read());
        }catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재하지 않습니다.");
//            e.printStackTrace();


        }
    }
}
