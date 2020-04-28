/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Diskon{
    public static void main (String []args){
    Buku dskn =  new Buku();
    dskn.inputData("Metodologi Penelitan", 75000, 20000, 130000, 20000);
    System.out.println(dskn.getNama());
    System.out.println(dskn.getHarga());
    System.out.println(dskn.getJumlah());
    System.out.println(dskn.getTotal());
    System.out.println(dskn.getBayar());
    System.out.println(dskn.getPotongan());
    }

}
    
