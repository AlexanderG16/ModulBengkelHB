package view;

import controller.Controller;
import main.Main;
import model.Barang;
import model.JenisBayar;
import model.Keranjang;
import model.Layanan;
import model.Pelanggan;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class AddTransaction {
    public AddTransaction(){
        Controller c = new Controller();
        ArrayList<Keranjang> cart = new ArrayList<Keranjang>();
        ArrayList<Layanan> services = new ArrayList<Layanan>();

        String text = "";
        for (int i = 0; i < Main.customers.size(); i++) {
            text += (i+1) + ". " + Main.customers.get(i).getCustomerName() + "\n";
        }
        String itemText = "";
        for (int i = 0; i < Main.items.size(); i++) {
            itemText += (i+1) + ". " + Main.items.get(i).getItemName() + " - " + Main.items.get(i).getItemType() + " - " + Main.items.get(i).getItemPrice() + "\n";
        }
        String layananText = "";
        for (int i = 0; i < Main.services.size(); i++){
            layananText += (i+1) + ". " + Main.services.get(i).getJenisLayanan() + " - " + Main.services.get(i).getPrice() + "\n";
        }

        boolean menu = true;
        while(menu) {
            String nama = JOptionPane.showInputDialog(null, text + "\nInput Nama (Type 'Exit' to go back):");
            if (nama.equals("Exit")){menu = false;}
            else{
                for (Pelanggan i: Main.customers){
                    if (i.getCustomerName().equals(nama)){
                        boolean repeat = true;
                        while (repeat){
                            String itemName = JOptionPane.showInputDialog(null, itemText + "Input Item Name (Type 'Exit' to go back):", "Add Item", JOptionPane.QUESTION_MESSAGE);
                            for (Barang j: Main.items){
                                if (j.getItemName().equals(itemName)){
                                    int kuantitas = Integer.parseInt(JOptionPane.showInputDialog(null, "Jumlah kuantitas barang:", "Item Quantity", JOptionPane.QUESTION_MESSAGE));
                                    cart.add(c.addItemToCart(j, kuantitas));
                                    JOptionPane.showMessageDialog(null, j.getItemName() + " has been successfully added to the cart!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    String serviceName = JOptionPane.showInputDialog(null, layananText + "Input Service Type:", "Add Service", JOptionPane.QUESTION_MESSAGE);
                                    for (Layanan k: Main.services){
                                        if (k.getJenisLayanan().equals(serviceName)){
                                            services.add(k);
                                            JOptionPane.showMessageDialog(null, "Service " + k.getJenisLayanan() + " has been selected!", "Success", JOptionPane.INFORMATION_MESSAGE);
                                            if (JOptionPane.showConfirmDialog(null, "Do you want to add more Item?", "Add More Item",
                                                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                                                repeat = true;
                                            } 
                                            else {
                                                repeat = false;
                                            }                                           
                                        }
                                    }
                                }
                            }
                        }
                        JenisBayar jenis = (JenisBayar) JOptionPane.showInputDialog(null, "Pilih Jenis Pembayaran:", "Pilih Jenis Pembayaran",  JOptionPane.PLAIN_MESSAGE, null, JenisBayar.values(), JenisBayar.GOPAY);
                        double bayar = c.totalBayarTransaksi(i, cart, services);

                        i.getCustomerTransactions().add(c.inputTransaksi(jenis, new Date(), bayar, services, cart));
                        JOptionPane.showMessageDialog(null, "Transaction has been successfully recorded!", "Transaction Success", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                };
            }
        }
    }
}
