package com.leo.components;

import com.leo.reference.RealisationType;
import com.leo.services.RealisationService;
import com.vaadin.flow.component.formlayout.FormLayout;

public class RealisationsPanel extends FormLayout {
	private static final long serialVersionUID = -7916564534844046201L;

	public RealisationsPanel(RealisationType realisationType, RealisationService realisationService) {
		this.setSizeFull();
		realisationService.getRealisationsByType(realisationType).forEach(real -> this.add(new RealisationPanel(real)));
	}
}
