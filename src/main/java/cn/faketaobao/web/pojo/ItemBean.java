/** 
 * Project Name:FakeTaobao 
 * File Name:Item.java 
 * Package Name:cn.faketaobao.web.pojo 
 * Date:2017年8月11日上午8:46:14 
 * 
 */  
  
package cn.faketaobao.web.pojo;  

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


/** 
 * ClassName:Item 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年8月11日 上午8:46:14 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name="TB_ITEM")
public class ItemBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@GenericGenerator(name = "paymentableGenerator",strategy = "native")
	@Column(name="ITEM_ID")
	private Integer itemId;
	
	@Column(name="ITEM_NAME",length=30,nullable=false)
	private String itemName;
	
	@Column(name="price",columnDefinition="Float default 0.0f")
	private Float price;
	
	@Column(name="sum_items",columnDefinition="Integer default 0")
	private Integer sumItems ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_TIME",updatable=false)
	private Date createTime ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DELETE_TIME",updatable=true)
	private Date deleteTime ;
	
	@Column(name="ISDELETED",nullable=false)
	private Boolean isDeleted = false;
	
	public ItemBean() {
		super();
	}

	public ItemBean(String itemName, Float price, Integer sumItems) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.sumItems = sumItems;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getSumItems() {
		return sumItems;
	}

	public void setSumItems(Integer sumItems) {
		this.sumItems = sumItems;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
}
 