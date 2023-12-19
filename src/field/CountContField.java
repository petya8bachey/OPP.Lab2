package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.num.ContCountRule;

public class CountContField implements Field {
    Integer count;
    public CountContField(int count) {
        this.count = count;
    }
    @Override
    public String getValue() {
        return count.toString();
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new ContCountRule((Integer) value, operation);
    }

    @Override
    public Field clone() {
        return new CountContField(count);
    }
}
