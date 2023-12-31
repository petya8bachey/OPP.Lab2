package log;

import field.Field;

import java.util.Date;

public class ExpGE implements ILogExp {
    @Override
    public boolean compare(Field field, String value) {
        return Integer.parseInt(field.getValue()) >= Integer.parseInt(value);
    }
}
