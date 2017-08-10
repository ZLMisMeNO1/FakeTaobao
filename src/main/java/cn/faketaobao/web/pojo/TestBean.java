/** 
 * Project Name:FakeTaobao 
 * File Name:TestBean.java 
 * Package Name:cn.faketaobao.web.pojo 
 * Date:2017年8月10日下午5:57:05 
 * 
 */  
  
package cn.faketaobao.web.pojo;  

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** 
 * ClassName:TestBean 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月10日 下午5:57:05 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name="testtable")
public class TestBean {

	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	private String testId;
	
	@Column(length=30)
	private String name;

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
 