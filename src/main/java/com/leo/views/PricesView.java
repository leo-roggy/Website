package com.leo.views;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.leo.Routing;
import com.leo.components.TabPanelSelector;
import com.leo.reference.RealisationType;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = Routing.CORALINE_PRICES, layout = MainAppLayout.class)
public class PricesView extends ViewWrapper {
	private static final long serialVersionUID = -3752170930935560671L;

	public PricesView() {
		List<String> names = Stream.of("Modelisation 3D", "Dessin digital", "Dessin papier")
				.collect(Collectors.toList());

		Component mod3dPage = new Span(RealisationType.MODEL_3D.toString());
		Component digiDrawPage = new Span(RealisationType.DIGITAL_DRAWING.toString());
		Component classDrawPage = new Span(RealisationType.CLASSIC_DRAWING.toString());

		List<Component> panels = Stream.of(mod3dPage, digiDrawPage, classDrawPage).collect(Collectors.toList());

		TabPanelSelector tabPanelSelector = new TabPanelSelector(names, panels);

		VerticalLayout mainContainer = new VerticalLayout(tabPanelSelector);
		mainContainer.setAlignItems(Alignment.CENTER);
		this.add(mainContainer);
	}

}
