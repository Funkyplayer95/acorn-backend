package springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void hi() {
		System.out.println("hi()");
	}
	public void bye() {
		System.out.println("bye()");
	}
	
	@Override
	public String toString() {
		String msg = getId() + ":" + getName();
		return msg;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
}


	

	
}
