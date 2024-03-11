package com.lexterlab.loggington.ui;

import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.component.button.Button;

@Route("example")
public class ExampleView extends VerticalLayout {

    public ExampleView() {
        Button button = new Button("Click me", e -> Notification.show("Button Clicked"));
        button.setDisableOnClick(true);
        add(button);
    }
}
