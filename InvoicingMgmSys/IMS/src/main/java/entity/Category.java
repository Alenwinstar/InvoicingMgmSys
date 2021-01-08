/**
 * 產品類別資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Category implements Serializable {

	@Id
	@Column(name="Category_id")
	private String Category_id;//    nvarchar(20) NOT NULL PRIMARY KEY,

	@Column(name="Category_name")
    private String Category_name;//  nvarchar(20) NULL,

	@Column(name="Category_desc")
    private String Category_desc;//  nvarchar(200) NULL,

	@Column(name="Crt_time")
    private Timestamp Crt_time;//       datetime NOT NULL,

	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL

	public String getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(String category_id) {
		Category_id = category_id;
	}

	public String getCategory_name() {
		return Category_name;
	}

	public void setCategory_name(String category_name) {
		Category_name = category_name;
	}

	public String getCategory_desc() {
		return Category_desc;
	}

	public void setCategory_desc(String category_desc) {
		Category_desc = category_desc;
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
