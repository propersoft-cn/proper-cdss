package com.zhangp.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhangp.dao.TestDao;
import com.zhangp.manager.TestManager;
import com.zhangp.pojo.Test;

@Service("testManager")
@Transactional
public class TestManagerImpl implements TestManager {
	
	private TestDao testDao;
	
	@Autowired
	public void setTestDao(TestDao testDao) {
		this.testDao = testDao;
	}

	public void test() {
		// TODO Auto-generated method stub
		List<Test> list = testDao.getTests();
		for (Test test : list) {
			System.out.println(test.getId()+test.getName());
		}
	}

}
