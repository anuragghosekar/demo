package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LeaveDao;
import com.demo.model.LeaveDetails;

@Service
public class LeaveService {
	@Autowired
	LeaveDao lDao;

	public void addLeave(LeaveDetails l) {
		lDao.insertLeave(l);
		
	}

	public List<LeaveDetails> levHistory() {
		return lDao.getLeaveHistory();
	}
	
}
