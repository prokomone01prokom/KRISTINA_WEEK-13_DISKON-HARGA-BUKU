/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DISKON;

/**
 *
 * @author Windows 10
 */
public class BUKU {
   
    //Deklarasii Variabel
    int  HARGA, JUMLAH, TOTAL, BAYAR, POTONGAN, DISKON;
    int DiskonA, DiskonB, DiskonC;
    String NAMA;
    

    
    //Method
    void NAMA (String x){
        System.out.println("Nama Buku : "+NAMA);
    }
    void HARGA(int y){
        System.out.println("Harga Satuan : Rp."+HARGA);
    }
    void JUMLAH(int z){
        System.out.println("Jumlah Buku : "+JUMLAH);
    }
    void TOTAL(int y, int z ){
        TOTAL= HARGA*JUMLAH;
        System.out.println("Total Harga : "+ TOTAL);
    }
     void BAYAR(int x, int y){
        BAYAR=TOTAL-DISKON;
        System.out.println("Total Pembayaran : Rp "+BAYAR);
    
    }
    void POTONGAN(int a,int b){
        POTONGAN=BAYAR-DISKON;
        System.out.println("Potongan Harga :Rp "+(BAYAR-DISKON));
    }
   
    
     void inputData (String x, int y,int z, int a, int b){
        NAMA=x;
        HARGA=y;
        JUMLAH=z;
        BAYAR=a;
        DISKON=b;
        TOTAL=HARGA*JUMLAH;
        
        //untuk potongan harga 5 persen
        DiskonA = (TOTAL - ((TOTAL*5)/100));
        //untuk potongan harga 8 persen
        DiskonB = (TOTAL - ((TOTAL*8)/100));
        //untuk potongan harga 10 persen
        DiskonC = (TOTAL - ((TOTAL*10)/100));
        
        
          //Branching
        if((TOTAL>=10000)&&(TOTAL<=20000)){
            BAYAR = TOTAL - DiskonA;
        }else if ((TOTAL>=21000)&&(TOTAL<=30000)){
            BAYAR = TOTAL - DiskonB;
        } else if (TOTAL>=31000){
            BAYAR = TOTAL - DiskonC;
        } else {
            BAYAR = TOTAL;
        }