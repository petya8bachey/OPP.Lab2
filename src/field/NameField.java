package field;

import filter.FilterRule;
import log.LogExpEnum;
import rule.str.NameRule;

public class NameField implements Field {
    String name;
    public NameField(String name) {
        this.name = name;
    }
    @Override
    public String getValue() {
        return name;
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new NameRule((String) value, operation);
    }

    @Override
    public Field clone() {
        return new NameField(name);
    }
}
