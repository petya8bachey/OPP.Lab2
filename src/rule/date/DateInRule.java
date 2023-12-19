package rule.date;

import rule.FilterRule;
import log.LogExpEnum;

import java.util.Date;

public class DateInRule extends FilterRule {
    Date value;
    LogExpEnum operation;
    public DateInRule(Date value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
