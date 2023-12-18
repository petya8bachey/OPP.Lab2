package pic6.field;

import pic6.Field;

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
