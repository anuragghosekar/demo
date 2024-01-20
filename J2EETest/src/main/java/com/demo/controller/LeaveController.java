package com.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.LeaveDetails;
import com.demo.model.Product;
import com.demo.service.LeaveService;

@Controller
//@RequestMapping("/")
public class LeaveController {
	@Autowired
	LeaveService lServ;
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	@GetMapping("/applyLeave")
	public String applyLeave() {
		return "applyLeave";
	}
	
	/*
	 * private String leave_id;
	private Date leave_applied_on;
	private Date start_date;
	private Date end_date;
	private String leave_type;
	private String leave_reason;
	private int empno;
	 */
	@PostMapping("/applyLeave")
	public ModelAndView applyLeave( int empno, Date start_date, Date end_date, String leave_type, String leave_reason) {
		LeaveDetails l = new LeaveDetails();
		l.setEmpno(empno);
		l.setStart_date(start_date);
		l.setEnd_date(end_date);
		l.setLeave_type(leave_type);
		l.setLeave_reason(leave_reason);
//		l.setLeave_id(leave_id);
//		l.setLeave_applied_on(leave_applied_on);
		lServ.addLeave(l);
		String s = "added successfully";
		return new ModelAndView("redirect:/dashboard","msg",s);
	}
	
	@GetMapping("/leaveHistory")
	public ModelAndView LeaveHistory() {
		List<LeaveDetails> lList = lServ.levHistory();
		return new ModelAndView("leaveHistory","lList",lList);
	}
	
}
