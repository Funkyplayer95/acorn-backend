package springjdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springjdbc.dao.UserInfoDao;
import springjdbc.dao.rowmapper.UserInfoRowMapper;
import springjdbc.dto.UserInfoDto;

@Component("userinfodao")
public class UserInfoDaoImpl implements UserInfoDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int create(UserInfoDto userInfoDto) {
		
		String sql = "INSERT INTO "
				+ "userinfo(userid, userpassword, role) "
				+ "VALUES(?, ?, ?)";
		
		int cnt = jdbcTemplate.update(sql, 
				userInfoDto.getUserid(),
				userInfoDto.getUserpassword(),
				userInfoDto.getRole());
		
		return cnt;
	}

	@Override
	public int update(UserInfoDto userInfoDto) {
		String sql = "UPDATE userinfo "
				+ "SET userpassword=? WHERE userid=?";
		
		int cnt = jdbcTemplate.update(sql, 
				userInfoDto.getUserpassword(), userInfoDto.getUserid());
		
		return cnt;
	}
	
	@Override
	public int delete(UserInfoDto userInfoDto) {
		String sql = "DELETE FROM userinfo "
				+ "WHERE userid=?";
		
		int cnt = jdbcTemplate.update(sql, userInfoDto.getUserid());
		
		return cnt;
	}

	@Override
	public UserInfoDto read(String userid) {
		String sql = "SELECT userid, userpassword, role "
				+ "FROM userinfo WHERE userid=?";
		UserInfoRowMapper userInfoRowMapper = 
				new UserInfoRowMapper();
		UserInfoDto userInfoDto = 
				jdbcTemplate.queryForObject(sql, userInfoRowMapper, userid);
		
		return userInfoDto;
	}	

	@Override
	public List<UserInfoDto> read() {
		String sql = "SELECT userid, userpassword, role FROM userinfo";
		UserInfoRowMapper userInfoRowMapper = 
				new UserInfoRowMapper();
		List<UserInfoDto> userInfoDtoList = 
				jdbcTemplate.query(sql, userInfoRowMapper);
		
		return userInfoDtoList;
	}
	
	@Override
	public List<UserInfoDto> readByRole(String role) {
		String sql = "SELECT userid, userpassword, role "
				+ "FROM userinfo WHERE role='" + role + "'";
		
		UserInfoRowMapper userInfoRowMapper = 
				new UserInfoRowMapper();
		List<UserInfoDto> userInfoDtoList = 
				jdbcTemplate.query(sql, userInfoRowMapper);
		
		return userInfoDtoList;		
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
