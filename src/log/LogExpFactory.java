package log;

import field.Field;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static log.LogExpEnum.*;

public class LogExpFactory {
    ILogExp expEQ = new ExpEQ();
    ILogExp expGE = new ExpGE();
    ILogExp expGT = new ExpGT();
    ILogExp expLE = new ExpLE();
    ILogExp expLT = new ExpLT();
    ILogExp expNoEQ = new ExpNoEQ();
    ILogExp expContains = new ExpContains();
    ILogExp expNoContains = new ExpNoContains();
    LogExpEnum[] str = { EQ, NoEQ, Contains, NoContains};
    LogExpEnum[] num = { EQ, NoEQ, GT, LT, GE, LE};
    LogExpEnum[] date = { EQ, NoEQ, GT, LT, GE, LE};
    List<LogExpEnum> strList = Arrays.asList(str);
    List<LogExpEnum> numList = Arrays.asList(num);
    List<LogExpEnum> dateList = Arrays.asList(date);
    public boolean compare(Field  field, String value, LogExpEnum operation) {
        if (strList.contains(operation))
            return logExp(operation).compare(field, value);
        return false;
    }
    public boolean compare(Field  field, Integer value, LogExpEnum operation) {
        if (numList.contains(operation))
            return logExp(operation).compare(field, String.valueOf(value));
        return false;
    }
    public boolean compare(Field  field, Date value, LogExpEnum operation) {
        if (dateList.contains(operation))
            return logExp(operation).compare(field, String.valueOf(value));
        return false;
    }

    public ILogExp logExp(LogExpEnum operation) {
        switch (operation) {
            case EQ -> { return expEQ; }
            case GE -> { return expGE; }
            case GT -> { return expGT; }
            case LE -> { return expLE; }
            case LT -> { return expLT; }
            case NoEQ -> { return expNoEQ; }
            case Contains -> { return expContains; }
            case NoContains -> { return expNoContains; }
        }
    }
}
