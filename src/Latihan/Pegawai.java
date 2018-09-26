/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Hp
 */
public class Pegawai {
    String nama;
    int gaji;
    Pegawai(){
    }
    Pegawai(String nm){
        this.nama = nm;
        System.out.println("Pegawai");
    }
    public int gaji(){
        return 0;
    }
}

class Direktur extends Pegawai{
    private static final int gajiDir = 100000;
    private static final int tunjangan = 50000;
    
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}

class Staf extends Pegawai{
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;
    
    public int gaji(){
        return gajiStaf;
    }
    public int Bonus(){
        return bonusStaf;
    }
}

class PembayaranGaji{
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String []args){
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+pg.hitungGaji(ali));
         System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(tony));
}
}