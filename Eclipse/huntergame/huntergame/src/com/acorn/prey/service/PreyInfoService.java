package com.acorn.prey.service;

import java.util.ArrayList;
import java.util.List;

import com.acorn.prey.dao.PreyInfoDao;
import com.acorn.prey.dto.PreyTabDto;
import com.acorn.prey.entity.PreyTab;

public class PreyInfoService {
	
	public List<PreyTabDto> getPreyInfo() {
		List<PreyTab> preyTabsList = 
				new PreyInfoDao().getPreyInfo();
		
		PreyTabDto preyTabDto = null;
		List<PreyTabDto> preyTabDtosList =
				new ArrayList<PreyTabDto>();
		
		for(PreyTab peryTab : preyTabsList) {
			preyTabDto = new PreyTabDto(
					peryTab.getHealth(),
					peryTab.getDefencepower(),
					peryTab.getX(),peryTab.getY());
					preyTabDtosList.add(preyTabDto);
			preyTabDto = null;
		}
		return preyTabDtosList;
	}
}
