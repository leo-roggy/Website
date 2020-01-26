package com.leo.components;

import com.leo.reference.Realisation;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RealisationPanel extends VerticalLayout {
	private static final long serialVersionUID = -4537245462117386382L;

	public RealisationPanel(Realisation realisation) {
//		this.add(new H3(realisation.getDescription()));
		Image image = new Image("/images/test.jpg", "Image d'une réalisation");
		image.setWidth("80%");
		add(image);
		add(new Paragraph(realisation.getDescription()));
		this.setAlignItems(Alignment.CENTER);
		this.setSizeFull();
	}
}
