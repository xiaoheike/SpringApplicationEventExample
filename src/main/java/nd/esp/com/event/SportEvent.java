package nd.esp.com.event;

import org.springframework.context.ApplicationEvent;

public class SportEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;

    public SportEvent(Object source) {
        super(source);
    }
}
