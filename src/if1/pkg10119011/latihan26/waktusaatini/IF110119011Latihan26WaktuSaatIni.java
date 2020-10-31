/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan26.waktusaatini;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date waktuHariIni = new Date();
        DateFormat dateFormat = new SimpleDateFormat("EEEE, d MM, yyyy" + "hh:mm:ss");
        System.out.print("Hari ini adalah " + dateFormat.format(waktuHariIni));
        
    }
    
}
