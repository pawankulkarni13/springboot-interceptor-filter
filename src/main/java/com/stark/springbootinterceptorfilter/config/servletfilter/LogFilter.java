package com.stark.springbootinterceptorfilter.config.servletfilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class LogFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        logger.info("Remote Host:"+request.getRemoteHost());
        logger.info("Remote Address:"+request.getRemoteAddr());
        logger.info("Hellow from (doFilter) : " + request.getLocalAddr());
        chain.doFilter(request, response);
    }
}
