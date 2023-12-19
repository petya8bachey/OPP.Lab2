package rule.num;

import filter.FilterRule;
import log.LogExpEnum;

public class ContCountRule extends FilterRule {
    Integer value;
    LogExpEnum operation;
    public ContCountRule(Integer value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
