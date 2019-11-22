
package konto01;
import java.io.*;

public class Konto01 {
    
    

    final static int maxKonto; //Konstante maxPers
    static int nrKonto;
    static Konto[] konten;
    
    static //alle statischen Eigenschaften initialisieren
    {
        maxKonto = 10;
        nrKonto = 0;
        konten = new Konto[maxKonto];
    }
    
    public static void main(String[] args) throws IOException
    {   
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
       
        System.out.println("Hallo");
        System.out.println("hallo");
        int choice;
        
        while (true)
        {
            System.out.println("Insert......1");
            System.out.println("Show........2");
            System.out.println("Delete......3");
            System.out.println("Update......4");
            System.out.println("Search......5");
            System.out.println("Deposit.....6");
            System.out.println("Withdraw....7");
            System.out.println("Exit........8");
            
            System.out.println("Eingabe: ");
            choice =Integer.parseInt(br.readLine());
            
            switch(choice)
            {
                case 1: insert(); break;
                case 2: show(); break;
                case 3: delete(); break;
                case 4: update(); break;
                case 5: search(); break;
                case 6: deposit(); break;
                case 7: withdraw(); break;
                case 8: return;             
            }
            
        }
    }
    
   public static void insert() throws IOException
    {
        konten[nrKonto] = new Konto();
        konten[nrKonto].readKonto();
        nrKonto++;
    }
    public static void show()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i, ret;
        for (i = 0;i < nrKonto; i++) 
            System.out.println(konten[i]);
        System.out.println("Return: 1");
        ret = Integer.parseInt(br.readLine());
    }
    public static void delete(){}
    public static void update(){}
    public static void search(){}
    public static void deposit(){}
    public static void withdraw(){}
    
 }   
    

