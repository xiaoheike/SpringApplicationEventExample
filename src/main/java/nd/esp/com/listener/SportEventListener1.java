package nd.esp.com.listener;

import nd.esp.com.event.NBAEvent;
import nd.esp.com.event.SoccerEvent;
import nd.esp.com.event.SportEvent;

import org.springframework.context.ApplicationListener;

public class SportEventListener1 implements ApplicationListener<SportEvent> {

    public void onApplicationEvent(SportEvent event) {
        if (event instanceof NBAEvent) {
            System.out.println("SportEventListener1:" + NBAEvent.class.cast(event).getSource());
        }
        if (event instanceof SoccerEvent) {
            SoccerEvent soccerEvent = SoccerEvent.class.cast(event);
            System.out.println("SportEventListener1:" + soccerEvent.getSource() + "   " + soccerEvent.news());
        }
    }
}