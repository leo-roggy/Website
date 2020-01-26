package com.leo.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.leo.reference.Realisation;
import com.leo.reference.RealisationType;

@Service
public class MockRealisationServiceImp implements RealisationService {

	@Override
	public List<Realisation> getRealisationsByType(RealisationType type) {
		return Stream.of(new Realisation(type, "test " + type, "images/test.jpg"),
				new Realisation(type, "test2 " + type, "images/test.jpg"),
				new Realisation(type, "test3 " + type, "images/test.jpg"),
				new Realisation(type, "test4 " + type, "images/test.jpg"),
				new Realisation(type, "test5 " + type, "images/test.jpg"),
				new Realisation(type, "test6 " + type, "images/test.jpg")).collect(Collectors.toList());

//		return new ArrayList<>();
	}

}
