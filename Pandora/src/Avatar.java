import java.util.Random ;
public class Avatar {
    private String Nome;
    private String arma;
    private int ForzaAttacco;
    private int probAttacca, ArmaNon;
    Random Random = new Random();

    public Avatar(String Nome, String arma, int Forzaattacco) {
        this.Nome = Nome;
        this.arma = arma;
        ForzaAttacco = Forzaattacco;
        probAttacca = Random.nextInt(100)-1;
        ArmaNon = Random.nextInt(100)-1;
    }


    public void Attacca(PostazioneRDA p) throws AttaccoFallitoException, ArmaMalFunzionanteException {
        if (probAttacca <= 75) {
            throw new AttaccoFallitoException("Spiacente, l'attacco non si è verificato\nProbabilità dell'attacco: "+probAttacca);
        }
            if (ArmaNon >= 70) {
                System.out.println("Attacco eseguito\nProbabilità dell'attacco: "+probAttacca);
                throw new ArmaMalFunzionanteException("Arma dell'avatar mal funzionante\nArma non funzionante al: "+ArmaNon);
            } else {
                System.out.print("Attacco eseguito con successo!");
            }

        }

    public int getForzaAttacco () {
        return ForzaAttacco ;
    }

    }

