package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Pelanggan;

public class ViewThreeMostBoughtItems {
    public ViewThreeMostBoughtItems(){
        Controller c = new Controller();
        String text = "";
        for (int i = 0; i < Main.customers.size(); i++) {
            text += (i+1) + ". " + Main.customers.get(i).getCustomerName() + "\n";
        }

        boolean menu = true;
        while(menu) {
            String nama = JOptionPane.showInputDialog(null, text + "\nInput Nama (Type 'Exit' to go back):");
            if (nama.equals("Exit")){menu = false;}
            else{
                for (Pelanggan i: Main.customers){
                    if (i.getCustomerName().equals(nama)){JOptionPane.showMessageDialog(null, c.printThreeMostBoughtItems(i), "Data 3 Pesanan Terbanyak " + i.getCustomerName(), JOptionPane.INFORMATION_MESSAGE); break;}
                };
            }
        }
    }
}
