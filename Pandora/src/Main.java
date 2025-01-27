import java.util.Random ;
public class Main {

    public static void main(String[] args) {
        Random Random = new Random () ;

        String[] NomiAvatar = {"Paedyn","Ramsek","Eliyh","Luminara","Thailos","Thalia","Miras","Draconis","Nyx","Demirah","Selhine","Kaelith","Xander","Niphale","Fentris","Galariel","Kale","Inhara","Lyra","Orion"};
        String [] NomiArma = {"Aegis", "Tempest", "Red Fang", "Shadowblade", "Thunderstrike", "Frostbite", "Dragon Claw", "Phantom", "Lionheart", "Vortex", "Reaper's Scythe", "Bloodmoon", "Starfall", "Darkspear", "Silverwing", "Inferno", "Crystalblade", "Windrider", "Earthshaker", "Phoenix Talon"};
        int ForzaAttacco = Random.nextInt () ;
        Avatar [] avi  = new Avatar[20] ;

        String [] NomiOperatori = {"Jake Sully", "Grace Augustine", "Norm Spellman", "Max Patel", "Trudy Chacón", "Parker Selfridge", "Miles Quaritch", "Lyle Wainfleet", "Fara Langston", "Carl Minard", "Ryan Kessler", "Jenna Harper", "Tom Blake", "Derek Stone", "Lisa Morgan", "Sam Travis", "Kevin Drummond", "Tessa Grant", "Alex Reed", "Nora Bennett"};

        for (int i = 0; i<10 ; i++) {
            int difesa = Random.nextInt();
            Coordinata posizione = new Coordinata (Random.nextDouble(),Random.nextDouble());
            int pos = Random.nextInt(20);
            PostazioneRDA p = new PostazioneRDA(NomiOperatori[pos],difesa,posizione);
            for (int l = 0 ; l<20 ; l++) {
                avi[l] = new Avatar(NomiAvatar[l],NomiArma[l],ForzaAttacco);
                ForzaAttacco = Random.nextInt();
            }
            System.out.println ("----------------------------------");
            RaidSimulator r = new RaidSimulator(avi,p);
            System.out.println ("Raid simulator n°"+(i+1));
            r.eseguiRaid();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
