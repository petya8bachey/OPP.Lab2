package rule;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Setter @Getter
public class FilterRule {
    ArrayList<FilterRule> rules = new ArrayList<>();
    protected FilterRule() {}
    public void FirmRespond(FilterRule filterRule) {
        rules.add(filterRule);
    }
}
