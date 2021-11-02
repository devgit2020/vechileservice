package org.test.vechile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.test.vechile.entity.VechileEntity;
import org.test.vechile.model.Vechile;
import org.test.vechile.service.VechileService;

/**
 * @author Santosh Behera
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class VechileRestController {

	@Autowired
	private VechileService vechileService;

	@GetMapping("/api/vechiles")
	public List<Vechile> getVechiles() {
		List<Vechile> vechiles = vechileService.retrieveVechiles();
		return vechiles;
	}
	
	

	@GetMapping("/api/vechile/{make}/{model}")
	public List<Vechile> getVechile(@PathVariable(name = "make") String make,@PathVariable(name = "model") String model) {
		return vechileService.getVechile(make, model);
	}

	@PostMapping("/api/vechile")
	public void saveVechile(Vechile vechile) {
		vechileService.saveVechile(vechile);
	}

}
