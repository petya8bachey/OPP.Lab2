import firm.Firm;
import firm.FirmMngr;
import firm.FirmVw;
import frm.frmMain;

import java.util.ArrayList;

public class MainContr {
    FirmMngr manager = new FirmMngr();
    FirmVw firmVw = manager.newFirmVw();
    ArrayList<Firm> list  = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MainContr mainContr = new MainContr();
        mainContr.some();
    }
    public void some() {
        frmMain main = new frmMain(manager, firmVw);
        main.print();
    }
}