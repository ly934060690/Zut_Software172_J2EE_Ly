package com.zcw.osals.osals_base.dao;

import java.io.Serializable;
import java.util.List;

import org.aspectj.lang.annotation.Before;
import org.springframework.test.context.ContextConfiguration;

import com.zcw.osals.osals_base.BaseAbstractTestCase;
import com.zcw.osals.osals_base.domain.BaseEntity;

@ContextConfiguration(locations = { "classpath:/applicationContextTest-resources.xml",
		"classpath:/applicationContext-dao.xml" })
public class GenericDaoTestCase<PK extends Serializable, T extends BaseEntity, D extends GenericDao<T, PK>>
		extends BaseAbstractTestCase {

	protected D dao;

	protected T entity;

	protected PK id;

	protected List<T> list;

	@Before(value = "")
	public void setUp() throws Exception {

	}
}
