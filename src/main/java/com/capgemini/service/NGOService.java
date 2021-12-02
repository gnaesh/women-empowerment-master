package com.capgemini.service;

import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.exception.InvalidNgoException;
import com.capgemini.exception.NGOAlreadyExistException;
import com.capgemini.exception.NGONotFoundException;
import com.capgemini.exception.NoNgoPresentByLocationException;
import com.capgemini.exception.NoNgoPresentByMotiveException;
import com.capgemini.exception.NoSuchNgoException;
import com.capgemini.exception.NotvalidActivitesException;
import com.capgemini.exception.NotvalidLocationException;
import com.capgemini.exception.NotvalidMotiveException;
import com.capgemini.exception.NotvalidTypeException;
import com.capgemini.model.NGO;
import com.capgemini.repository.INGORepository;

@Service
public class NGOService implements INGOService {

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
			throw new NoSuchNgoException(ngoId + " this employee does not exist.");
		}

	}

//------------------------------------------------------------------------------------

//@Override
//public NGO addNGO(NGO ngo) {
//	LOG.info("Service addNGO");
//	if (! ingoRepository.existsById(ngo.getNgoId())){
//		return ingoRepository.save(ngo);
//	}
//	else {
//		throw new NGOAlreadyExistException(ngo.getNgoId() + " this NGO is already in database");
//	}
//}

	@Override
	public NGO addNGO(NGO ngo) {
		LOG.info("Service addNGO");
		if (ngo.getNgoName() != null && ngo.getNgoActivities() != null && ngo.getNgoLocation() != null
				&& ngo.getNgoMotive() != null && ngo.getNgoType() != null && ngo.getDonation() != 0
				&& ngo.getNgoSize() != 0) {
			if (!ingoRepository.existsById(ngo.getNgoId())) {

				String name = ngo.getNgoName();
				String validateName = "^[A-Za-z ]+";
				String activites = ngo.getNgoActivities();
				String validactivites = "^[A-Za-z ]+";
				String location = ngo.getNgoLocation();
				String validLoacation = "^[A-Za-z ]+";
				String motive = ngo.getNgoMotive();
				String validMotive = "^[A-Za-z ]+";
				String type = ngo.getNgoType();
				String validType = "^[A-Za-z ]+";

				if (name.matches(validateName)) {
					if (activites.matches(validactivites)) {
						if (location.matches(validLoacation)) {
							if (motive.matches(validMotive)) {
								if (type.matches(validType)) {
									ngo = ingoRepository.save(ngo);
									return ngo;
								} else {
									LOG.error("NGO Type is not in Valid format ");
									throw new NotvalidTypeException("Invalid format for Type " + type);
								}
							} else {
								LOG.error("NGO Motive is not in Valid format ");
								throw new NotvalidMotiveException(" Invalid format for Motive" + motive);
							}
						} else {
							LOG.error("NGO Location is not in Valid format ");
							throw new NotvalidLocationException("Invalid format for Location " + location);
						}
					} else {
						LOG.error("NGO Activites is not in Valid format ");
						throw new NotvalidActivitesException("Invalid format for Activites" + activites);
					}
				} else {
					LOG.error("Unable to add NGO");
					throw new InvalidNgoException("Invalid First Name " + name);
				}
			}
		}
		return null;
	}

//------------------------------------------------------------------------------------

	@Override
	public NGO updateNGO(NGO ngo) {
		LOG.info("Service updateNgoByNgoId");
		if (ingoRepository.existsById(ngo.getNgoId())) {
			return ingoRepository.save(ngo);
		} else {
			throw new NGONotFoundException(ngo.getNgoId() + " this employee is not found.");
		}
	}

//------------------------------------------------------------------------------------

	@Override
	public NGO viewNGO(int ngoId) {
		LOG.info("Service getAllNGOById");
		if (ingoRepository.existsById(ngoId)) {
			return ingoRepository.findById(ngoId).get();
		}
		LOG.error("NGO ID not found");
		throw new NGONotFoundException("NGO ID not found");
	}

//------------------------------------------------------------------------------------

	@Override
	public List<NGO> viewAllNGO() {
		List<NGO> list = ingoRepository.findAll();
		if (!list.isEmpty()) {
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
		if (!list.isEmpty()) {
			return list;
		} else {
			throw new NoNgoPresentByMotiveException("No Ngo Motive is present in database");
		}

	}

//------------------------------------------------------------------------------------

	@Override
	public List<NGO> viewNGOByLocation(String location) {
		LOG.info("Service viewNGOByLocation");
		List<NGO> list = ingoRepository.findByNgoLocation(location);
		if (!list.isEmpty()) {
			return list;
		} else {
			throw new NoNgoPresentByLocationException("No NGO present at \"" + location + "\" Location");
		}
	}
}
