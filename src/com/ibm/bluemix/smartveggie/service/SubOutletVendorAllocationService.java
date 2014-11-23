package com.ibm.bluemix.smartveggie.service;

import java.util.List;

import com.ibm.bluemix.smartveggie.dto.SubOutletVendorAllocationDTO;

public interface SubOutletVendorAllocationService {
	public List<SubOutletVendorAllocationDTO> retrieveAllocatedSubOutlet();
	public boolean allocateSubOutlet(SubOutletVendorAllocationDTO subOutletVendorAllocationDTO);
	public boolean deallocateSubOutlet(SubOutletVendorAllocationDTO subOutletVendorAllocationDTO);
}
