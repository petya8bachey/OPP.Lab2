package rule;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Setter @Getter
public class FilterContr {
    public FilterContr() {}
    public FilterRule newRule() {
        FilterRule rule = new FilterRule();
        filterRule.add(rule);
        return rule;
    }
    ArrayList<FilterRule> filterRule = new ArrayList<>();
}
