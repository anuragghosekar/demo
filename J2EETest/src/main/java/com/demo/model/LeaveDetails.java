package com.demo.model;

import java.util.Date;

public class LeaveDetails {
	private int leave_id;
	private Date leave_applied_on;
	private Date start_date;
	private Date end_date;
	private String leave_type;
	private String leave_reason;
	private int empno;
	
	public int getLeave_id() {
		return leave_id;
	}
	public void setLeave_id(int leave_id) {
		this.leave_id = leave_id;
	}
	public Date getLeave_applied_on() {
		return leave_applied_on;
	}
	public void setLeave_applied_on(Date leave_applied_on) {
		this.leave_applied_on = leave_applied_on;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getLeave_type() {
		return leave_type;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public String getLeave_reason() {
		return leave_reason;
	}
	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public LeaveDetails() {
		super();
	}
	
	public LeaveDetails(Date start_date, Date end_date, String leave_type,
			String leave_reason, int empno) {
		super();
//		this.leave_id = leave_id;
//		this.leave_applied_on = leave_applied_on;
		this.start_date = start_date;
		this.end_date = end_date;
		this.leave_type = leave_type;
		this.leave_reason = leave_reason;
		this.empno = empno;
	}
}
