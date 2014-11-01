package org.jboss.as.quickstarts.kitchensink.filter;

import javax.servlet.annotation.WebFilter;
import org.rhq.helpers.rtfilter.filter.RtFilter;

/**
 * Servlet Filter implementation class RhqRuntimeFilter
 */
@WebFilter(urlPatterns = { "/*" })
public class RhqRuntimeFilter extends RtFilter {

}
