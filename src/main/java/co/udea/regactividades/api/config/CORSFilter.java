
package co.udea.regactividades.api.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Filter for Cross-Origin Resource Sharing.
 *
 */
@Component
public class CORSFilter implements Filter{

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with, origin, content-type, accept");
		response.setHeader("Access-Control-Max-Age", "1800");
		chain.doFilter(req, res);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
	}
	
}