package pic6.field;

import pic6.Field;

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
    public void createRule() {

    }

    @Override
    public Field clone() {
        return new DateInField(date);
    }
}
