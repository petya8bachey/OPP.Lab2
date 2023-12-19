package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.str.UsrFieldRule;

public class UsrField implements Field {
    String value;
    public UsrField(String value) {
        this.value = value;
    }
    @Override
    public String getValue() {
        return value;
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new UsrFieldRule((String) value, operation);
    }

    @Override
    public Field clone() {
        return new UsrField(value);
    }
}
