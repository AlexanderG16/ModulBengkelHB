package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;

public class ViewTotalAllTransactions {
    public ViewTotalAllTransactions(){
        Controller c = new Controller();

        JOptionPane.showMessageDialog(null, c.totalPendapatanSemuaTransaksi(Main.customers), "Total Seluruh Transaksi", JOptionPane.INFORMATION_MESSAGE);
    }
}
