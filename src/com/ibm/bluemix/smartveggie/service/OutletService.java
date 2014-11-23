package com.ibm.bluemix.smartveggie.service;

import java.util.List;

import com.ibm.bluemix.smartveggie.dto.OutletDTO;
import com.ibm.bluemix.smartveggie.dto.SubOutletDTO;

public interface OutletService {
	
	public void createOutlet(OutletDTO outletDTO);
	
	public List<OutletDTO> getOutlets();
	
	public void createSubOutlet(SubOutletDTO subOutletDTO);
	
	public List<SubOutletDTO> getSubOutlets();
	
	public List<OutletDTO> outletDetails();
	
	public List<OutletDTO> outletDetailsByOutletCode(String outletCode);
	
	public String getOutletNameByOutletCode(String outletCode);
	
	public String getSubOutletNameBySubOutletCode(String subOutletCode); 

}
