package org.test.vechile.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.vechile.entity.VechileEntity;
import org.test.vechile.model.Vechile;
import org.test.vechile.repository.VechileRepository;
import org.test.vechile.service.VechileService;

/**
 * @author Santosh Behera
 *
 */
@Service
public class VechileServiceImpl implements VechileService {

	@Autowired
	private VechileRepository vechileRepository;

	public void setVechileRepository(VechileRepository vechileRepository) {
		this.vechileRepository = vechileRepository;
	}

	public List<Vechile> retrieveVechiles() {
		List<VechileEntity> vechileEntities = vechileRepository.findAll();

		List<Vechile> vechiles = new ArrayList<>();
		
		
		vechileEntities.forEach(vechileE -> {
			Vechile v = new Vechile();
			v.setModel(vechileE.getModel());
			v.setDate_added(vechileE.getDate_added());
			v.setLicensed(vechileE.getLicensed());
			v.setMake(vechileE.getMake());
			v.setPrice(vechileE.getPrice());

			vechiles.add(v);

		});

		return vechiles;
	}

	public List<Vechile> getVechile(String make, String model ) {
		
		List<VechileEntity> vechileEntities = vechileRepository.findByModelAndMake(make, model);
		
		List<Vechile> vechiles = new ArrayList<>();
		
		vechileEntities.forEach(vechileE -> {
			Vechile v = new Vechile();
			v.setModel(vechileE.getModel());
			v.setDate_added(vechileE.getDate_added());
			v.setLicensed(vechileE.getLicensed());
			v.setMake(vechileE.getMake());
			v.setPrice(vechileE.getPrice());

			vechiles.add(v);

		});

		return vechiles;
	}

	public void saveVechile(Vechile vechile) {
		VechileEntity vechileE = new VechileEntity();
		vechileE.setModel(vechile.getModel());
		vechileE.setDate_added(vechile.getDate_added());
		vechileE.setLicensed(vechile.getLicensed());
		vechileE.setMake(vechile.getMake());
		vechileE.setPrice(vechile.getPrice());
		vechileRepository.save(vechileE);
	}

}
