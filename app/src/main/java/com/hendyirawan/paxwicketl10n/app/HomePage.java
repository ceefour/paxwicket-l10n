package com.hendyirawan.paxwicketl10n.app;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

/**
 * @author ceefour
 *
 */
@SuppressWarnings("serial")
public class HomePage extends WebPage {

	public HomePage() {
		super();
		add(new BookmarkablePageLink<MorePage>("moreLink", MorePage.class));
		add(new HeroPanel("hero"));
	}

}
