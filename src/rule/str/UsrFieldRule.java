package rule.str;

import rule.FilterRule;
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
