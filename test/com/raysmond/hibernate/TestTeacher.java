package com.raysmond.hibernate;


import org.junit.Test;
import org.springframework.test.annotation.Rollback;

import edu.fudan.ss.persistence.hibernate.common.HibernateBaseTest;

public class TestTeacher extends HibernateBaseTest {

	@Test
	// @Rollback(false)
	public void testCreateTeacher() {
		Teacher teacher = Teacher.create("ateacher", "1110", getPersistenceManager());
		assertObjectPersisted(teacher);
	}
	
}