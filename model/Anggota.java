package model;

import java.util.ArrayList;

public class Anggota extends Pelanggan{
    private String email;
    private ArrayList<Kendaraan> kendaraan;

    public Anggota(){}
    public Anggota(String nama, String alamat, String noTelp, String email, ArrayList<Transaksi> transaksi, ArrayList<Kendaraan> kendaraan){
        super(nama, alamat, noTelp, transaksi);
        this.email = email;
        this.kendaraan = kendaraan;
    }

    public String getMemberEmail(){return this.email;}
    public ArrayList<Kendaraan> getMemberVehicle(){return this.kendaraan;}

    public void setMemberEmail(String email){
        this.email = email;
    }
    public void setMemberVehicle(ArrayList<Kendaraan> kendaraan){
        this.kendaraan = kendaraan;
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < this.kendaraan.size(); i++) {
            text += (i+1) + ". " + this.kendaraan.get(i).toString();
        }
        return super.toString() + "E-mail: " + this.email + 
               "\nList Kendaraan Member:\n" + text;
    }
}
