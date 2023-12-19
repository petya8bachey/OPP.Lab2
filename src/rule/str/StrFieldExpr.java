package rule.str;

import field.Field;
import log.LogExpEnum;
import log.LogExpFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static log.LogExpEnum.*;
import static log.LogExpEnum.NoContains;

public class StrFieldExpr {
    LogExpFactory factory = new LogExpFactory();
    LogExpEnum[] str = { EQ, NoEQ, Contains, NoContains};
    ArrayList<LogExpEnum> operations = new ArrayList<>(List.of(str));
    public boolean exp(Field field, String value, LogExpEnum operation) {
        if (operations.contains(operation)) {
            return factory.logExp(operation).compare(field ,value);
        }
        return false;
    }
}
