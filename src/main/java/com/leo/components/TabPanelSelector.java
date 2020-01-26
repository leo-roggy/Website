package com.leo.components;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;

public class TabPanelSelector extends VerticalLayout {
	private static final long serialVersionUID = -2634495687956585144L;

	Map<Tab, Component> tabsToPages = new HashMap<>();
	private Component pageShown;

	public TabPanelSelector(List<String> tabNames, List<Component> panels) {
		if (tabNames == null || panels == null || tabNames.size() != panels.size())
			throw new IllegalArgumentException();

		Tabs tabs = new Tabs();

		for (int i = 0; i < tabNames.size(); i++) {
			Tab tab = new Tab(tabNames.get(i));

			if (i == 0)
				pageShown = panels.get(i);
			else
				panels.get(i).setVisible(false);

			tabsToPages.put(tab, panels.get(i));
			tabs.add(tab);
		}

		tabs.addSelectedChangeListener(event -> {
			pageShown.setVisible(false);
			pageShown = tabsToPages.get(tabs.getSelectedTab());
			pageShown.setVisible(true);
		});

		this.add(tabs);
		panels.forEach(panel -> this.add(panel));

		this.setSizeFull();
		this.setAlignItems(Alignment.CENTER);
	}
}
