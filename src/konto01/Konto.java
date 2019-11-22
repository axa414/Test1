
package konto01;
import java.io.*;

public class Konto 
{
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    public static int kontoAnz; 
    private double saldo;
    private int kNr;
    public Pers kInhaber;
            
    public Konto()
    {
        kontoAnz++;
        kInhaber = new Pers();
    }
    public Konto(int kNr, double saldo, String vorname, String nachname, String gebDat, char geschlecht, int plz,String ort,String strasse,String hNr)
    {
        kontoAnz++;
        
        this.kNr = kNr;
        this.saldo = saldo;
        kInhaber = new Pers(vorname, nachname, gebDat, geschlecht, plz,ort,strasse,hNr );       //Konstruktor
    }
    public void readKonto() throws IOException
    {
        System.out.println("Kontonummer: ");
        kNr =Integer.parseInt(br.readLine());
        System.out.println("Saldo: ");
        saldo = Integer.parseInt(br.readLine());
        kInhaber.readPers();
        
    }

    public String toString()
    {
        return "Kontonummer: " + kNr + ",  Saldo: " + saldo + ", " + kInhaber;
    }   
        
    
    
}
