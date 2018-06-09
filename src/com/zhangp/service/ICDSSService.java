package com.zhangp.service;

import javax.jws.WebService;

import com.zhangp.pojo.HisPojo;

@WebService
public interface ICDSSService {
	
	public HisPojo fireRule1(HisPojo hisPojo);
	
	public HisPojo fireRule2(HisPojo hisPojo);
	
	public HisPojo fireRule3(HisPojo hisPojo);
	
}
