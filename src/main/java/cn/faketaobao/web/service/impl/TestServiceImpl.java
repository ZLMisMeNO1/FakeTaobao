/** 
 * Project Name:FakeTaobao 
 * File Name:TestServiceImpl.java 
 * Package Name:cn.faketaobao.web.service.impl 
 * Date:2017年8月10日下午6:25:42 
 * 
 */  
  
package cn.faketaobao.web.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.faketaobao.web.dao.TestDao;
import cn.faketaobao.web.pojo.TestBean;
import cn.faketaobao.web.service.TestService;

/** 
 * ClassName:TestServiceImpl 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月10日 下午6:25:42 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	TestDao testDao;
	
	@Override
	public TestBean save(String name) {
		TestBean bean = new TestBean();
		bean.setName(name);
		return testDao.testAdd(bean);
	}

}
 