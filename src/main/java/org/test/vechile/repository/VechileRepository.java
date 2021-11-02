package org.test.vechile.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.test.vechile.entity.VechileEntity;
 
@Repository
public interface VechileRepository extends JpaRepository<VechileEntity,Long>{
	
	@Query("FROM VechileEntity v WHERE v.make = ?1 and v.model=?2")
	List<VechileEntity> findByModelAndMake(String make,String model);
 
}
