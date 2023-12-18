package firm;

import java.util.ArrayList;

public class FirmMngr {
    private static final class InstanceHolder {
        public static final FirmMngr INSTANCE = new FirmMngr();
    }

    public static FirmMngr getInstance() {
        return FirmMngr.InstanceHolder.INSTANCE;
    }
    ArrayList<FirmVw> firmVwList = new ArrayList<>();
    ArrayList<Firm> firmList = new ArrayList<>();
    public void add(Firm firm) {
        firmList.add(firm);
    }
    public void add(FirmVw firmVw) {
        firmVwList.add(firmVw);
    }
}
