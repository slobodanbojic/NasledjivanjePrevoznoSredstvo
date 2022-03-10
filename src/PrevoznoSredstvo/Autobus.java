package PrevoznoSredstvo;

public class Autobus extends PrevoznoSredstvo{
    private int maximalanBrojPutnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka, int maximalanBrojPutnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.maximalanBrojPutnika = maximalanBrojPutnika;
    }

    public int getMaximalanBrojPutnika() {
        return maximalanBrojPutnika;
    }

    public void setMaximalanBrojPutnika(int maximalanBrojPutnika) {
        this.maximalanBrojPutnika = maximalanBrojPutnika;
    }
    public void zvuk (){
        System.out.println("BIIII BIIII");
    }
}
