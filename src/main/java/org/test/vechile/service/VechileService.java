package org.test.vechile.service;

import java.util.List;

import org.test.vechile.entity.VechileEntity;
import org.test.vechile.model.Vechile;


 
/**
 * @author Santosh Behera
 *
 */
public interface VechileService {
	
 public List<Vechile> retrieveVechiles();
  
 public List<Vechile> getVechile(String make,String model);
  
 public void saveVechile(Vechile vechile);
  
 }
