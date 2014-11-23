package com.ibm.bluemix.smartveggie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.bluemix.smartveggie.dao.OutletDao;
import com.ibm.bluemix.smartveggie.dto.OutletDTO;
import com.ibm.bluemix.smartveggie.dto.SubOutletDTO;

@Service
public class OutletServiceImpl implements OutletService {
	
	@Autowired
	private OutletDao outletDao = null;

	public OutletDao getOutletDao() {
		return outletDao;
	}

	public void setOutletDao(OutletDao outletDao) {
		this.outletDao = outletDao;
	}
	
	public void createOutlet(OutletDTO outletDTO){
		outletDao.createOutlet(outletDTO);
	}
	
	public List<OutletDTO> getOutlets(){
		return outletDao.getOutlets();
	}
	
	public void createSubOutlet(SubOutletDTO subOutletDTO){
		outletDao.createSubOutlet(subOutletDTO);
	}
	
	public List<SubOutletDTO> getSubOutlets(){
		return outletDao.getSubOutlets();
	}
	
	public List<OutletDTO> outletDetails(){
		return outletDao.outletDetails();
	}
	
	public List<OutletDTO> outletDetailsByOutletCode(String outletCode){
		return outletDao.outletDetailsByOutletCode(outletCode);
	}	
	
	public String getOutletNameByOutletCode(String outletCode){
		return outletDao.getOutletNameByOutletCode(outletCode);
	}
	public String getSubOutletNameBySubOutletCode(String subOutletCode){
		return outletDao.getSubOutletNameBySubOutletCode(subOutletCode);
	}

}
