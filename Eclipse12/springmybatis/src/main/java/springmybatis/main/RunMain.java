package springmybatis.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springmybatis.dao.IMemberDao;
import springmybatis.dto.Member;

public class RunMain {
	
	private static ClassPathXmlApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = 
			new ClassPathXmlApplicationContext(
				"classpath:/springmybatis/config.xml");
		int result = 0;
		
		IMemberDao memberDao = 
				 (IMemberDao)ctx.getBean("memberDao");
		Member member = memberDao.findMemberById(1);
		System.out.println(member);

		Member member2 = new Member(5, "1678" , "고구마", "금남구");
		System.out.println(member2);
		
		
//		result = memberDao.updateMemberById(2, "서울");
//		System.out.println("영향을 받은 갯수 : " + result);
//		ctx.close();
	}

}
