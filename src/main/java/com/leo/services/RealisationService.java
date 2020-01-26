package com.leo.services;

import java.util.List;

import com.leo.reference.Realisation;
import com.leo.reference.RealisationType;

public interface RealisationService {

	List<Realisation> getRealisationsByType(RealisationType type);
}
