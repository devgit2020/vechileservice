package org.test.vechile.controller;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.test.vechile.TestDataService;
import org.test.vechile.model.Vechile;
import org.test.vechile.service.VechileService;

@RunWith(MockitoJUnitRunner.class)
public class VechileRestControllerTest {

	@Mock
	VechileRestController vechileRestController;

	@Mock
	VechileService vechileSerivce;


	@Test
	public void test() {
		
		assertNotNull(vechileSerivce);
		assertNotNull(vechileRestController);
		
	}
	
		
	@Test
	public void testGetAllVechile() {

		Mockito.lenient().when(vechileSerivce.retrieveVechiles()).thenReturn(TestDataService.getVechileList());

		List<Vechile> response = vechileRestController.getVechiles();
		
		assertNotNull(response);

	}
	
	@Test
	public void testGetAllVechileRelatedToModel() {

		Mockito.lenient().when(vechileSerivce.getVechile(Mockito.anyString(), Mockito.anyString())).thenReturn(TestDataService.getVechileList());

		List<Vechile> response = vechileRestController.getVechile("test", "test");
		
		assertNotNull(response);

	}
	
}
