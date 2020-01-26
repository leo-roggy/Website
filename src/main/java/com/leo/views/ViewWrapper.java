package com.leo.views;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@CssImport("./styles/main.css")
public abstract class ViewWrapper extends VerticalLayout {
	private static final long serialVersionUID = -6534435350726022958L;

	private Div workspace;
	private HorizontalLayout footer;

	public ViewWrapper() {
		this.initWorkspace();
		this.initFooter();
		this.setSizeFull();

		super.add(this.workspace, this.footer);
	}

	@Override
	public void add(Component... components) {
		workspace.add(components);
	}

	private void initWorkspace() {
		this.workspace = new Div();
		this.workspace.setClassName("workspace");
	}

	private void initFooter() {
		Icon facebook = VaadinIcon.FACEBOOK.create();
		facebook.getStyle().set("cursor", "pointer");
		Icon twitter = VaadinIcon.TWITTER.create();
		twitter.getStyle().set("cursor", "pointer");

		this.footer = new HorizontalLayout(facebook, twitter);
		footer.setJustifyContentMode(JustifyContentMode.CENTER);
		footer.setWidth("100%");
		footer.setClassName("footer");
	}
}
