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


public class Barang {
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Boolean> status = new ArrayList<Boolean>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> idMasyarakat = new ArrayList<Integer>();

    public Barang() {
        this.namaBarang.add("Mie gemez");
        this.status.add(true);
        this.harga.add(3000);
        this.idMasyarakat.add(1);
        
        this.namaBarang.add("Diary milk");
        this.status.add(false);
        this.harga.add(300000);
        this.idMasyarakat.add(2);
        
        this.namaBarang.add("Mogu mogu");
        this.status.add(true);
        this.harga.add(200000);
        this.idMasyarakat.add(3);
        
        this.namaBarang.add("Koyo");
        this.status.add(true);
        this.harga.add(5000);
        this.idMasyarakat.add(4);
        
        this.namaBarang.add("Perban");
        this.status.add(true);
        this.harga.add(6000);
        this.idMasyarakat.add(5);
        
        this.namaBarang.add("Masker");
        this.status.add(true);
        this.harga.add(10000);
        this.idMasyarakat.add(6);
        
        
    }
    public int getJmlBarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang ){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setIdMasyarakat(int idMasyarakat ){
        this.idMasyarakat.add(idMasyarakat);
    }
    public int getIdMasyarakat(int idBarang){
        return this.idMasyarakat.get(idBarang);
    }

    public void setStatus(Boolean status ){
        this.status.add(status);
    }
    public Boolean getStatus(int idBarang){
        return this.status.get(idBarang);
    } 
    public void editStatus(int idBarang, Boolean status){
        this.status.set(idBarang, status);
    } 
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }}

   
    

