package field;

public class WedField implements Field {
    String url;
    public WedField(String url) {
        this.url = url;
    }
    @Override
    public String getValue() {
        return url;
    }

    @Override
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new WedField(url);
    }
}
