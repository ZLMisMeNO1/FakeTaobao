/** 
 * Project Name:FakeTaobao 
 * File Name:TestController.java 
 * Package Name:cn.faketaobao.web.controller 
 * Date:2017年8月10日下午6:28:02 
 * 
 */  
  
package cn.faketaobao.web.controller;  

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.faketaobao.web.pojo.ItemBean;
import cn.faketaobao.web.pojo.OrderBean;
import cn.faketaobao.web.pojo.TestBean;
import cn.faketaobao.web.service.ItemService;
import cn.faketaobao.web.service.OrderService;
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
@RequestMapping("server/test")
public class TestController {

	@Autowired
	TestService testService;
	
	@RequestMapping("index")
	public String index() {
//		return new ModelAndView("test/index");
		return "test/index";
	}
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("addItem")
	@ResponseBody
	public ItemBean add(String itemName,Float price,Integer sumItems) throws Exception {
		return itemService.addItem(itemName, price, sumItems);
	}
	
	@Autowired
	OrderService orderService;
	
	
	@RequestMapping("addOrder")
	@ResponseBody
	public OrderBean addOrder(
			@RequestParam(value="items[]")Integer[] items)
					throws Exception {
		return orderService.addOrder(items);
	}
	
	@RequestMapping("getOrder")
	@ResponseBody
	public OrderBean getOrder(Integer id)
					throws Exception {
		return orderService.getOrder(id);
	}
}
 