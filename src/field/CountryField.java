package field;

import rule.FilterRule;
import log.LogExpEnum;
import rule.str.CountryRule;

public class CountryField implements Field {
    String country;
    public CountryField(String country) {
        this.country = country;
    }
    @Override
    public String getValue() {
        return country;
    }

    @Override
    public FilterRule createRule(Object value, LogExpEnum operation) {
        return new CountryRule((String) value, operation);
    }
    @Override
    public Field clone() {
        return new CountryField(country);
    }
}
