package com.springorm;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest 
{
	@BeforeClass
	public void createSqlsession() {
		
	}
	
	@AfterClass
	public void destroySqlsession() {
		
	}
	
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
