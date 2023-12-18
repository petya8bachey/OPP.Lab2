package field;

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
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new DateInField(date);
    }
}
