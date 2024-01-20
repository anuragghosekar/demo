package com.demo.dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.LeaveDetails;


@Repository
public class LeaveDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertLeave(LeaveDetails l) {
		Date today = new Date();
		l.setLeave_applied_on(today);
		jdbcTemplate.update("insert into leavedetails values(?,?,?,?,?,?)", new Object[] 
				{l.getEmpno(), l.getStart_date(), l.getEnd_date(), l.getLeave_type(), l.getLeave_reason(), l.getLeave_applied_on()});
		
	}

	public List<LeaveDetails> getLeaveHistory() {
		return jdbcTemplate.query("select * from leavedetails", (rs, num)->{
			LeaveDetails l = new LeaveDetails();
			l.setLeave_id(rs.getInt(1));
			l.setLeave_applied_on(rs.getDate(2));
			l.setStart_date(rs.getDate(3));
			l.setEnd_date(rs.getDate(4));
			l.setLeave_type(rs.getString(5));
			l.setLeave_reason(rs.getString(6));
			l.setEmpno(rs.getInt(7));
			return l;
		});
	}

		/*
		 * public List<Product> findAllProduct(){
		return jdbcTemplate.query("select * from product_tbl", (rs,num) -> {
			Product p = new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(3));
			p.setPrice(rs.getDouble(4));
			//System.out.println(p);
			return p;
		});
	}
		 */

}
