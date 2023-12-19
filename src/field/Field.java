package field;

import rule.FilterRule;
import log.LogExpEnum;

public interface Field {
    String getValue();
    FilterRule createRule(Object value, LogExpEnum operation);
    Field clone();
}
