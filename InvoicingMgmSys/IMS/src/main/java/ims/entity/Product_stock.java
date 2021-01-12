/**
 * 產品現有庫存資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product_stock implements Serializable {

	@Id
	@Column(name="Stock_id")
	private String Stock_id;//    nvarchar(50) NOT NULL PRIMARY KEY,

	@Column(name="Product_id")
    private String Product_id;//  nvarchar(50) NULL,

	@Column(name="Price")
    private Double Price;//       decimal(11,2) NULL,

	@Column(name="Stock")
    private Integer Stock;//       int NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//    datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//    datetime NOT NULL

	public String getStock_id() {
		return Stock_id;
	}

	public void setStock_id(String stock_id) {
		Stock_id = stock_id;
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

	public Integer getStock() {
		return Stock;
	}

	public void setStock(Integer stock) {
		Stock = stock;
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
