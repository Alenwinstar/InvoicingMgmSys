/**
 * 角色資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class Role implements Serializable {

	@Id
	@Column(name="Role_id")
	private String Role_id;//     nvarchar(50) NOT NULL PRIMARY KEY,
	
	@Column(name="Role_name")
    private String Role_name;//   nvarchar(50) NULL,
	
	@Column(name="Status")
    private String Status;//      varchar(2) NULL,
	
	@Column(name="Crt_user_id")
    private String Crt_user_id;// nvarchar(50) NULL,
	
	@Column(name="Crt_time")
    private Timestamp Crt_time;//    datetime NOT NULL,
	
	@Column(name="Upd_time")
    private Timestamp Upd_time;//    datetime NOT NULL

	public String getRole_id() {
		return Role_id;
	}

	public void setRole_id(String role_id) {
		Role_id = role_id;
	}

	public String getRole_name() {
		return Role_name;
	}

	public void setRole_name(String role_name) {
		Role_name = role_name;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCrt_user_id() {
		return Crt_user_id;
	}

	public void setCrt_user_id(String crt_user_id) {
		Crt_user_id = crt_user_id;
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
