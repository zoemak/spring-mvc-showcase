package org.springframework.samples.mvc.simple;

import org.junit.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

public class SimpleControllerTests {

	@Test
	public void simple() throws Exception {
		standaloneSetup(new SimpleController()).build()
		                                       .perform(get("/simple"))
		                                       .andExpect(status().isOk())
		                                       .andExpect(content().contentType("text/plain;charset=ISO-8859-1"))
		                                       .andExpect(content().string("Hello world!"));
	}

}
