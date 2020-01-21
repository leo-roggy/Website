package com.leo.views;

import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "contact", layout = MainAppLayout.class)
public class ContactView extends ViewWrapper {
	private static final long serialVersionUID = -303585372226324424L;

	public ContactView() {
//		add(new Span("Test contact"));

		Image image = new Image("images/test.pnj", "test image");

		VerticalLayout verticalLayout = new VerticalLayout(new Span("Test contact"), image);
		verticalLayout.setAlignItems(Alignment.CENTER);

		add(verticalLayout);
	}
}
