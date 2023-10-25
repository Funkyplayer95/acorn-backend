package springmybatis.dao;

import java.util.List;

import springmybatis.dto.Member;

public interface IMemberDao {
	
	Member findMemberById(int id);
	
	List<Member> findMember();

	List<Member> findMemberById2(String address);
	
	Member findMemberByIdAndPwd(int id, String password);
	
	int insertMember(Member member);
	
	int updateMemberById(int id, String address);
	
}
