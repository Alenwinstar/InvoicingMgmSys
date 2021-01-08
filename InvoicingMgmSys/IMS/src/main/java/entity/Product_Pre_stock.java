/**
 * 產品預購庫存資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product_Pre_stock implements Serializable {

	@Id
	@Column(name="Pre_stock_id")
	private String Pre_stock_id;// nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Product_id")
    private String Product_id;//   nvarchar(50) NULL,

	@Column(name="Pre_price")
    private Double Pre_price;//    decimal(11,2) NULL,

	@Column(name="Pre_stock")
    private Integer Pre_stock;//    int NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//     datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//     datetime NOT NULL

	public String getPre_stock_id() {
		return Pre_stock_id;
	}

	public void setPre_stock_id(String pre_stock_id) {
		Pre_stock_id = pre_stock_id;
	}

	public String getProduct_id() {
		return Product_id;
	}

	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}

	public Double getPre_price() {
		return Pre_price;
	}

	public void setPre_price(Double pre_price) {
		Pre_price = pre_price;
	}

	public Integer getPre_stock() {
		return Pre_stock;
	}

	public void setPre_stock(Integer pre_stock) {
		Pre_stock = pre_stock;
	}

	public Timestamp getCrt_time() {
		return Crt_time;
	}

	public void setCrt_time(Timestamp crt_time) {
		Crt_time = crt_time;
	}

	public Timestamp getUpd_time() {
		return Upd_time;
	}

	public void setUpd_time(Timestamp upd_time) {
		Upd_time = upd_time;
	}
    
}
