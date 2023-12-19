package rule.date;

import field.Field;
import log.LogExpEnum;
import log.LogExpFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static log.LogExpEnum.*;


public class DateFieldExpr {
    LogExpFactory factory = new LogExpFactory();
    LogExpEnum[] date = { EQ, NoEQ};
    ArrayList<LogExpEnum> operations = new ArrayList<>(List.of(date));
    public boolean exp(Field field, Date value, LogExpEnum operation) {
        if (operations.contains(operation)) {
            return factory.logExp(operation).compare(field ,value.toString());
        }
        return false;
    }
}
