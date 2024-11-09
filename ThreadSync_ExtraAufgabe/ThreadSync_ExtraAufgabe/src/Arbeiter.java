import java.util.Random;

public class Arbeiter extends Typ{

    public Arbeiter(String name, Sofa sofa) {
        this.name = name;
        this.sofa = sofa;
        this.prio = true;
    }

    @Override
    public void run() {
        Random rn = new Random();
        while(true){
            try {
                int randNum = rn.nextInt(5);
                System.out.println(name + " arbeitet...");
                Thread.sleep(randNum * 1000);
                System.out.println(name + " will lange auf das Sofa!");
                sofa.hinsetzen(this);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            sofa.aufstehen(name);
        }
    }
}
