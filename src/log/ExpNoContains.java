package log;

import field.Field;

public class ExpNoContains implements ILogExp {

    @Override
    public boolean compare(Field field, String value) {
        return !field.getValue().contains(value);
    }
}
