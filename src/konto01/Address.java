/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konto01;
import java.io.*;
/**
 *
 * @author zi
 */
public class Address {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
        
    private int plz;
    private String ort;
    private String strasse;
    private String hNr;
    
    public Address()
    {
        
    }
    public Address(int plz,String ort,String strasse,String hNr)
    {
        this.plz = plz;
        this.ort = ort;
        this.strasse = strasse;      
        this.hNr = hNr;        
    }
   
    public String getOrt()
    {
        return ort;
    }
    
    public void readAdress()throws IOException
    {
        System.out.println("Postleitzahl: ");
        plz = Integer.parseInt(br.readLine());
        System.out.println("Ort: ");
        ort = br.readLine();
        System.out.println("Strasse: ");
        strasse = br.readLine();
        System.out.println("Hausnummer: ");
        hNr = br.readLine();
       
    }
    public String toString()
    {
        return " " + plz + " " +  ort+ " " + strasse + " " + hNr  ;
    }
   
      
}
