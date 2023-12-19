package field;

import filter.FilterRule;
import log.LogExpEnum;
import rule.date.DateBegRule;

import java.util.Date;

public class DateBegField implements Field {
    Date date;
    public DateBegField(Date date) {
        this.date = date;
    }
    @Override
    public String getValue() {
        return null;
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
