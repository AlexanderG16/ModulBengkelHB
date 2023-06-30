package model;

public class Barang {
    private String namaBarang, jenisBarang;
    private int hargaBarang;

    public Barang(){}
    public Barang(String nama, String jenis, int harga){
        this.namaBarang = nama;
        this.jenisBarang = jenis;
        this.hargaBarang = harga;
    }

    public String getItemName(){return this.namaBarang;}
    public String getItemType(){return this.jenisBarang;}
    public int getItemPrice(){return this.hargaBarang;}

    public void setItemName(String nama){
        this.namaBarang = nama;
    }
    public void setItemType(String jenis){
        this.jenisBarang = jenis;
    }
    public void setItemPrice(int harga){
        this.hargaBarang = harga;
    }

    public String toString(){
        return "Nama Barang: " + this.namaBarang + 
             "\nJenis Barang: " + this.jenisBarang +
             "\nHarga Barang: " + this.hargaBarang + "\n";
    }
}
