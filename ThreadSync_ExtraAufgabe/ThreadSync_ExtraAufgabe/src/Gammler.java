import java.util.Random;

public class Gammler extends Typ {
    public Gammler(String name, Sofa sofa) {
        this.name = name;
        this.sofa = sofa;
        this.prio = false;
    }

    @Override
    public void run() {
        Random rn = new Random();
        while(true){
            try {
                int randNum = rn.nextInt(10);
                System.out.println(name + " gammelt woanders...");
                Thread.sleep(randNum * 1000);
                System.out.println(name + " will auf das Sofa!");
                sofa.hinsetzen(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            sofa.aufstehen(name);
        }
    }

}
