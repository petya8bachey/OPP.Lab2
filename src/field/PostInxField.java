package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.num.PostInxRule;

public class PostInxField implements Field {
    Integer index;
    public PostInxField(int index) {
        this.index = index;
    }
    @Override
    public String getValue() {
        return index.toString();
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new PostInxRule((Integer) value, operation);
    }

    @Override
    public Field clone() {
        return new PostInxField(index);
    }
}
