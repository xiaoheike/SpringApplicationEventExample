package nd.esp.com.event;

public class NBAEvent extends SportEvent {

    private static final long serialVersionUID = 1L;

    private String text;

    public NBAEvent(Object source) {
        super(source);
    }

    public NBAEvent(String source, String text) {
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
