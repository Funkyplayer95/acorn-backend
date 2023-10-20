package springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	private static ApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext(
				"classpath:/springjdbc/test/config.xml");
		
		String sql = "INSERT INTO "
				+ "userinfo(userid, userpassword, role) "
				+ "VALUES(?, ?, ?)";

		String sql2 = "UPDATE userinfo "
				+ "set role=? WHERE userid=?";

		
		JdbcTemplate jdbcTemplate = 
				(JdbcTemplate)ctx.getBean("jdbctemplte");
		int cnt = jdbcTemplate.update(sql2, "a", "user2");
		
		System.out.println("입력된 갯수: "  + cnt);
	}
}
