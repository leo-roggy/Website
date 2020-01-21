package com.leo.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "prices", layout = MainAppLayout.class)
public class PricesView extends ViewWrapper {
	private static final long serialVersionUID = -3752170930935560671L;

	public PricesView() {
		add(new Span("Test Prix"));
	}

}
