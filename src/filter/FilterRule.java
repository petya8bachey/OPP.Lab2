package filter;

import log.LogExpEnum;

import java.util.ArrayList;

public class FilterRule {
    ArrayList<FilterRule> rules = new ArrayList<>();
    public void FirmRespond(FilterRule filterRule) {
        rules.add(filterRule);
    }
}
