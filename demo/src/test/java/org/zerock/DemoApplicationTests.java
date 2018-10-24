package org.zerock;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {
	
	@Autowired
	private SqlSessionFactory sqlSession;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testConnection() throws Exception {
		
		System.out.println(sqlSession);
	}

}
