package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Transaksi;

public class AddCustomer {
    public AddCustomer(){
        Controller c = new Controller();

        boolean menu = true;
        while(menu) {
            String name = JOptionPane.showInputDialog(null, "Input Name (Type 'Exit' to go back):");
            if (name.equals("Exit")){menu = false;}
            else{
                String alamat = JOptionPane.showInputDialog(null, "Input Alamat (Type 'Exit' to go back):");
                if (alamat.equals("Exit")){menu = false;}
                else{
                    String noTelp = JOptionPane.showInputDialog(null, "Input Nomor Telepon (Type 'Exit' to go back):");
                    if (noTelp.equals("Exit")){menu = false;}
                    else{
                        Main.customers.add(c.inputPelanggan(name, alamat, noTelp, new ArrayList<Transaksi>()));
                        JOptionPane.showMessageDialog(null, "Data " + name + " has been added successfully!", "Customer Added", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
    }
}
