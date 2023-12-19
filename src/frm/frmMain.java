package frm;

import firm.Firm;
import firm.FirmMngr;
import firm.FirmVw;

import javax.swing.*;

public class frmMain {
    FirmMngr firmMngr;
    FirmVw firmVw;
    public frmMain(FirmMngr firmMngr, FirmVw firmVw) {
        this.firmMngr = firmMngr;
        this.firmVw = firmVw;
    }
    public void print() {
        JFrame frame = new JFrame();
        frame.setTitle("OOP.Lab2");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Firm firm = firmMngr.newFirm();
        frame.add(firm);
    }
}
