/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author User
 */
public class Cek extends Pembeli {
    public int jumlah;

    public Cek(String id_pembeli, String nama_pembeli, String alamat, String no_tlp, 
            String id_brg, String nama_brg, String hrg_brg, String merk_brg) {
        super(nama_pembeli, alamat, id_pembeli, no_tlp, nama_brg, id_brg, hrg_brg, merk_brg);
        int jml = 0;
        this.jumlah = jml;
        
    }
    public void tampil()
    {
        super.tampil();
        System.out.println("Jumlah e tod : "+this.jumlah);
    }
    public static void main(String[] args) {
        System.out.println("----------------");
        System.out.println("Kasir   : Admin1");
        System.out.println("Tanggal : 28/08/2018");
        System.out.println("----------------");
        System.out.println("Data Pembelian barang : ");
        Cek transaksi = new Cek("ss","dd","pp","qq","noo","nn","88","8y");
        
        transaksi.tampil();
        
    }
    
    
  
   
   
    
    
}
