package nd.esp.com.publisher;

import nd.esp.com.event.NBAEvent;
import nd.esp.com.event.SoccerEvent;
import nd.esp.com.event.SportEvent;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SportEventPublisher implements ApplicationContextAware {
    private ApplicationContext applicationEventPulisher = null;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationEventPulisher = applicationContext;
    }

    public void publishEvent(SportEvent sportEvent) {
        applicationEventPulisher.publishEvent(sportEvent);
    }

    public static void main(String[] args) {
        String[] xmlConfig = new String[] { "applicationContext.xml" };
        // 使用ApplicationContext来初始化系统
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlConfig);
        SportEventPublisher publisher = (SportEventPublisher) context.getBean("applicationContextAware");
        publisher.publishEvent(new NBAEvent("NBA sport:骑士队获得总冠军"));
        publisher.publishEvent(new SoccerEvent("Scorrer sport:标题：中国获得世界杯冠军", "中国击败世界各国，取得10连冠"));

    }

}
