package com.hendyirawan.paxwicketl10n.app;

import org.apache.wicket.markup.html.WebPage;

import com.hendyirawan.paxwicketl10n.morepanel.MorePanel;

/**
 * @author ceefour
 *
 */
@SuppressWarnings("serial")
public class MorePage extends WebPage {

	public MorePage() {
		super();
		add(new MorePanel("more"));
	}

}
