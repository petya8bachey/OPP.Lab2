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
        return null;
    }
}
