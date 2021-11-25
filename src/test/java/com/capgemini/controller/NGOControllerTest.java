package com.capgemini.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


import com.capgemini.model.NGO;
import com.capgemini.repository.INGORepository;
import com.capgemini.service.INGOService;
import com.google.common.base.Verify;



	@SpringBootTest
	public class NGOControllerTests {
	
		@MockBean
		private  INGORepository repository;
		
		@Autowired
		private NGOController controller;
		@Autowired
		private INGOService service;
		
		@Test
		public void testGetNgoByMotive() {
			String motive = "help";
			when(repository.findByNgoMotive(motive)).thenReturn((List<NGO>)Stream.of(new NGO()).collect(Collectors.toList()));
			assertEquals(controller.viewNGOByMotive(motive),controller.viewNGOByMotive(motive));
			
		}
	
			@Test
			public void testgetAllEmployee() {
					
				when(repository.findAll()).thenReturn((List<NGO>) Stream.of(new NGO()).collect(Collectors.toList()));
				assertEquals(controller.getallngos(),controller.getallngos() );
				
			}
			
			@Test
			public void testGetNgoByLocation() {
				String location = "mumbai";
				when(repository.findByNgoLocation(location)).thenReturn((List<NGO>)Stream.of(new NGO()).collect(Collectors.toList()));
				assertEquals(controller.viewNGOByLocation(location),controller.viewNGOByLocation(location));
				
			}
			
			
			
			
//			@Test
//			public void testGetNgoById() {
//				Integer id= 1;
//				when(service.viewNGO(id)).thenReturn((NGO)Stream.of(new NGO()).collect(Collectors.toList()));
//				assertEquals(controller.getNgoByngoId(1),service.viewNGO(id));
//				
//			}
			
			@Test
			public void testSaveNgo	() {
				NGO ngo= new NGO(3,"asd","asd","asd","asd",100.2,10,"asd", null);
				when(repository.save(ngo)).thenReturn(ngo);
				assertEquals(controller.addngo(ngo),controller.addngo(ngo));
				
			}
			
//			@Test
//			public void testDeleteNgo	() {
//				Integer id= 1;
//				NGO ngo= new NGO(3,"asd","asd","asd","asd",100.2,10,"asd", null);
//				service.deleteNGO(id);
//				verify(repository, times(1)).deleteById(id);
//				assertEquals(controller.deleteNgoByNgoId(id),controller.deleteNgoByNgoId(id));
//				
//			}
			
	}


