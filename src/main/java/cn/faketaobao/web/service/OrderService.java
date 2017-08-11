/** 
 * Project Name:FakeTaobao 
 * File Name:OrderService.java 
 * Package Name:cn.faketaobao.web.service 
 * Date:2017年8月11日上午9:36:37 
 * 
 */  
  
package cn.faketaobao.web.service;  

import java.util.Set;

import cn.faketaobao.web.pojo.ItemBean;
import cn.faketaobao.web.pojo.OrderBean;

/** 
 * ClassName:OrderService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午9:36:37 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface OrderService {

	OrderBean addOrder(Integer[] items) throws Exception ;
	
	OrderBean getOrder(Integer id) throws Exception;
}
 