package controller;

import java.util.Date;
import model.Anggota;
import model.Barang;
import model.Pelanggan;
import model.Transaksi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import model.JenisBayar;
import model.Kendaraan;
import model.Keranjang;
import model.Layanan;

public class Controller {
    public Controller(){}

    public Anggota inputAnggota(String nama, String alamat, String telp, String email, ArrayList<Transaksi> transaksi, ArrayList<Kendaraan> kendaraan){
        return new Anggota(nama, alamat, telp, email, transaksi, kendaraan);
    }

    public Transaksi inputTransaksi(JenisBayar jenis, Date tgl, double bayar, ArrayList<Layanan> layanan, ArrayList<Keranjang> keranjang){
        return new Transaksi(jenis, tgl, bayar, layanan, keranjang);
    }

    public double totalPendapatanSemuaTransaksi(ArrayList<Pelanggan> list){
        double total = 0;
        for (Pelanggan i : list){
            for (Transaksi j: i.getCustomerTransactions()){
                total += j.getTransactionPay();
            }
        }
        return total;
    }

    public Pelanggan inputPelanggan(String nama, String alamat, String telp, ArrayList<Transaksi> transaksi){
        return new Pelanggan(nama, alamat, telp, transaksi);
    }

    public double totalBayarTransaksi(Pelanggan customer, ArrayList<Keranjang> cart, ArrayList<Layanan> services){
        double total = 0;
        for (Keranjang i: cart) {
            total += i.getItem().getItemPrice()*i.getQuantity();
        }
        if (customer instanceof Anggota){
            return total;
        }
        for (Layanan i: services){
            total += i.getPrice();
        }
        return total;
    }

    public String printCustomerTransaction(Pelanggan customer){
        String text = "Daftar Transaksi " + customer.getCustomerName() + ":\n";
        for (int i = 0; i < customer.getCustomerTransactions().size(); i++) {
            text += (i+1) + ". " + customer.getCustomerTransactions().get(i).toString() + "\n";
        }
        return text;
    }

    public String printThreeMostBoughtItems(Pelanggan customer){
        HashMap<Barang, Integer> itemCounter = new HashMap<Barang, Integer>();
        ArrayList<Integer> count = new ArrayList<Integer>();
        for (Transaksi i: customer.getCustomerTransactions()){
            for (Keranjang j: i.getTransactionCarts()){
                if (itemCounter.keySet().contains(j.getItem())){
                    itemCounter.put(j.getItem(), itemCounter.get(j.getItem()) + j.getQuantity());
                }
                else{
                    itemCounter.put(j.getItem(), j.getQuantity());
                }
            }
        }
        for (Integer i: itemCounter.values()){count.add(i);}
        Collections.sort(count);
        String text = "3 Barang yang Paling Banyak Dibeli:\n";
        for (int i = 0; i < 3; i++) {
            for (Barang j: itemCounter.keySet()){
                if (itemCounter.get(j) == count.get(i)){
                    text += (i+1) + ". " + j.getItemName() + " - " + count.get(i) + " buah\n";
                }
            }
        }

        return text;
    }

    public Keranjang addItemToCart(Barang item, int kuantitas){
        return new Keranjang(kuantitas, item);
    }
}
