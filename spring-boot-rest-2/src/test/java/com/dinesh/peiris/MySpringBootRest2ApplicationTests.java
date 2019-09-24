package com.dinesh.peiris;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class MySpringBootRest2ApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PollService pollService;
	
	@Before(value = "")
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void retrievePolls() throws Exception{
		when(pollService.getAllPolls()).thenReturn(null);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/polls");
//		ResultActions ra = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andExpect(content().json("{'id':1,'question':'question 1'},{'id':2,'question':'question 2'},{'id':3,'question':'question 3'}"));
		ResultActions ra = mockMvc.perform(requestBuilder);
//		System.out.println(content().);
		
		
		
	}
	
}
