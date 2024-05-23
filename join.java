
class Thread8 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Child run start");
                Thread.sleep(2000);
                System.out.println("child run end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class join {
    public static void main(String[] args) throws InterruptedException {
        Thread8 t1 = new Thread8();
        t1.start();
        t1.join();

        for (int i = 0; i < 5; i++) {

            try {
                System.out.println("main run start");
                Thread.sleep(2000);
                System.out.println("main run end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
