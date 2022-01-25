Refer screenshots for better understanding.

#### DelegatingFilterProxy
DelegatingFilterProxy is a class in Spring's Web module. It provides features for making HTTP calls pass through filters before reaching the actual destination. With the help of DelegatingFilterProxy, a class implementing the javax.Servlet.Filter interface can be wired into the filter chain.

As an example, Spring Security makes use of DelegatingFilterProxy to so it can take advantage of Spring’s dependency injection features and lifecycle interfaces for security filters.

DelegatingFilterProxy also leverages invoking specific or multiple filters as per Request URI paths by providing the configuration in Spring's application context or in web.xml.
    
    DelegatingFilterProxy is a servlet filter itself which delegates to a specific Spring-managed bean that implements the Filter Interface.
    
### HandlerInterceptors
HandlerInterceptors are part of the Spring MVC framework and sit between the DispatcherServlet and our Controllers. We can intercept requests before they reach our controllers, and before and after the view is rendered.

### Filters
Filters are part of the webserver and not the Spring framework. For incoming requests, we can use filters to manipulate and even block requests from reaching any servlet. Vice versa, we can also block responses from reaching the client.

Spring Security is a great example of using filters for authentication and authorization. To configure Spring Security, we simply need to add a single filter, the DelegatingFilterProxy. Spring Security can then intercept all incoming and outgoing traffic. This is why Spring Security can be used outside of Spring MVC.


## Todo
Add PreFilters/PostFilters and try.