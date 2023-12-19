package field;

import filter.FilterRule;
import log.LogExpEnum;

public interface Field {
    String getValue();
    FilterRule createRule(Object value, LogExpEnum operation);
    Field clone();
}
