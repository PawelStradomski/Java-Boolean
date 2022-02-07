
package pkgboolean;


public class Boolean {

    
    public static void main(String[] args) 
    {
       // booleana - zwraca true lub false!!!
           

            // Przyklad 1    
               
           int temperatura = 30;
           boolean czyJestCieplo;
           czyJestCieplo = temperatura > 20;
               System.out.println("JEST CIEPLO:" + czyJestCieplo);
               
            // Przyklad 2   
               
            int innaLiczba = 7;
            boolean czyRoznaOdZera = innaLiczba != 0;
               System.out.println("ROZNA OD ZERA:"+ czyRoznaOdZera);
               
            // Przyklad 3
               
            boolean isTruee = 4 == 4;
       
                System.out.println(isTruee);
                System.out.println(5>4);
                System.out.println(5<4);
                System.out.println(5!=9);
                
            // Przyklad 4
            
            int liczbaX = 7;
            boolean czyParzysta = liczbaX % 2 == 0;
               System.out.println("czyParzysta:" + czyParzysta);
               
            // Przyklad 5
           
            int liczbaY = 7;
              if(liczbaY % 2 == 0)
                   System.out.println("ParzystaY");
              else
                   System.out.println("nieParzystaY");
            
            // Przyklad 6  
              
            int liczba = 7;
            String czyParzystaZ = liczba % 2 == 0 ? "parzystaZ" : "nieParzystaZ";
                System.out.println(czyParzystaZ);
                
            // Przyklad 7
            
            int szukanaLiczba = 7;
            boolean znaleziono = szukanaLiczba == 7;
            int[] TablicaSzukana = {7, 9, 10};
            for (int i=0; i<TablicaSzukana.length; i++)
            {
                if(szukanaLiczba==TablicaSzukana[i])
                    System.out.println(znaleziono);
                else
                    System.out.println("nie znaleziono 7");
                break;
//                System.out.println(szukanaLiczba==TablicaSzukana[i]); tak lub tak
//                break;
            }

            
            
        
        
    }
    
}
