package field;

import filter.FilterRule;
import log.LogExpEnum;
import rule.date.DateBegRule;
import rule.date.DateInRule;

import java.util.Date;

public class DateInField implements Field {
    Date date;
    public DateInField(Date date) {
        this.date = date;
    }
    @Override
    public String getValue() {
        return date.toString();
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new DateBegRule((Date) value, operation);
    }

    @Override
    public Field clone() {
        return new DateInField(date);
    }
}
