package springmybatis.main;

import java.util.List;

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
		
//		Member member2 = new Member(6, "1678", "돌길동", "금남구");
//		result = memberDao.insertMember(member2);
//		System.out.println("영향을 받은 갯수: " + result);
		
//		result = memberDao.updateMemberById(2, "공병구");
//		System.out.println(result);
		
		List<Member> memList = memberDao.findMember();
		for(Member member2 : memList) {
			System.out.println(member2);
		}
		
		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		memList = memberDao.findMemberById2("금남구");
		for(Member member2 : memList) {
			System.out.println(member2);
		}

		System.out.println();
		System.out.println("==========================");
		System.out.println();
		
		member = memberDao.findMemberByIdAndPwd(5, "1678");
		System.out.println(member);

		
		ctx.close();
	}

}
