package springjdbc.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springjdbc.dao.UserInfoDao;
import springjdbc.dto.UserInfoDto;

public class Test {
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(
				"classpath:/springjdbc/main/config.xml");
		
		UserInfoDao userInfoDao = (UserInfoDao)ctx.getBean("userinfodao");
		
		UserInfoDto userInfoDto = null;
//		userInfoDto = new UserInfoDto().setUserid("user6")
//		.setUserpassword("user6")
//		.setRole("u");
//		int cnt = userInfoDao.create(userInfoDto);
		
//		userInfoDto = new UserInfoDto();
//		userInfoDto.setUserid("user1").setUserpassword("1user").setRole("u");
//		int cnt = userInfoDao.update(userInfoDto);
		
//		userInfoDto = new UserInfoDto();
//		userInfoDto.setUserid("user6").setUserpassword("1user").setRole("u");
//		int cnt = userInfoDao.delete(userInfoDto);
		
		//System.out.println("영향받은 갯수: "  + cnt);
		
		userInfoDto = userInfoDao.read("admin5");
		System.out.println(
				userInfoDto.getUserid() 
				+ ":" + userInfoDto.getUserpassword() 
				+ ":" + userInfoDto.getRole());
		
		System.out.println();
		List<UserInfoDto> userInfoDtoLIST1 = 
				userInfoDao.read();
		
		for(UserInfoDto userInfoDto2 : userInfoDtoLIST1) {
			System.out.println(
					userInfoDto2.getUserid()
					+ ":" + userInfoDto2.getUserpassword() 
					+ ":" + userInfoDto2.getRole());			
		}
		System.out.println();
		List<UserInfoDto> userInfoDtoLIST2 = 
				userInfoDao.readByRole("a");
		for(UserInfoDto userInfoDto2 : userInfoDtoLIST2) {
			System.out.println(
					userInfoDto2.getUserid()
					+ ":" + userInfoDto2.getUserpassword() 
					+ ":" + userInfoDto2.getRole());			
		}		
	}
}
