
package dynamic.proxies.example;

public class DefaultRequestHandler implements RequestHandler {
    
    @Inject
    private SingletonService singletonService;

    @Override
    public Response handleRequest(Request request) {
        return new Response(singletonService.getMessage());
    }  
}
