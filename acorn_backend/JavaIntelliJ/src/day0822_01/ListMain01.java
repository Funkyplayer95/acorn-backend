package day0822_01;

import java.util.ArrayList;
import java.util.List;

public class ListMain01 {
    public static void main(String[] args) {
        //저장할 수 있는 데이터 타입 고정
        //처음에 지정한 사이즈를 변경할 수 없음
        //검색: 최적화 / 데이터 추가,삭제: 비효율적
        int[] iValueArr = {10,20,30};
        int iValue = 10;

//        int[] iValueArr = {10,20,30,,30.3};
//        List : 동적 배열
//        List<String> sNames = new ArrayList<>();  JAVA8부터 우측 <> 에 String 안넣어도 읽힘
        List<String> sNames = new ArrayList<String>();
        sNames.add(0,"aa");
        sNames.add("bb");
        sNames.add("cc");
        for (int i = 0; i < sNames.size(); i++) {
            System.out.println(sNames.get(i));
        }
        System.out.println("==========================");

        sNames.remove(1);
        for (int i = 0; i < sNames.size(); i++) {
            System.out.println(sNames.get(i));
        }
        System.out.println();
        List<Integer> iScore = new ArrayList<Integer>();
        iScore.add(1);
        iScore.add(10);
        iScore.add(100);
        for (int x : iScore){
            System.out.println(x);
        }
        System.out.println("======================");
        iScore.remove(0);
        for (int x : iScore){
            System.out.println(x);
        }
    }
}
