package springjdbc.dao;

import java.util.List;

import springjdbc.dto.UserInfoDto;

public interface UserInfoDao {
	
	int create(UserInfoDto userInfoDto);
	int update(UserInfoDto userInfoDto);
	int delete(UserInfoDto userInfoDto);
	UserInfoDto read(String userid);
	List<UserInfoDto> read();
	List<UserInfoDto> readByRole(String role);
}
