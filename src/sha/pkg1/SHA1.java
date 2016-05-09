/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sha.pkg1;

import java.security.MessageDigest;
import java.util.Scanner;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author indesqui
 */
public class SHA1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      System.out.print("Ingresar el texto a encriptar: "); 
      Scanner text = new Scanner(System.in);
      String Tx = text.nextLine();
      System.out.println("El texto a encriptar es: "+Tx+"\nEl texto encriptado con SHA-1 es: " +DigestUtils.sha1Hex(Tx)); 
 
        
        
               
        
        
    }
    
}
