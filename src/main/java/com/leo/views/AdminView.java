package com.leo.views;

import com.leo.Routing;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.router.Route;

@Route(value = Routing.CORALINE_ADMIN, layout = MainAppLayout.class)
public class AdminView extends VerticalLayout {
	private static final long serialVersionUID = 700473741483535981L;

	private boolean authentified = false;

	PasswordField passwordField;
	Button button;

	public AdminView() {

		this.passwordField = new PasswordField();
		this.passwordField.setLabel("Mot de passe");
		this.button = new Button("Valider");
		this.button.addClickListener(action -> {
			if ("1234".equals(passwordField.getValue())) {
				authentified = true;
				this.updateView();
			}
		});

		this.setAlignItems(Alignment.CENTER);
		this.updateView();
	}

	private void updateView() {
		this.removeAll();
		if (!this.authentified) {
			this.passwordField.setValue("");
			add(this.passwordField, this.button);
		} else {
		}

	}

}
