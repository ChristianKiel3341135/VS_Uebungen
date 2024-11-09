public class Main {
    public static void main(String[] args) throws InterruptedException {
        Sofa sofa = new Sofa(7);

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new Gammler("Gammler Nr." + i, sofa));
            thread.setDaemon(true);
            thread.start();
        }

        for (int i = 1; i <= 5; i++) {
            Thread thread = new Thread(new Arbeiter("Arbeiter Nr." + i, sofa));
            thread.setDaemon(true);
            thread.start();
        }

        Thread.sleep(30000);
        System.out.println("Ende der Simulation!");
    }
}