package field;

import filter.FilterRule;
import log.LogExpEnum;
import rule.str.TownRule;

public class TownField implements Field {
    String town;
    public TownField(String town) {
        this.town = town;
    }
    @Override
    public String getValue() {
        return town;
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new TownRule((String) value, operation);
    }

    @Override
    public Field clone() {
        return new TownField(town);
    }
}
