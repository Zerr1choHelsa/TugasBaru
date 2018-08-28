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
public class Toko {
    public String nama_barang;
    public String id_barang;
    public String harga_barang;
    public String merk_barang;
    
    public Toko(String id_brg, String nama_brg, String hrg_brg ,String merk_brg)
    {   
        this.id_barang = id_brg;
        this.nama_barang = nama_brg;
        this.harga_barang = hrg_brg;
        this.merk_barang = merk_brg;
    
    }
    public void tampil()
    {
        System.out.println(" Nama Barang : "+this.nama_barang);
        System.out.println(" Id          : " +this.id_barang);
        System.out.println(" Harga       : " + this.harga_barang);
        System.out.println(" No Telepon  : " + this.merk_barang);
    }
}
