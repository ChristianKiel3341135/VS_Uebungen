import java.util.concurrent.Semaphore;

public class Sofa {
//Typen wie Gammler oder Arbeiter wollen sich auf dem Sofa ausruhen. Arbeiter haben aber eine höhere Prio
//als Gammler und kommen so eher zum Zug

private int sofaCapacity;
private int count = 0;
private Semaphore sofaSchutzBeauftragter;
public Sofa(int sofaCapacity) {
    this.sofaCapacity = sofaCapacity;
    sofaSchutzBeauftragter = new Semaphore(sofaCapacity);
}

public void hinsetzen(Typ typ){

        try {
            sofaSchutzBeauftragter.acquire();
            if(count < sofaCapacity){
                count++;
            }
            System.out.println(typ.getName() + " gammelt jetzt...");
            System.out.println("Anzahl belegter Plaetze: " + count);
            if(typ.getPrio()){
                Thread.sleep(3000);
            }
            else{
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    sofaSchutzBeauftragter.release();
}

public void aufstehen(String name){
        try {
            sofaSchutzBeauftragter.acquire();
            if(count > 0){
                count--;
                System.out.println(name + " muss aufstehen!");
                System.out.println("Anzahl belegter Plaetze: " + count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    sofaSchutzBeauftragter.release();
}


}
