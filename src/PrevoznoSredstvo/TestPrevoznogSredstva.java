package PrevoznoSredstvo;

import java.util.ArrayList;

public class TestPrevoznogSredstva {
    public static void main(String[] args) {
        //nominalni tip PrevoznoSredstvo ,stvarni tip Automobil
        PrevoznoSredstvo bmw = new Automobil(2013,"nemacka","bmw","dizel",2000);

        //nominalni tip PrevoznoSredstvo ,stvarni tip Autobus
      PrevoznoSredstvo man = new Autobus(2010,"Nemacka","MAN",49);

        //Nominalni tip Voz ,stvarni tip Voz
        Voz cjira = new Voz(1890,"Austrija","BEOVOZ",19);

        //kako je nominalni tio a1 PrevoznoSredstvo mogu da pozivam samo metode u   PrevoznomSredstvu
        //medjutim ako ta metoda postoji nadjacana u stvarnom tipu onda ce se pozvati ona

        bmw.zvuk();
        // bmw.getKubikaza(); ne mozemo da pristupimo jer je nominalni tip PRevoznoSredstvo i mozemo pristupati njegovim metodama
        //osim kad je nadjacana u stvarnom tipu

        man.zvuk();
        //man.getMaksimalanbrojPutnika(); nw moze iz gore navedenog razloga

        cjira.zvuk();
        cjira.getBrojVagona(); //moze jer je voz nominalni tip

        //PRAVA PRIMENA I MOCNA STVAR POLIMORFIZMA JE

        ArrayList <PrevoznoSredstvo> prevoznaSredstva = new ArrayList<>();
        prevoznaSredstva.add(bmw);
        prevoznaSredstva.add(man);
        prevoznaSredstva.add(cjira);

        for(PrevoznoSredstvo p : prevoznaSredstva){
            p.zvuk();                     //pozvace se metode iz automobila,autobusa,voza
        }



    }
}
/*polimorfizam - samo ako je klasa izvedena
   Zivotinja z = new Pas();
nominalni tip    stvarni tip
*   DOZVOLJENO NAM JE DA PRISTUPAMO POLJIMA I POZIVAMO METODE IZ NOMINALNOG TIPA
    iako je stvarni tip Pas mi ne mozemo da pozivamo metode koje nisu definisane u Osobi
*ako postoji i u NOMINALNOM i STVARNOM pozvace se ona u STVARNOM
*
*

PITANJE ZA INTERVJU

PRENOS PO REFERENCI VS PRENOS PO VREDNOSTI
STA IDE NA STEK MEMORIJU STA I NA HEAP MEMORIJU U SLUCAJU PROSTIH A STA U SLUCAJU SLOZENIH PODATAKA
prosti tipovi se uvek cuvaju u steku a slozeni tipovi na heep memorii a njihova adresa se cuva u steku (gde su oni u heapu)
presti tipovi cuvaju vrednost u memoriji a slozeni adresu
public class NekaKlasa{

   private int a;
   private int b;
public void NekaKlasa(int a , int b){
    this.a=a;
}
public void setA(int a){
   this.a=a;
}
public void setB(int b){
    this.b=b;
}
public int getA(){
   return a;
}
public int getB(){
   return b;
}
---------------------------------------
public class NekaKlasaTest {
   public static void nekaMetoda (int a ,NekaKlasa nkk)}{
       a= 7 ;
     nkk.setA(11);
}
public static void main (String[] args){
   NekaKlasa nk = new NekaKlasa(3,4);
          int a = 4;             //int a cuva vrednost u memoriji jer je prost tip zato je ispis 4
         nekaMetoda(a,nk);    //pozvace se adresa tj nk.setA(11);

          System.out.println(a);
        System.out.println(nk.getA());

}
ISPIS ###################################
       ispisace 4 i 11




 */

