package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.str.WebRule;

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
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new WebRule((String) value, operation);
    }

    @Override
    public Field clone() {
        return new WedField(url);
    }
}
