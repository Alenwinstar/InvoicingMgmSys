/**
 * 預購訂單明細資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class Pre_order_detail implements Serializable {

	@Id
	@Column(name="Pre_order_detail_id")
	private String Pre_order_detail_id;// nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Pre_order_id")
    private String Pre_order_id;//        nvarchar(50) NOT NULL,

	@Column(name="Product_id")
    private String Product_id;//          nvarchar(50) NULL,

	@Column(name="Price")
    private Double Price;//               decimal(11,2) NULL,

	@Column(name="Product_count")
    private Integer Product_count;//       int NULL

	public String getPre_order_detail_id() {
		return Pre_order_detail_id;
	}

	public void setPre_order_detail_id(String pre_order_detail_id) {
		Pre_order_detail_id = pre_order_detail_id;
	}

	public String getPre_order_id() {
		return Pre_order_id;
	}

	public void setPre_order_id(String pre_order_id) {
		Pre_order_id = pre_order_id;
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public Double getPrice() {
		return Price;
	}

	public void setPrice(Double price) {
		Price = price;
	}

	public Integer getProduct_count() {
		return Product_count;
	}

	public void setProduct_count(Integer product_count) {
		Product_count = product_count;
	}
	
}
