package com.wordsalad.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wordsalad.dto.CmtDto;
import com.wordsalad.entity.Cmtinfo;
import com.wordsalad.repository.CmtRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional // 데이터를 불러와서 db에 넣고 실행이 끝나면 모든 작업들을 원상태로 되돌릴 수 있다. 안쓰는곳엔 (readOnly=true)
@RequiredArgsConstructor
public class CmtService {

	private final CmtRepository cmtRepository;

	public CmtDto getcmtInfo(int postnumber){
		Cmtinfo cmtinfo = cmtRepository.findById(postnumber).orElseThrow(EntityNotFoundException::new);

		CmtDto cmtDto = new CmtDto();
		
		cmtDto.setCOMMENT_SEQ(cmtinfo.getCOMMENT_SEQ());
		cmtDto.setCOMMENTCONTENTS(cmtinfo.getCOMMENTCONTENTS());
		cmtDto.setCOMMENTDATE(cmtinfo.getCOMMENTDATE());
		cmtDto.setCOMMENTHATE(cmtinfo.getCOMMENTHATE());
		cmtDto.setCOMMENTLIKE(cmtinfo.getCOMMENTLIKE());
		cmtDto.setCOMMENTWRITER(cmtinfo.getCOMMENTWRITER());
		cmtDto.setPostinfo(cmtinfo.getPostinfo());
		
		return cmtDto;
		
	}
	
	public List<CmtDto> getList(int postnumber){
		List<CmtDto> ListDto = new ArrayList<CmtDto>();
		CmtDto cmtDto = new CmtDto();
		
		
		
		return ListDto;
	}
	
		
		
		
		
		//		List<Cmtinfo> cmtSingle = cmtRepository.findAll();
//		List<CmtDto> cmtDtoAll = new ArrayList<CmtDto>();
//		
//		for (Cmtinfo cmt : cmtSingle) {
//			CmtDto cmtListDto =new CmtDto(
//					cmt.getCOMMENT_SEQ(),
//					cmt.getPOSTNUMBER(),
//					cmt.getCOMMENTCONTENTS(),
//					cmt.getCOMMENTWRITER(),
//					cmt.getCOMMENTDATE(),
//					cmt.getCOMMENTLIKE(),
//					cmt.getCOMMENTHATE());
//			cmtDtoAll.add(cmtListDto);
//		}
//		
//		return cmtDtoAll;		
//	}
}
