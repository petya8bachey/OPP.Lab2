package rule.date;

import filter.FilterRule;
import log.LogExpEnum;

import java.util.Date;

public class DateBegRule extends FilterRule {
    Date value;
    LogExpEnum operation;
    public DateBegRule(Date value, LogExpEnum operation) {
        this.value = value;
        this.operation = operation;
        super.FirmRespond(this);
    }
}
