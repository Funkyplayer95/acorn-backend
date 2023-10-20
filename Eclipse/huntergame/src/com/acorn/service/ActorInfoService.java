package com.acorn.service;

import java.util.ArrayList;
import java.util.List;

import com.acorn.dao.ActorInfoDao;
import com.acorn.dto.HunterTabDto;
import com.acorn.entity.HunterTab;

public class ActorInfoService {
	
	public List<HunterTabDto> getUserInfo() {
		List<HunterTab> hunterTabsList = 
				new ActorInfoDao().getUserInfo();
		
		HunterTabDto hunterTabDto = null;
		List<HunterTabDto> hunterTabDtosList =
				new ArrayList<HunterTabDto>();
		
		for(HunterTab hunterTab : hunterTabsList) {
			hunterTabDto = new HunterTabDto(
					(hunterTab.getId()) + 1,
					hunterTab.getHealth(),
					hunterTab.getAttackpower(),
					hunterTab.getDefencepower(),
					hunterTab.getCash(),
					hunterTab.getSpeed(),
					hunterTab.getX(),hunterTab.getY(),
					hunterTab.getType()
					);
			hunterTabDtosList.add(hunterTabDto);
			hunterTabDto = null;
		}
		return hunterTabDtosList;
	}
}
