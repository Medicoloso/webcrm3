package webcrm.framework.view;

import javax.servlet.http.HttpServletRequest;

/**
 * <code>View</code> showing an error page when a <code>Service</code> 
 * could not be found in the <code>ServiceRegistry</code>.
 *  
 * @author Christian Sauer (CSA), Giniality AG
 */
public class ServiceNotFoundView extends AbstractHtmlView {

	/**
	 * Shows the error screen.
	 * 
	 * @return The error screen.
	 */
	public String createPageContents() {
		String aPage = "";

		aPage += "<html><header><title>Error ...</title></header>\n";
		aPage += "<body bgcolor=\"#cc0000\" text=\"#ffffff\">\n";
		aPage += "<center>\n";
		aPage += "The origin query was:<b>"
			+ ((HttpServletRequest) getDisplayObject()).getQueryString()
			+ "</b>\n";
		aPage += "<p>\n";
		aPage
			+= "<h2>The <i>Service</i> you have specified is not registered in the <i>ServiceRegistry</i>!</h2>\n";
		aPage += "</center></p>\n";
		aPage += "</body>\n";
		aPage += "</html>";

		return aPage;
	}

	/**
	 * Gets the title of this page.
	 * 
	 * @return The title of this page.
	 */
	public String getTitle() {
		return "An errot ocurred ...";
	}

	/**
	 * Gets the alias name of this page which will be
	 * used in forming urls.
	 * 
	 * @return The alias name of this page.
	 */
	public String getAliasName() {
		return "viewNotFound";
	}
}