package rule.str;

import rule.FilterRule;
import log.LogExpEnum;

public class CountryRule extends FilterRule {
    String value;
    LogExpEnum operation;
    public CountryRule(String value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
