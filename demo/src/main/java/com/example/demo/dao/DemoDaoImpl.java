package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.DemoRequest;


@Repository
public class DemoDaoImpl implements DemoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//we can put these query in a constant class.
	private final String INSERT_DATA_QUERY="INSERT INTO DEMO_DATA( id,name,demoDay)values(?,?,?)";
	private final String SELECT_ALL_QUERY="SELECT   id,name,demoDay from DEMO_DATA ";
	private  String UPDATE_BY_ID="update DEMO_DATA set name = ? ,demoDay=? where id = ?";
	private String DELETE_BY_ID="delete from DEMO_DATA where id=?";
	private final String GET_BY_ID="select * from DEMO_DATA where id=?";
	@Override
	public DemoRequest add(DemoRequest request)
	{
		jdbcTemplate.update(INSERT_DATA_QUERY,request.getId(),request.getName(),request.getDemoDay());
		return request;	
	}
	
	@Override
	public int deleteById(int id) {
		 return jdbcTemplate.update(DELETE_BY_ID,id);
	}
	
	
		public List<DemoRequest> getAll(){  
			 return jdbcTemplate.query(SELECT_ALL_QUERY,new RowMapper<DemoRequest>(){  
			    @Override  
			    public DemoRequest mapRow(ResultSet rs, int rownumber) throws SQLException {  
			    	DemoRequest e=new DemoRequest();  
			        e.setId(rs.getInt(1));  
			        e.setName(rs.getString(2));  
			        e.setDemoDay(rs.getString(3));  
			        return e;  
			    }  
			    });
	}
		
			
		public int updateById( DemoRequest request ) {
				
		
           return   jdbcTemplate.update(UPDATE_BY_ID, request.getName(),request.getDemoDay(),request.getId());
	
}

		/*@Override
		public int getById(int id) {
			// TODO Auto-generated method stub
			return jdbcTemplate.query(GET_BY_ID,id);
			
		}*/
		
		
		public List<DemoRequest> getById(int id){  
			 return jdbcTemplate.query(GET_BY_ID,new Object[] {new Integer(id)},new RowMapper<DemoRequest>(){  
			    @Override  
			    public DemoRequest mapRow(ResultSet rs, int rownumber) throws SQLException {  
			    	DemoRequest e=new DemoRequest();  
			        e.setId(rs.getInt(1));  
			        e.setName(rs.getString(2));  
			        e.setDemoDay(rs.getString(3));  
			        return e;  
			    }  
			    });
	}
		
}
