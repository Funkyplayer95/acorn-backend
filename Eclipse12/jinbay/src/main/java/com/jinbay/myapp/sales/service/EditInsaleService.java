package com.jinbay.myapp.sales.service;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.sales.dao.UpdateInsale;

public class EditInsaleService {
	
	public void InsertInsale(HttpServletRequest req,String Goodscode, String insales) {
		
		UpdateInsale.getUpdate(Goodscode, insales);
		
		if(insales.equals("n")) { 
			UpdateInsale.InsertInsales(Goodscode);
			}
		if(insales.equals("y")) { 
			UpdateInsale.DeleteInsales(Goodscode);
			}
		}
}
