import java.util.Random ;
public class RaidSimulator {
    Random Random = new Random () ;
    private Avatar[] listaAvatar = new Avatar[20];
    private PostazioneRDA postazione;
    public RaidSimulator (Avatar [] lista, PostazioneRDA p) {
        listaAvatar = lista ;
        postazione = p ;
    }
    public void eseguiRaid() throws IllegalArgumentException{
        for (int i = 0; i < listaAvatar.length; i++) {
            try {
                listaAvatar[i].Attacca(postazione);
            } catch (AttaccoFallitoException e) {
                System.out.println(e.getMessage());
            }
            catch (ArmaMalFunzionanteException e) {
                System.out.println (e.getMessage());
            }
            try {
                boolean change = postazione.Difendi(listaAvatar[i].getForzaAttacco());
                if (change) {
                    Coordinata c = new Coordinata(Random.nextDouble(),Random.nextDouble());
                    c.ControllaCoordinate();
                    postazione.NuovaPostazione(c);
                }
            }catch (DifesaInsufficienteException e) {
                System.out.println (e.getMessage());
            }catch (UnobtaniumEsauritoException e) {
                System.out.println (e.getMessage());
            }
        }
    }
}
