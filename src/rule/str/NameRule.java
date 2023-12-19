package rule.str;

import filter.FilterRule;
import log.LogExpEnum;

public class NameRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public NameRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
