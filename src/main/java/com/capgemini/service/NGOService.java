package com.capgemini.service;


import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.exception.NGONotFoundException;
import com.capgemini.exception.NoSuchNgoException;
import com.capgemini.model.NGO;
import com.capgemini.repository.INGORepository;


@Service
public class NGOService implements INGOService{
	
	private static final Logger LOG = LoggerFactory.getLogger(NGOService.class);

	@Autowired
	private INGORepository ingoRepository;

//------------------------------------------------------------------------------------
	
@Override
public NGO deleteNGO(int ngoId) {
	// TODO Auto-generated method stub
	LOG.info("Service deleteNgoByNgoId");
	Optional<NGO> ngoOpt = ingoRepository.findById(ngoId);
	if (ngoOpt.isPresent()) {
		ingoRepository.deleteById(ngoId);
		return ngoOpt.get();
	} else {
		throw new NGONotFoundException(ngoId + " this employee does not exist.");
	}
	
}

//------------------------------------------------------------------------------------

@Override
public NGO addNGO(NGO ngo) {
	LOG.info("Service addNGO");
	if (! ingoRepository.existsById(ngo.getNgoId())){
		return ingoRepository.save(ngo);
	}
	else {
		throw new NGONotFoundException(ngo.getNgoId() + " this NGO is not found.");
	}
}

//------------------------------------------------------------------------------------

@Override
public NGO updateNGO(NGO ngo) {
	LOG.info("Service updateNgoByNgoId");
	if (ingoRepository.existsById(ngo.getNgoId())) {
		return ingoRepository.save(ngo);
	} else {
		throw new NGONotFoundException(ngo.getNgoId()+" this employee is not found.");
	}
}

//------------------------------------------------------------------------------------

@Override
public NGO viewNGO(int ngoId) {
	LOG.info("Service getAllNGOById");
	if(ingoRepository.existsById(ngoId)) {
		return ingoRepository.findById(ngoId).get();
	}
	LOG.error("NGO ID not found");
	throw new NGONotFoundException("NGO ID not found");
}

//------------------------------------------------------------------------------------

@Override
public List<NGO> viewAllNGO() {
	List<NGO> list= ingoRepository.findAll();
	if(!list.isEmpty()) {
		LOG.info("Service getAllNGO");
		return list;
	}
	LOG.error("Service NoNgopresent");
	throw new NoSuchNgoException("No Ngo present");
}

//------------------------------------------------------------------------------------

@Override
public List<NGO> viewNGOByMotive(String motive) {
	LOG.info("Service viewNGOByMotive");
	List<NGO> list = ingoRepository.findByNgoMotive(motive);
	if(!list.isEmpty()) {
		return list;
	}else {
		throw new NoSuchNgoException("No Ngo Motive is present in database");
	}
	
}

//------------------------------------------------------------------------------------

@Override
public List<NGO> viewNGOByLocation(String location) {
	LOG.info("Service viewNGOByLocation");
	List<NGO> list = ingoRepository.findByNgoLocation(location);
	if(!list.isEmpty()) {
		return list;
	}
	else {
		throw new NoSuchNgoException("No NGO present at \"" +location+ "\" Location");	
	}
}	
}




