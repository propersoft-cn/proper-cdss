package com.zhangp.service;

import javax.jws.WebService;

import com.zhangp.demo2.HisPojo;

@WebService
public interface IDroolService {
	
	public HisPojo fireRule(HisPojo hisPojo);
	
}
