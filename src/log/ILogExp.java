package log;

import field.Field;

import java.util.Date;

public interface ILogExp {
    boolean compare(Field field, String value);
}
