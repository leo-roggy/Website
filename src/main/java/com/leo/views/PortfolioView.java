package com.leo.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "portfolio", layout = MainAppLayout.class)
public class PortfolioView extends ViewWrapper {
	private static final long serialVersionUID = -2602706809764075428L;

	public PortfolioView() {
		add(new Span("Test portfolio"));
	}
}
