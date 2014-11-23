package com.ibm.bluemix.smartveggie.dao;

import java.util.List;

import com.ibm.bluemix.smartveggie.dto.OutletDTO;
import com.ibm.bluemix.smartveggie.dto.SubOutletDTO;
import com.mongodb.BasicDBObject;

public interface OutletDao {
	
	public BasicDBObject createOutlet(OutletDTO outletDTO) ;
	
	public List<OutletDTO> getOutlets() ;
	
	public BasicDBObject createSubOutlet(SubOutletDTO outletDTO) ;
	
	public List<SubOutletDTO> getSubOutlets() ;

	public List<OutletDTO> outletDetails();
	
	public List<OutletDTO> outletDetailsByOutletCode(String outletCode);
	
	public String getOutletNameByOutletCode(String outletCode);
	
	public String getSubOutletNameBySubOutletCode(String subOutletCode);
}
