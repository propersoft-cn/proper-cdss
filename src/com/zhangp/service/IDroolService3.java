package com.zhangp.service;

import javax.jws.WebService;

import com.zhangp.pojo.HisPojo;

@WebService
public interface IDroolService3 {
	
	public HisPojo fireRule(HisPojo hisPojo);
	
}
