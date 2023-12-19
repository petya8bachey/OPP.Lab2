package rule.str;

import rule.FilterRule;
import log.LogExpEnum;

public class TownRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public TownRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
