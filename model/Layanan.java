package model;

public class Layanan {
    private String jenisLayanan;
    private int harga;

    public Layanan(){}
    public Layanan(String jenis, int harga){
        this.jenisLayanan = jenis;
        this.harga = harga;
    }

    public String getJenisLayanan(){return this.jenisLayanan;}
    public int getPrice(){return this.harga;}

    public void setJenisLayanan(String jenisLayanan){
        this.jenisLayanan = jenisLayanan;
    }
    public void setPrice(int harga){
        this.harga = harga;
    }

    public String toString(){
        return "Jenis Layanan: " + this.jenisLayanan +
             "\nHarga Layanan: " + this.harga + "\n";
    }
}
