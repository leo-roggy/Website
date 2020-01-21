package com.leo.views;

import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainAppLayout.class)
public class HomeView extends ViewWrapper {
	private static final long serialVersionUID = -6350015649861092828L;

	public HomeView() {
		add(new Span("Test Home"));
	}
}
