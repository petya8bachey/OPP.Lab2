package rule.num;

import filter.FilterRule;
import log.LogExpEnum;

public class PostInxRule extends FilterRule {
    Integer value;
    LogExpEnum operation;
    public PostInxRule(Integer value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
