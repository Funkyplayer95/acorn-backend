package day0913_01;

import java.util.ArrayList;

public interface FileDriver {

    ArrayList<String> fileOpen(String path);

    String searchContents(ArrayList<String> sArrList,String searchword);
//    String searchContents
}
