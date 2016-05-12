package nd.esp.com.event;

public class SoccerEvent extends SportEvent {

    private static final long serialVersionUID = 1L;

    private String text;

    public SoccerEvent(String source) {
        super(source);
    }

    public SoccerEvent(Object source, String text) {
        super(source);
        this.text = text;
    }

    public String news() {
        return text;
    }

    @Override
    public String getSource() {
        return String.class.cast(super.getSource());
    }
}
