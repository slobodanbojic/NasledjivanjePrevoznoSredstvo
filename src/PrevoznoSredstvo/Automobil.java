package PrevoznoSredstvo;

public class Automobil extends PrevoznoSredstvo{
  private String tipMotora;
  private int kubikazaMotora;

    public Automobil(int godinaProizvodnje, String zemljaProizvodnje, String marka, String tipMotora, int kubikazaMotora) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.tipMotora = tipMotora;
        this.kubikazaMotora = kubikazaMotora;
    }

    public String getTipMotora() {
        return tipMotora;
    }

    public void setTipMotora(String tipMotora) {
        this.tipMotora = tipMotora;
    }

    public int getKubikazaMotora() {
        return kubikazaMotora;
    }

    public void setKubikazaMotora(int kubikazaMotora) {
        this.kubikazaMotora = kubikazaMotora;
    }
    public void zvuk (){
        System.out.println("BEEEEP BEEEEEP");
    }

}
