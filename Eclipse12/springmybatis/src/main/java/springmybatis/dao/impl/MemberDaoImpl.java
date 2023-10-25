package springmybatis.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import springmybatis.dao.IMemberDao;
import springmybatis.dto.Member;
import springmybatis.dto.SelectionConditions;
import springmybatis.dto.UpdateConditions;

public class MemberDaoImpl implements IMemberDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public MemberDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public Member findMemberById(int id) {		
		return sqlSessionTemplate.selectOne(
				"member.findMemberId", id);
	}

	@Override
	public int insertMember(Member member) {
		return sqlSessionTemplate.insert("member.insertMember", member);
	}

	@Override
	public int updateMemberById(int id, String address) {
		UpdateConditions uc = new UpdateConditions(id, address);
		return sqlSessionTemplate.update("member.updateMemberById", uc);
	}

	@Override
	public List<Member> findMember() {
		return sqlSessionTemplate.selectList("member.findmMember");
	}

	@Override
	public List<Member> findMemberById2(String address) {
		return sqlSessionTemplate.selectList("member.findMemberById2", address);
	}

	@Override
	public Member findMemberByIdAndPwd(int id, String password) {
		SelectionConditions sc = new SelectionConditions(id, password);
		return sqlSessionTemplate.selectOne("member.findMemberByIdAndPwd", sc);
	}
}
