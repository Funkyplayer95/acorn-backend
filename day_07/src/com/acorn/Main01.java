package com.acorn;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sInputMsgArr = new String[10]; 
		int iInputArrSize = sInputMsgArr.length;
		int i = 0;
		String exitCode = "99";
		String sInputLine = "";
		int iInputLineCnt = 0;
		char cSearchChar = 'a';
		char[] cResult = new char[100]; // #시작문자 '#'
		int iResultIdx = 0;
		
		while(true)
		{
			sInputLine = sc.nextLine();
			if(sInputLine.equals(exitCode)) { 
				iInputLineCnt = i; break;
			}
			sInputMsgArr[i] = sInputLine;
			i++;
			if(i > iInputArrSize) {
				iInputLineCnt = i -1; break;
			}
		}
		
		for(int j = 0; j < iInputLineCnt; j++)
		{	
			int iCharIdx = 0;
			char[] cSearch = new  char[sInputMsgArr[j].length()];
			for(int k = 0; k < sInputMsgArr.length; k++) {
				cSearch[iCharIdx] = sInputMsgArr[j].charAt(k);
			}
			
			cResult[iResultIdx++] = '#';
			for(int l = 0; l < cSearch.length; l++)
			{
				if(cSearch[l] == cSearchChar)
				{	
					cResult[iResultIdx++] = (char)j;
					cResult[iResultIdx++] = (char)l;
				}
			}
			cResult[iResultIdx++] = '@';
			
		}
		
		sc.close();
	}

}