package com.wordsalad.service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.wordsalad.dto.PostDto;
import com.wordsalad.entity.Postinfo;
import com.wordsalad.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional // 데이터를 불러와서 db에 넣고 실행이 끝나면 모든 작업들을 원상태로 되돌릴 수 있다. 안쓰는곳엔 (readOnly=true)
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	public PostDto getpostInfo(int postnum) {

		Postinfo postinfo = postRepository.findById(postnum).orElseThrow(EntityNotFoundException::new);
		PostDto postDto = new PostDto();
		
		postDto.setPOSTNUMBER(postinfo.getPOSTNUMBER());
		postDto.setPOSTTITLE(postinfo.getPOSTTITLE());
		postDto.setPOSTCONTENTS(postinfo.getPOSTCONTENTS());
		postDto.setPOSTWRITER(postinfo.getPOSTWRITER());
		postDto.setPOSTDATE(postinfo.getPOSTDATE());
		postDto.setPOSTLIKE(postinfo.getPOSTLIKE());
		postDto.setPOSTHATE(postinfo.getPOSTHATE());
		
		return postDto;

	}
}
