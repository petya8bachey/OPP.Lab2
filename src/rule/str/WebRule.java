package rule.str;

import filter.FilterRule;
import log.LogExpEnum;

public class WebRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public WebRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
