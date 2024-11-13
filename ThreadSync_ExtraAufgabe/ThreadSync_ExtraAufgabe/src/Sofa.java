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
    //resource count ist aber nur eine auf die alle zugreifen.
    //Semaphor kann so eigentlich nur einen Thread zulassen
}

public void hinsetzen(Typ typ){
        try {
            sofaSchutzBeauftragter.acquire();
            //Ein Thread darf zugreifen und bearbeitet count wenn in genau dem Moment die Bedingung stimmt.
            //Was wenn parallel ein anderer Thread auch Bedingung 6 < 7 prüft und den counter erhöht? dann counter = 8?
            if(count < sofaCapacity){
                count++;
            }
            System.out.println(typ.getName() + " belegt ein Platz. Anzahl nun:  " + count);
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
                System.out.println(name + " steht auf. Anzahl: " + count);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    sofaSchutzBeauftragter.release();
}


}
