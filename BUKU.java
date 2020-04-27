/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class BUKU {
    //Deklarasii Variabel
    int  HARGA, JUMLAH, TOTAL, BAYAR;
    int potonganA, potonganB, potonganC;
    String NAMA;
    
    void inputData (String x, int y,int z, int a){
        NAMA=x;
        HARGA=y;
        JUMLAH=z;
        BAYAR=a;
        TOTAL=HARGA*JUMLAH;
        
        //untuk potongan harga 5 persen
        potonganA = (TOTAL - ((TOTAL*5)/100));
        //untuk potongan harga 8 persen
        potonganB = (TOTAL - ((TOTAL*8)/100));
        //untuk potongan harga 10 persen
        potonganC = (TOTAL - ((TOTAL*10)/100));
        
        
          //Branching
        if((TOTAL>=10000)&&(TOTAL<=20000)){
            BAYAR = TOTAL - potonganA;
        }else if ((TOTAL>=21000)&&(TOTAL<=30000)){
            BAYAR = TOTAL - potonganB;
        } else if (TOTAL>=31000){
            BAYAR = TOTAL - potonganC;
        } else {
            BAYAR = TOTAL;
        }
        
    }
    
    //Method
    void cetak (){
       
        System.out.println("Nama Buku : "+NAMA);
        System.out.println("Harga Satuan : Rp."+HARGA);
        System.out.println("Jumlah Buku : "+JUMLAH);
        System.out.println("Total Harga : "+ TOTAL);
        System.out.println("Potongan Harga :Rp "+(BAYAR-TOTAL));
        System.out.println("Total Pembayaran : Rp "+BAYAR);
    
    }
}
