package rule.str;

import filter.FilterRule;
import log.LogExpEnum;

public class UsrFieldRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public UsrFieldRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
