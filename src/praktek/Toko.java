/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek;

/**
 *
 * @author User
 */
public class Toko {
    public int id_barang;
    public String nama_barang;
    public int harga_barang;
    public String merek;
    
  public Toko(int id_brg, String nama_brg, int hrg_brg ,String merk_brg)
    {   
        this.id_barang = id_brg;
        this.nama_barang = nama_brg;
        this.harga_barang = hrg_brg;
        this.merek = merk_brg;
    
    }
  public void Cetak()
  {
      System.out.println(" ID Barang : "+this.id_barang);
      System.out.println(" Nama Barang : "+this.nama_barang);
      System.out.println(" Harga Barang : "+this.harga_barang);
      System.out.println(" Merk Barang : "+this.merek);
  
  }
}
