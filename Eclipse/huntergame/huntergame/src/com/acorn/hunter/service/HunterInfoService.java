package com.acorn.hunter.service;

import java.util.ArrayList;
import java.util.List;

import com.acorn.hunter.dao.HunterInfoDao;
import com.acorn.hunter.dto.HunterTabDto;
import com.acorn.hunter.entity.HunterTab;

public class HunterInfoService {
	
	/***
	 * @description: 사냥꾼 정보 가져오기
	 * @return: 사냥꾼 정보 리스트
	 * @since 2023.10.23
	 * @update 
	 * @author 김형태
	 */
	public List<HunterTabDto> getHunterInfo() {
		List<HunterTab> hunterTabsList = 
				new HunterInfoDao().getHunterInfo();
		
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
