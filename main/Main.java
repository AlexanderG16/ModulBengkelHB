package main;

import java.util.Date;
import java.util.ArrayList;

import model.Pelanggan;
import model.Transaksi;
import view.MainMenu;
import model.Kendaraan;
import model.Layanan;
import model.Anggota;
import model.Barang;
import model.JenisBayar;
import model.Keranjang;

public class Main {
    public static ArrayList<Kendaraan> vehicles = new ArrayList<Kendaraan>(){
        {
            add(new Kendaraan("Sepeda Motor", "D2567ZAD", "Yamaha XSR155", "XSR"));
            add(new Kendaraan("Mobil", "D2567ZAU", "Nissan March", "Hatchback"));
            add(new Kendaraan("Sepeda Motor", "D2567ZAQ", "Honda CBR150R", "CBR"));
            add(new Kendaraan("Mobil", "D2567ILY", "Toyota Fortuner", "SUV"));
            add(new Kendaraan("Sepeda Motor", "D2567AQK", "Honda Vario 160", "Vario"));
            add(new Kendaraan("Sepeda Motor", "D2567UHY", "Honda BeAT 150", "BeAT"));
        }
    };
    public static ArrayList<Layanan> services = new ArrayList<Layanan>(){
        {
            add(new Layanan("VVVIP", 15000000));
            add(new Layanan("VVIP", 12000000));
            add(new Layanan("VIP", 10000000));
            add(new Layanan("Reguler", 5000000));
            add(new Layanan("Ekonomi", 2000000));
        }
    };
    public static ArrayList<Barang> items = new ArrayList<Barang>(){
        {
            add(new Barang("Shell Advance", "Oli", 60000));
            add(new Barang("Yamalube", "Oli", 50000));
            add(new Barang("UltraTec", "Oli", 80000));
            add(new Barang("NGK", "Busi", 600000));
            add(new Barang("Brembo", "Rem", 800000));
            add(new Barang("AHM", "Sparepart", 60000));
            add(new Barang("Yamaha Genuine Parts", "Sparepart", 6000000));
        }
    };
    public static ArrayList<Keranjang> cart = new ArrayList<Keranjang>(){
        {
            add(new Keranjang(2, items.get(0)));
            add(new Keranjang(4, items.get(1)));
            add(new Keranjang(5, items.get(2)));
            add(new Keranjang(3, items.get(3)));
            add(new Keranjang(2, items.get(4)));
            add(new Keranjang(5, items.get(5)));
            add(new Keranjang(1, items.get(6)));
        }
    };
    public static ArrayList<Transaksi> transactions = new ArrayList<Transaksi>(){
        {
            add(new Transaksi(JenisBayar.GOPAY, new Date(), 15320000, new ArrayList<Layanan>(services.subList(0, 1)), new ArrayList<Keranjang>(cart.subList(0, 2))));
            add(new Transaksi(JenisBayar.TUNAI, new Date(), 5200000, new ArrayList<Layanan>(services.subList(3, 4)), new ArrayList<Keranjang>(cart.subList(1, 2))));
            add(new Transaksi(JenisBayar.OVO, new Date(), 2120000, new ArrayList<Layanan>(services.subList(4, 5)), new ArrayList<Keranjang>(cart.subList(0, 1))));
            add(new Transaksi(JenisBayar.TUNAI, new Date(), 2200000, new ArrayList<Layanan>(services.subList(3, 5)), new ArrayList<Keranjang>(cart.subList(2, 4))));
            add(new Transaksi(JenisBayar.OVO, new Date(), 1800000, new ArrayList<Layanan>(services.subList(0, 2)), new ArrayList<Keranjang>(cart.subList(3, 4))));
            add(new Transaksi(JenisBayar.TUNAI, new Date(), 3700000, new ArrayList<Layanan>(services.subList(1, 2)), new ArrayList<Keranjang>(cart.subList(3, 6))));
        }
    };
    public static ArrayList<Pelanggan> customers = new ArrayList<Pelanggan>(){
        {
            add(new Pelanggan("Jokic", "Jl. Nurhadi", "081212341234", new ArrayList<Transaksi>(transactions.subList(0, 1))));
            add(new Pelanggan("Neandez", "Jl. Sukacimah", "081212341235", new ArrayList<Transaksi>(transactions.subList(1, 2))));
            add(new Pelanggan("Louisa", "Jl. JanjiManis", "081212341236", new ArrayList<Transaksi>(transactions.subList(2, 3))));
            add(new Anggota("Jaliz", "Jl. Sukajadi", "081212341237", "jalizandini@gmail.com", new ArrayList<Transaksi>(transactions.subList(3, 4)), new ArrayList<Kendaraan>(vehicles.subList(0, 2))));
            add(new Anggota("Lisa", "Jl. Sukagajadi", "081212341238", "lisanurhaidi@gmail.com", new ArrayList<Transaksi>(transactions.subList(4, 5)), new ArrayList<Kendaraan>(vehicles.subList(2, 4))));
            add(new Anggota("Adix", "Jl. Sukakamu", "081212341239", "akusiapa@gmail.com", new ArrayList<Transaksi>(transactions.subList(5, 6)), new ArrayList<Kendaraan>(vehicles.subList(4, 6))));
        }
    };


    public static void main(String[] args) {
        System.out.println("======================================================\nList Kendaraan:\n======================================================");
        for(Kendaraan i: vehicles){System.out.println(i.toString());}
        System.out.println("======================================================\nList Layanan:\n======================================================");
        for(Layanan i: services){System.out.println(i.toString());}
        System.out.println("======================================================\nList Barang:\n======================================================");
        for(Barang i: items){System.out.println(i.toString());}
        System.out.println("======================================================\nList Keranjang:\n======================================================");
        for(Keranjang i: cart){System.out.println(i.toString());}
        System.out.println("======================================================\nList Transaksi:\n======================================================");
        for(Transaksi i: transactions){System.out.println(i.toString());}
        System.out.println("======================================================\nList Pelanggan dan Anggota:\n======================================================");
        for(Pelanggan i: customers){System.out.println(i.toString());}

        new MainMenu();
    }
}
