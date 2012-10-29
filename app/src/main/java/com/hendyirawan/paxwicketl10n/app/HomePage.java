package com.hendyirawan.paxwicketl10n.app;

import org.apache.wicket.markup.html.WebPage;

/**
 * @author ceefour
 *
 */
@SuppressWarnings("serial")
public class HomePage extends WebPage {

	public HomePage() {
		super();
		add(new HeroPanel("hero"));
	}

}
