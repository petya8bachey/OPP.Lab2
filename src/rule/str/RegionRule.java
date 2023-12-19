package rule.str;

import rule.FilterRule;
import log.LogExpEnum;

public class RegionRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public RegionRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
