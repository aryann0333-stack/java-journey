// class A implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("hi");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//             }
//         }
//     }
// }

// class B implements Runnable {
//     @Override
//     public void run() {
//         for (int i = 0; i <= 5; i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//             }
//         }
//     }
// }

public class runnable {
    public static void main(String[] args) {

        /*
         * using anonymouse class and functional interface concept to achieve lambda
         * expresionS
         */
        Runnable obj1 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }

            }
        };

        /*
         * Runnable is here the interface as class can extend only one class to avoid
         * that java has runnable as interface as thread has many other useful methods
         * to work on low level
         */
        Runnable obj2 = () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("helllo");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
