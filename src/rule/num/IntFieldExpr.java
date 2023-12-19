package rule.num;

import field.Field;
import log.ILogExp;
import log.LogExpEnum;
import log.LogExpFactory;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static log.LogExpEnum.*;
import static log.LogExpEnum.LE;

public class IntFieldExpr {
    LogExpFactory factory = new LogExpFactory();
    LogExpEnum[] num = { EQ, NoEQ, GT, LT, GE, LE};
    ArrayList<LogExpEnum> operations = new ArrayList<>(List.of(num));
    public boolean exp(Field field, Integer value, LogExpEnum operation) {
        if (operations.contains(operation)) {
            return factory.logExp(operation).compare(field ,value.toString());
        }
        return false;
    }
}
