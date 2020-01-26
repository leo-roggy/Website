package com.leo.views;

import com.leo.Routing;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = Routing.CORALINE_HOME, layout = MainAppLayout.class)
public class HomeView extends ViewWrapper {
	private static final long serialVersionUID = -6350015649861092828L;

	public HomeView() {

		VerticalLayout verticalLayout = new VerticalLayout(new H1("Qui suis-je ?"),
				new Paragraph("Coraline Lapre, jeune artiste talentueuse"), new H1("A quoi sert ce site ?"),
				new Paragraph("A présenter mes réalisations, et à vous permettre de me faire vos propres commandes"));
		verticalLayout.setAlignItems(Alignment.CENTER);

		add(verticalLayout);
	}
}
