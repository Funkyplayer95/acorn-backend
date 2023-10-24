package springmybatis.dao;

import springmybatis.dto.Member;

public interface IMemberDao {
	
	Member findMemberById(int id);
	
	int insertMember(Member member);
	
	int updateMemberById(int id, String address);
}
