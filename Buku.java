/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Buku {
   
    //Deklarasii Variabel
    int  HARGA, JUMLAH, TOTAL, BAYAR, POTONGAN, DISKON;
    int DiskonA, DiskonB, DiskonC;
    String NAMA;
    
    //Method
    public String getNama(){
        return "Nama Buku\t\t:" + NAMA;
    }
    public String getHarga(){
    	return "Harga Satuan\t\t:" + HARGA;
    }
    public String getJumlah(){
    	return "Jumlah Buku\t\t:" + JUMLAH;
    }
    public String getTotal(){
    	return "Total Harga\t\t:" + TOTAL;
    }
    public String getBayar(){
    	return "Total Pembayaran\t:" + BAYAR;
    }
    public String getPotongan(){
    	return "Potongan Harga\t\t:" + (BAYAR-DISKON);
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
     }
}