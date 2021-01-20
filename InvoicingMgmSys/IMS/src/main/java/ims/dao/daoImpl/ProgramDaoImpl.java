package ims.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import ims.dao.ProgramDao;
import ims.entity.Program;
import ims.utils.SQLConnectionUtil;

@Configuration
public class ProgramDaoImpl implements ProgramDao {

	//table
	private final String tableName = "[dbo].[Program]";
	
	@Autowired
	public SQLConnectionUtil sqlConnectionUtil;
	
	@Override
	public List<Program> getAllData(List<String> roleIdList) {
		
		List<Program> ProgramList = null;
		 
		StringBuffer sql = new StringBuffer();
		sql.append("select distinct A.* from "+ tableName + " as A");
		sql.append(" join ");
		sql.append(" ( select B.* from [dbo].[Role_program] as B ");
		sql.append(" left join [dbo].[Role] as C ");
		sql.append(" on B.role_id = C.Role_id where ");
		for(int number=0 ; number<roleIdList.size() ; number++) {
			if(number == 0) {
				sql.append(" B.Role_id='" + roleIdList.get(number) + "' ");
				continue;
			}
			sql.append(" or B.Role_id='" + roleIdList.get(number) + "' ");
			
		}
		sql.append(" ) as D ");
		sql.append(" on D.Program_id = A.Program_id");
		
		try(
				Connection conn = sqlConnectionUtil.getDataSource().getConnection();
				PreparedStatement pState = conn.prepareStatement(sql.toString());
				){
			ResultSet rs = pState.executeQuery();
			while(rs.isBeforeFirst()) {
				Program program = new Program();
				program.setProgram_id(rs.getString("Program_id"));
				program.setProgram_name(rs.getString("Program_name"));
				program.setStatus(rs.getString("Status"));
				program.setLayer(rs.getString("Layer"));
				program.setUri(rs.getString("Uri"));
				program.setCrt_time(rs.getTimestamp("Crt_time"));
				program.setUpd_time(rs.getTimestamp("upd_time"));
				
				ProgramList.add(program);
			}
			
			return ProgramList;
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Program getSpecialData(String programId) {
		// TODO Auto-generated method stub
		return null;
	}

}
