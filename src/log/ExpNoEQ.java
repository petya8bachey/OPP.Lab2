package log;

import field.Field;

public class ExpNoEQ implements ILogExp {
    @Override
    public boolean compare(Field field, String value) {
        return !field.getValue().equals(value);
    }
}
