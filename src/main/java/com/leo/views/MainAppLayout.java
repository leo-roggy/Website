package com.leo.views;

import java.util.HashMap;
import java.util.Map;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Theme(value = Lumo.class, variant = Lumo.LIGHT)
public class MainAppLayout extends AppLayout implements BeforeEnterObserver {
	private static final long serialVersionUID = 2064744273386051361L;

	private Map<Class<? extends Component>, Tab> navigationTargetToTab = new HashMap<>();
	private Tabs tabs = new Tabs();
	private HorizontalLayout tabsContainer = new HorizontalLayout();

	public MainAppLayout() {

		addMenuTab("Accueil", VaadinIcon.HOME.create(), HomeView.class);
		addMenuTab("Mes réalisations", VaadinIcon.CUBES.create(), PortfolioView.class);
		addMenuTab("Mes prix", VaadinIcon.COIN_PILES.create(), PricesView.class);
		addMenuTab("Me contacter", VaadinIcon.COMMENTS_O.create(), ContactView.class);
		tabsContainer.add(tabs);
		tabsContainer.setWidthFull();
		tabsContainer.setJustifyContentMode(FlexComponent.JustifyContentMode.END);

//		tabs.setOrientation(Tabs.Orientation.HORIZONTAL);
//		addToDrawer(tabs);
//		addToNavbar(new DrawerToggle());

		addToNavbar(tabsContainer);
	}

	private void addMenuTab(String label, Icon icon, Class<? extends Component> target) {
		Tab tab = new Tab(icon, new RouterLink(label, target));
		navigationTargetToTab.put(target, tab);
		tabs.add(tab);
	}

	@Override
	public void beforeEnter(BeforeEnterEvent event) {
		tabs.setSelectedTab(navigationTargetToTab.get(event.getNavigationTarget()));
	}

}
