package com.obs;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.obs.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
public class StudentServiceTest {

	@MockBean
	StudentService studentService;

	@Before
	public void setUp() {

	}
	@Test
	public void test() {
        
	}
}
