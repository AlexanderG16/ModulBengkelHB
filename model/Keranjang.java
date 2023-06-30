package model;

public class Keranjang {
    private int kuantitas;
    private Barang barang;

    public Keranjang(){}
    public Keranjang(int kuantitas, Barang barang){
        this.kuantitas = kuantitas;
        this.barang = barang;
    }

    public int getQuantity(){return this.kuantitas;}
    public Barang getItem(){return this.barang;}

    public void setQuantity(int kuantitas){
        this.kuantitas = kuantitas;
    }
    public void setItem(Barang barang){
        this.barang = barang;
    }

    public String toString(){
        return this.barang.toString() + "Kuantitas Barang: " + this.kuantitas + "\n";
    }

}
