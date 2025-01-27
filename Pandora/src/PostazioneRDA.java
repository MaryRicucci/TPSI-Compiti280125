import java.util.Random ;
public class PostazioneRDA {
    Coordinata posizione ;
    int difesa ;
    String nOperatore ;
    int obtaniumDaEstrarre ;

    Random Random = new Random ();

    public PostazioneRDA (String nOperatore, int difesa, Coordinata posizione) {
        obtaniumDaEstrarre = Random.nextInt (11) + 1;
        this.difesa = difesa ;
        this.nOperatore = nOperatore ;
        this.posizione = posizione ;
    }
    public boolean Difendi (int ForzaAttacco) throws DifesaInsufficienteException,UnobtaniumEsauritoException {
        boolean cambia = false ; ;
        if (difesa<ForzaAttacco) {
            cambia = true ;
            difesa = Random.nextInt();
            throw new DifesaInsufficienteException ("Non è possibile difendere la postazione RDA") ;
        }
        difesa = difesa - ForzaAttacco ;
        if (obtaniumDaEstrarre<0) {
            cambia = true ;
            obtaniumDaEstrarre = Random.nextInt (11) + 1;
            throw new UnobtaniumEsauritoException ("Miniere di unobtanium esaurite") ;
        }
        obtaniumDaEstrarre = obtaniumDaEstrarre-1 ;
        return cambia ;
    }
    public int getDifesa() {
        return difesa ;
    }

    public void NuovaPostazione (Coordinata c) {
        posizione = c ;
    }


}
