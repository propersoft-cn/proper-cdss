package com.zhangp.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.zhangp.demo2.HisPojo;
import com.zhangp.demo2.Rules;
import com.zhangp.manager.TestManager;

public class Demo2Impl implements IDroolService {
	
	private TestManager testManager;

	@Autowired
	public void setTestManager(TestManager testManager) {
		this.testManager = testManager;
	}


	public HisPojo fireRule(HisPojo hisPojo) {
		// TODO Auto-generated method stub
		try {
			System.out.println("===³É¹¦===");
			hisPojo = Rules.getInstance().fireRules(hisPojo);
			testManager.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("===Ê§°Ü===");
		}
		return hisPojo;
	}

}
