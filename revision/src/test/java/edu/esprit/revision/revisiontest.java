package edu.esprit.revision;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class revisiontest {
	
	revis r;

	@Before
	public void setUp() throws Exception {
		
		r=new revis();
	}

	@Test
	public void itShouldReturnOneWhentwo() {
		assertEquals(1,r.process(2));
	}

}
