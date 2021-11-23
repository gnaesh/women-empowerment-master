package com.capgemini.repository;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Service;

import com.capgemini.model.NGO;
import com.capgemini.controller.NGOController;

public interface INGORepository extends JpaRepository<NGO, Integer>{
//
////	List<NGO> findByNgoName(String ngoName);
//////	NGO findByNgoId(Integer ngoId);
//	public abstract NGO addNGO(Integer ngo);
////
//	public abstract NGO updateNGO(NGO ngo);
//
//	public abstract NGO viewNGO(int ngoId);
////
//	public abstract List<NGO> viewAllNGO();
//
////	public abstract NGO deleteNGO(int ngoId);
//
	public abstract List<NGO> findByNgoMotive(String ngoMotive);

	public abstract List<NGO> findByNgoLocation(String location);
}