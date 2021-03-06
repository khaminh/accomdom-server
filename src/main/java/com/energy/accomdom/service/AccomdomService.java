package com.energy.accomdom.service;

import java.util.List;

import com.energy.accomdom.entity.Accomdom;
import com.energy.accomdom.model.request.AccomdomModelRequest;

public interface AccomdomService {
	
	List<Accomdom> getAccomdoms();
	
	List<Accomdom> getAccomdomsByUserId(Long id);

	Accomdom createAccomdomPost(AccomdomModelRequest accomdomModelRequest);

	Accomdom updateAccomdomPost(long id, AccomdomModelRequest accomdomModelRequest);

	Accomdom findOne(Long id);

	void deleteAccomdomPost(Long id);
}
