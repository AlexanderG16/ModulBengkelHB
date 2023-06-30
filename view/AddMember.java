package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Kendaraan;
import model.Transaksi;

public class AddMember {
    public AddMember(){
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
                        String email = JOptionPane.showInputDialog(null, "Input Email (Type 'Exit' to go back):");
                        if (email.equals("Exit")){menu = false;}
                        else{
                            Main.customers.add(c.inputAnggota(name, alamat, noTelp, email, new ArrayList<Transaksi>(), new ArrayList<Kendaraan>()));
                            JOptionPane.showMessageDialog(null, "Data " + name + " has been added successfully!", "Member Added", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }
        }
    }
}
