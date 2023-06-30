package model;

public class Kendaraan {
    private String jenisKendaraan, nomorPolisi, merekKendaraan, modelKendaraan;

    public Kendaraan(){}
    public Kendaraan(String jenis, String nomor, String merek, String model){
        this.jenisKendaraan = jenis;
        this.nomorPolisi = nomor;
        this.merekKendaraan = merek;
        this.modelKendaraan = model;
    }

    public String getJenisKendaraan(){return this.jenisKendaraan;}
    public String getNomorPolisi(){return this.nomorPolisi;}
    public String getMerekKendaraan(){return this.merekKendaraan;}
    public String getModelKendaraan(){return this.modelKendaraan;}

    public void setJenisKendaraan(String jenis){
        this.jenisKendaraan = jenis;
    }
    public void setNomorPolisi(String nomor){
        this.nomorPolisi = nomor;
    }
    public void setMerekKendaraan(String merek){
        this.merekKendaraan = merek;
    }
    public void setModelKendaraan(String model){
        this.modelKendaraan = model;
    }

    public String toString(){
        return "Jenis Kendaraan: " + this.jenisKendaraan + 
             "\nNomor Polisi: " + this.nomorPolisi +
             "\nMerek Kendaraan: " + this.merekKendaraan +
             "\nModel Kendaraan: " + this.modelKendaraan + "\n";
    }
}
