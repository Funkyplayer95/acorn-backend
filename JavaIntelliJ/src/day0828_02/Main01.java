package day0828_02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main01 {
    public static void main(String[] args) {
        // 일반변수 : 데이터타입 변수 = 값
        // 특수변수 : 데이터타입 배열명 = new 데이터타입[사이즈]
        //   요소1 요소2 요소3...요소n
        //   배열명[위치값]
        //   배열의 문제점 : 지정할 수 있는 데이터 타입이 한가지 -> 다형성
        //                 배열의 사이즈가 고정 -> List, HashMap
        // 리스트 : public interface List<E>
        // public class ArrayList<E> implements List : 동적 배열
        // E : 객체만 가능
        // String sVale; ArrayList<String> -> 0
        // int, double : ArrayList<int> -> X -> ArrayList<Integer> : Wapper 클래스
        List<String> objeStrList = new ArrayList<String>(); // 다형성
//        System.out.println(objeStrList.size());
        objeStrList.add("str");
//        System.out.println(objeStrList.size());
        objeStrList.add("str2");
        for (int i = 0; i < objeStrList.size(); i++) {
            System.out.println(objeStrList.get(i));
        }
        Map<String,String> objStrMap = new HashMap<String,String>();
        System.out.println(objStrMap.size());
        objStrMap.put("서울","고길동"); objStrMap.put("대전","허준");
        System.out.println(objStrMap.get("서울"));
        System.out.println("===================");

        ArrayList<HashMap<Integer,String>> objStrList2 = new ArrayList<HashMap<Integer,String>>();
        HashMap<Integer,String> objStrMap2 = new HashMap<Integer,String>();
        HashMap<Integer,String> objStrMap3 = new HashMap<Integer,String>();
        objStrMap2.put(1,"고길동1");objStrMap2.put(2,"고길동2");objStrMap2.put(3,"고길동3");
        objStrMap3.put(1,"허준1");objStrMap3.put(2,"허준2");objStrMap3.put(3,"허준3");
        objStrList2.add(objStrMap2); objStrList2.add(objStrMap3);
        for (int i = 0; i < objStrList2.size(); i++) {
            for (int j = 1; j <= objStrList2.get(i).size(); j++) {
                System.out.println(objStrList2.get(i).get(j));
            }

        }
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);

            }

        }

    }
}
