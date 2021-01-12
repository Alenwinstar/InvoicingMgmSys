/**
 * 產品資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Product implements Serializable {
	
	@Id
	@Column(name="Product_id")
	private String Product_id;//    nvarchar(20) NOT NULL PRIMARY KEY,

	@Column(name="Product_name")
    private String Product_name;//  nvarchar(20) NULL,

	@Column(name="Product_desc")
    private String Product_desc;//  nvarchar(200) NULL,

	@Column(name="Cost")
    private Double Cost;//          decimal(11,2) NULL,

	@Column(name="Pre_status")
    private String Pre_status;//    varchar(2) NULL,

	@Column(name="Category_id")
    private String Category_id;//   nvarchar(20) NULL,

	@Column(name="Supplier_id")
    private String Supplier_id;//   nvarchar(20) NULL,

	@Column(name="Figure")
    private byte[] Figure;//        varbinary(max) NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//      datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//      datetime NOT NULL
	
	public String getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}
	public String getProduct_name() {
		return Product_name;
	}
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}
	public String getProduct_desc() {
		return Product_desc;
	}
	public void setProduct_desc(String product_desc) {
		Product_desc = product_desc;
	}
	public Double getCost() {
		return Cost;
	}
	public void setCost(Double cost) {
		Cost = cost;
	}
	public String getPre_status() {
		return Pre_status;
	}
	public void setPre_status(String pre_status) {
		Pre_status = pre_status;
	}
	public String getCategory_id() {
		return Category_id;
	}
	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}
	public String getSupplier_id() {
		return Supplier_id;
	}
	public void setSupplier_id(String supplier_id) {
		Supplier_id = supplier_id;
	}
	public byte[] getFigure() {
		return Figure;
	}
	public void setFigure(byte[] figure) {
		Figure = figure;
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
