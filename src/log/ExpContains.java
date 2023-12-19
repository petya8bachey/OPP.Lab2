package log;

import field.Field;

import java.util.Date;

public class ExpContains implements ILogExp {
    @Override
    public boolean compare(Field field, String value) {
        return field.getValue().contains(value);
    }

}
