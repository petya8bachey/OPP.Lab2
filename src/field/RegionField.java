package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.str.RegionRule;

public class RegionField implements Field {
    String region;
    public RegionField(String region) {
        this.region = region;
    }
    @Override
    public String getValue() {
        return region;
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new RegionRule((String) value, operation);
    }

    @Override
    public Field clone() {
        return new RegionField(region);
    }
}
