/** 
 * Project Name:FakeTaobao 
 * File Name:TestController.java 
 * Package Name:cn.faketaobao.web.controller 
 * Date:2017年8月10日下午6:28:02 
 * 
 */  
  
package cn.faketaobao.web.controller;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.faketaobao.web.pojo.TestBean;
import cn.faketaobao.web.service.TestService;

/** 
 * ClassName:TestController 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月10日 下午6:28:02 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Controller
@RequestMapping("test")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("index")
	@ResponseBody
	public TestBean index(String name) {
		return testService.save(name);
	}
	
}
 