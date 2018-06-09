package com.zhangp.service;

import javax.jws.WebService;

import com.zhangp.pojo.HisPojo;

@WebService
public interface ICDSSService1 {
	public HisPojo fireRule1(HisPojo hisPojo);
}
