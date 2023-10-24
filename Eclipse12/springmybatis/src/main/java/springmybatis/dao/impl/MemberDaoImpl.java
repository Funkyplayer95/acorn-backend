package springmybatis.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;

import springmybatis.dao.IMemberDao;
import springmybatis.dto.Member;
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
		return sqlSessionTemplate.insert("member.insertmember");
	}

	@Override
	public int updateMemberById(int id, String address) {
		UpdateConditions uc = new UpdateConditions(id, address);
		
		return sqlSessionTemplate.update("member.UpdateConditions",uc);
	}

}
