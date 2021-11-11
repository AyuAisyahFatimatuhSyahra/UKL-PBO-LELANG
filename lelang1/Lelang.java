/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lelang1;

/**
 *
 * @author MOKLET-1
 */
public class Lelang {

    public static void main(String[] args) {
        // TODO code application logic here
        Masyarakat masyarakat = new Masyarakat();
        Petugas petugas = new Petugas();
        Barang barang = new Barang();
        Pelelangan pelelangan = new Pelelangan();
        pelelangan.prosesPelelangan(masyarakat, pelelangan, barang);
    }
    
}
    
    

