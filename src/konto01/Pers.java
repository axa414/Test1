
package konto01;
import java.io.*;

public class Pers {
    
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    
    public static int persAnz;      // Klassen Eigenschaft
    private String vorname;          // Member (0bjekt) Eigenschaften
    private String nachname;
    private String gebDat;
    private char geschlecht;
    public Address adresse;         //Referenz adresse auf Objekt der Klasse Address erzeugt
    
    public Pers()       //Default Konstruktor
    {
        persAnz++;
        adresse = new Address();
    }
    public Pers(String vorname, String nachname, String gebDat, char geschlecht, Address adresse)       //Konstruktor
    {
        persAnz++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDat = gebDat;
        this.geschlecht = geschlecht;
        this.adresse = adresse;
        //System.out.println("Hansi ist gaaaaaaanz Boeeeeeeessse!!!");

    }
    public Pers(String vorname, String nachname, String gebDat, char geschlecht, int plz,String ort,String strasse,String hNr )       //Konstruktor
    {
        persAnz++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDat = gebDat;
        this.geschlecht = geschlecht;
        
       adresse = new Address(plz,ort,strasse,hNr); //Variante 1 
        
        /* adresse = new Address();  //Variante 2 
        adresse.plz = plz;
        adresse.ort = ort;
        adresse.strasse = strasse;
        adresse.hNr = hNr;
        */
    }
    public Pers(String vorname, String nachname, String gebDat, char geschlecht)       //Konstruktor
    {
        persAnz++;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gebDat = gebDat;
        this.geschlecht = geschlecht;
        //System.out.println("Hansi ist gaaaaaaanz Boeeeeeeessse!!!");

    }
    public Pers(String vorname, String nachname)       //Konstruktor
    {
       persAnz++;
       this.vorname = vorname;
       this.nachname = nachname;
    }

    public void readPers()throws IOException
    {
        System.out.println("Vorname: ");
        vorname = br.readLine();
        System.out.println("Nachname: ");
        nachname = br.readLine();
        System.out.println("Geburtsdatum: ");
        gebDat = br.readLine();
        System.out.print("Geschlecht: ");
        geschlecht = br.readLine().charAt(0);
        /*try 
        {
            geschlecht = (char)System.in.read();
        } catch (IOException e) 
        {
            //Logger.getLogger(Pers.class.getName()).log(Level.SEVERE, null, e);
        }*/
        adresse.readAdress();
    }
    public void setVorname(String vn)
    {
        vorname = vn;
    }
    
    public String getNachname()
    {
        return nachname;
    }
    
    public void setNachname(String nachname)
    {
        this.nachname = nachname;
    }
    public void setGebDat(String gebDat)
    {
        this.gebDat = gebDat;
    }
    public void setGeschlecht(char geschlecht)
    {
        this.geschlecht = geschlecht;
    }
     
    
    public static void hallo()
    {
        System.out.println("Hallo Pers");
    }
    
    
    public String toString()
    {
        return "vorname: " + vorname + ",  nachname: " + nachname + ", gebDat: " + gebDat + ", geschlecht: " + geschlecht + ", " + adresse;
    }   
}
