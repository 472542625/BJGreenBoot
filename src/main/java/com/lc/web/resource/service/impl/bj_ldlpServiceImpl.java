package com.lc.web.resource.service.impl;

import com.lc.web.resource.dao.bj_ldlpMapper;
import com.lc.web.resource.entity.bj_ldlp;
import com.lc.web.resource.entity.bj_ldlpExample;
import com.lc.web.resource.service.bj_ldlpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class bj_ldlpServiceImpl implements bj_ldlpService {
	// 单位覆盖率和绿地率

	@Autowired
	bj_ldlpMapper dao;

	@Override
	public List<bj_ldlp> selectByExample(Double ldl1,Double ldl2) {
		// TODO Auto-generated method stub
		bj_ldlpExample example = new bj_ldlpExample();

		BigDecimal ld111 = new BigDecimal(ldl1);
		BigDecimal ld112 = new BigDecimal(ldl2);
		bj_ldlpExample.Criteria criteria =  example.createCriteria();


		criteria.andGreentrateBetween(ld111,ld112);

		return dao.selectByExample(example);
	}

}
