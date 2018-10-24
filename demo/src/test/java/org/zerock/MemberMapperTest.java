package org.zerock;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.zerock.domain.MemberVO;
import org.zerock.mapper.MemberMapper;

public class MemberMapperTest extends DemoApplicationTests{
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void testInsert()throws Exception{
		
		MemberVO vo = new MemberVO();
		
		vo.setUserid("user5431");
		vo.setUserpw("user5431");
		
		vo.setUsername("Billy Kang");
		vo.setEmail("youngmeen24@gmail.com");
		
		mapper.create(vo);
	}
	
	@Test
	public void testLogin() throws Exception{
		
		MemberVO vo = mapper.login("user543", "user543");
		System.out.println(vo);
		
	}
	

}
