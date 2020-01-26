package com.leo.views;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.leo.Routing;
import com.leo.components.RealisationsPanel;
import com.leo.components.TabPanelSelector;
import com.leo.reference.RealisationType;
import com.leo.services.RealisationService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = Routing.CORALINE_PORTFOLIO, layout = MainAppLayout.class)
public class PortfolioView extends ViewWrapper {
	private static final long serialVersionUID = -2602706809764075428L;

	Component pageShown;

	public PortfolioView(@Autowired RealisationService realisationService) {

		List<String> names = Stream.of("Modelisation 3D", "Dessin digital", "Dessin papier")
				.collect(Collectors.toList());

		Component mod3dPage = new RealisationsPanel(RealisationType.MODEL_3D, realisationService);
		Component digiDrawPage = new RealisationsPanel(RealisationType.DIGITAL_DRAWING, realisationService);
		Component classDrawPage = new RealisationsPanel(RealisationType.CLASSIC_DRAWING, realisationService);

		List<Component> panels = Stream.of(mod3dPage, digiDrawPage, classDrawPage).collect(Collectors.toList());

		TabPanelSelector tabPanelSelector = new TabPanelSelector(names, panels);

		VerticalLayout mainContainer = new VerticalLayout(tabPanelSelector);
		mainContainer.setAlignItems(Alignment.CENTER);
		this.add(mainContainer);
	}
}
