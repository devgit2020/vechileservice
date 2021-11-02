package org.test.vechile.impl;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.test.vechile.TestDataService;
import org.test.vechile.model.Vechile;
import org.test.vechile.repository.VechileRepository;
import org.test.vechile.service.VechileService;

@RunWith(MockitoJUnitRunner.class)
public class VechileServiceImplTest {

	@Mock
	VechileRepository vechileRepository;

	@Mock
	VechileService vechileService;
	
	@Test
	public void test() {
		assertNotNull(vechileRepository);
		assertNotNull(vechileService);
	}
	
	@Test
	public void testRetrieveVechiles() {

		Mockito.lenient().when(vechileRepository.findAll()).thenReturn(TestDataService.getVechileEntityList());

		List<Vechile> response = vechileService.retrieveVechiles();

		assertNotNull(response);
	}
	
	@Test
	public void testGetVechile() {
		
		Mockito.lenient().when(vechileRepository.findByModelAndMake(Mockito.anyString(),Mockito.anyString())).thenReturn(TestDataService.getVechileEntityList());
	
		List<Vechile> response = vechileService.getVechile("test", "test");
		assertNotNull(response);   							
	}

	@Test
	public void testSaveVechile() {
		Mockito.lenient().doNothing().when(vechileService).saveVechile(Mockito.any());
		Vechile vechile = new Vechile();
		vechileService.saveVechile(vechile);

	}


}
