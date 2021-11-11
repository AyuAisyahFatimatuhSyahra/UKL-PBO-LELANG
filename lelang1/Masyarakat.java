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

    import java.util.ArrayList;


public class Masyarakat implements User {
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();

    
    public Masyarakat() {
        this.namaMasyarakat.add("SASA");
        this.alamat.add("Ngawi");
        this.telepon.add("08234567890");

        this.namaMasyarakat.add("Syifa");
        this.alamat.add("Nganjuk");
        this.telepon.add("0789272727289193");
        
        this.namaMasyarakat.add("Reva");
        this.alamat.add("Tulungagung");
        this.telepon.add("08123567876");
        
       this.namaMasyarakat.add("Veve");
       this.alamat.add("Malang");
       this.telepon.add("09987264232");
    } 
    public int getJmlMasyarakat(){
        return this.namaMasyarakat.size();
    } 
    @Override
    public void setNama(String namaMasyarakat ){
        this.namaMasyarakat.add(namaMasyarakat);
    }

    @Override
    public void setAlamat(String alamat ){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon ){
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int idMasyarakat){
        return this.namaMasyarakat.get(idMasyarakat);
    }

    @Override
    public String getAlamat(int idMasyarakat){
        return this.alamat.get(idMasyarakat);
    }

    @Override
    public String getTelepon(int idMasyarakat){
        return this.telepon.get(idMasyarakat);
    }
}


