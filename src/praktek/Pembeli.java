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
public class Pembeli extends Toko{
    public String id_pembeli;
    public String nama_pembeli;
    public String alamat;
    public String no_tlp;
     
    public Pembeli( 
            String nama_pembeli, 
            String alamat,
            String id_pembeli,
            String no_tlp,
            String nama_brg,
            String id_brg,
            String hrg_brg,
            String merk_brg)
    {   
        super(id_brg, nama_brg, hrg_brg, merk_brg);
        this.id_pembeli = id_pembeli;
        this.nama_pembeli = nama_pembeli;
        this.alamat = alamat;
        this.no_tlp = no_tlp;
    
    }
    public void tampil()
    {
        super.tampil();
        System.out.println(" No pembeli : "+this.id_pembeli);
        System.out.println(" Nama       : " +this.nama_pembeli);
        System.out.println(" Alamat     : " + this.alamat);
        System.out.println(" No Telepon : " + this.no_tlp);
    
    }
}
