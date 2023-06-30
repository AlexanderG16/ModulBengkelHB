package model;

import java.util.ArrayList;

public class Pelanggan {
    private String nama, alamat, noTelp;
    private ArrayList<Transaksi> transaksi = new ArrayList<Transaksi>();

    public Pelanggan(){}
    public Pelanggan(String nama, String alamat, String telp, ArrayList<Transaksi> transaksi){
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = telp;
        this.transaksi = transaksi;
    }

    public String getCustomerName(){return this.nama;}
    public String getCustomerAddress(){return this.alamat;}
    public String getCustomerPhoneNum(){return this.noTelp;}
    public ArrayList<Transaksi> getCustomerTransactions(){return this.transaksi;}

    public void setCustomerName(String nama){
        this.nama = nama;
    }
    public void setCustomerAddress(String alamat){
        this.alamat = alamat;
    }
    public void setCustomerPhoneNum(String telp){
        this.noTelp = telp;
    }
    public void setCustomerTransactions(ArrayList<Transaksi> transaksi){
        this.transaksi = transaksi;
    }

    public String toString(){
        String text = "";
        for (int i = 0; i < this.transaksi.size(); i++) {
            text += (i+1) + ". " + this.transaksi.get(i).toString() + "\n";
        }
        return "Nama: " + this.nama +
             "\nAlamat: " + this.alamat +
             "\nNo. Telepon: " + this.noTelp + 
             "\nList Transaksi:\n" + text + "\n";
    }
}
