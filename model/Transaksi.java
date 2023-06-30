package model;

import java.util.Date;
import java.util.ArrayList;

public class Transaksi {
    private JenisBayar jenisPembayaran;
    private Date tanggalTransaksi;
    private double totalBayar;
    private ArrayList<Layanan> layanan;
    private ArrayList<Keranjang> keranjang;

    public Transaksi(){}
    public Transaksi(JenisBayar jenis, Date tgl, double bayar, ArrayList<Layanan> layanan, ArrayList<Keranjang> keranjang){
        this.jenisPembayaran = jenis;
        this.tanggalTransaksi = tgl;
        this.totalBayar = bayar;
        this.layanan = layanan;
        this.keranjang = keranjang;
    }

    public JenisBayar getPaymentMethod(){return this.jenisPembayaran;}
    public Date getTransactionDate(){return this.tanggalTransaksi;}
    public double getTransactionPay(){return this.totalBayar;}
    public ArrayList<Layanan> getTransactionServices(){return this.layanan;}
    public ArrayList<Keranjang> getTransactionCarts(){return this.keranjang;}

    public void setPaymentMethod(JenisBayar jenis){
        this.jenisPembayaran = jenis;
    }
    public void setTransactionDate(Date tgl){
        this.tanggalTransaksi = tgl;
    }
    public void setTransactionPay(double bayar){
        this.totalBayar = bayar;
    }
    public void setTransactionServices(ArrayList<Layanan> layanan){
        this.layanan = layanan;
    }
    public void setTransactionCarts(ArrayList<Keranjang> keranjang){
        this.keranjang = keranjang;
    }

    public String toString(){
        String textLayanan = "", textKeranjang = "";
        for (int i = 0; i < this.layanan.size(); i++) {
            textLayanan += (i+1) + ". " + this.layanan.get(i).toString() + "\n";
        }
        for (int i = 0; i < this.keranjang.size(); i++) {
            textKeranjang += (i+1) + ". " + this.keranjang.get(i).toString() + "\n";
        }
        return "Jenis Pembayaran: " + this.jenisPembayaran +
             "\nTanggal Transaksi: " + this.tanggalTransaksi +
             "\nTotal Bayar: " + this.totalBayar + 
             "\nList Layanan:\n" + textLayanan + 
             "\nList Keranjang:\n" + textKeranjang + "\n";
    }
}
