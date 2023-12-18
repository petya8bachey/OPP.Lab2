package log;

import field.Field;

public class ExpEQ implements ILogExp {

    @Override
    public boolean compare(Field field, String value) {
        return field.getValue().equals(value);
    }
}
