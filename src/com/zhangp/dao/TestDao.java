package com.zhangp.dao;

import java.util.List;

import com.zhangp.pojo.Test;


public interface TestDao {
	
	public List<Test> getTests();

	public List<Test> getTests(Test test);

	public Test getTestByCondition(Test user);

	public void insertTest(Test test);

	public void updateTest(Test test);

	public void deleteTest(String id);

}
