
package dynamic.proxies.example;

public class SingletonService {
    
    private static final String MESSAGE_FORMAT = "Message: %s\n"
                                               + "  meta-info:\n"
                                               + "    service class: %s\n"
                                               + "    service id: %d\n"
                                               + "    thread name: %s\n";
    
    private final Service requestScopedService;
    
    public SingletonService(Service requestScopedService) {
        this.requestScopedService = requestScopedService;
    }
    
    public String getMessage() {
        return String.format(MESSAGE_FORMAT, 
                requestScopedService.getMessage(), 
                requestScopedService.getClass().getName(),
                requestScopedService.serviceId(),
                requestScopedService.getThreadName()
        );
    }
}
