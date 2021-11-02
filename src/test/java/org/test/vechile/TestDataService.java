package org.test.vechile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.test.vechile.entity.VechileEntity;
import org.test.vechile.model.Vechile;

public class TestDataService {
	public static List<Vechile> getVechileList() {
		List<Vechile> vechileList = new ArrayList<>();
		

		Vechile vechile_1 = new Vechile();
		vechile_1.setMake("Brand_1");
		vechile_1.setModel("Model_1");
		vechile_1.setYear_model(1990);
		vechile_1.setPrice(100.20);
		vechile_1.setLicensed(true);
		vechile_1.setDate_added("2020-11-12");
		
		Vechile vechile_2 = new Vechile();
		vechile_2.setMake("Brand_2");
		vechile_2.setModel("Model_2");
		vechile_2.setYear_model(1990);
		vechile_2.setPrice(100.20);
		vechile_2.setLicensed(true);
		vechile_2.setDate_added("2020-12-12");
		
		vechileList.add(vechile_1);
		vechileList.add(vechile_2);
		

	  return vechileList;
	}

	public static List<VechileEntity> getVechileEntityList() {

		List<VechileEntity> vechileEntityList = getVechileList().stream().map(VechileEntity::toVechileEntity).collect(Collectors.toList());

		return vechileEntityList;
	}
}