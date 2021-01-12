/**
 * 員工角色資料表
 * @author dan
 * @time 2021.1.8
 * @version 1v
 */
package ims.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class User_role implements Serializable {

	@Id
	@Column(name="User_role_id")
	private String User_role_id;//   nvarchar(50) NOT NULL PRIMARY KEY,
	
	@Column(name="User_id")
    private String User_id;//        nvarchar(50) NULL,
	
	@Column(name="Role_id")
    private String Role_id;//        nvarchar(50) NULL,
	
	@Column(name="Crt_user_id")
    private String Crt_user_id;//    nvarchar(50) NULL,
	
	@Column(name="Crt_time")
    private Timestamp Crt_time;//       datetime NOT NULL,
	
	@Column(name="Upd_time")
    private Timestamp Upd_time;//       datetime NOT NULL
    
    
	public String getUser_role_id() {
		return User_role_id;
	}
	public void setUser_role_id(String user_role_id) {
		User_role_id = user_role_id;
	}
	public String getUser_id() {
		return User_id;
	}
	public void setUser_id(String user_id) {
		User_id = user_id;
	}
	public String getRole_id() {
		return Role_id;
	}
	public void setRole_id(String role_id) {
		Role_id = role_id;
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
