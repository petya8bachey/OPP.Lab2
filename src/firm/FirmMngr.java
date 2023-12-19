package firm;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
@Setter @Getter
public class FirmMngr {
    ArrayList<FirmVw> firmVwList = new ArrayList<>();
    ArrayList<Firm> firmList = new ArrayList<>();
    public Firm newFirm() {
        Firm firm = new Firm();
        firmList.add(firm);
        return firm;
    }
    public FirmVw newFirmVw() {
        FirmVw firmVw = new FirmVw();
        firmVwList.add(firmVw);
        return firmVw;
    }
}
