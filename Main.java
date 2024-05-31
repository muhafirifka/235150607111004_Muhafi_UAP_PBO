
// public class Main {
//     public static void main(String[] args) {
//         Tomat tomat = new Tomat();
//         Stroberi stroberi = new Stroberi(100, 0, 100, 0, 0.25, 0);
//         Persik persik = new Persik();

//         for (int i = 0; i < 10; i++) {
//             tomat.berkembang();
//             tomat.treatment();
//             System.out.println(tomat);

//             stroberi.berkembang();
//             stroberi.treatment();
//             System.out.println(stroberi);

//             persik.berkembang();
//             persik.treatment();
//             System.out.println(persik);
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        Tomat tomat = new Tomat();
        Stroberi stroberi = new Stroberi(100, 0, 10, 0, 0.25, 0);
        Persik persik = new Persik();

        for (int i = 0; i < 10; i++) {
            tomat.berkembang();
            tomat.treatment();
            System.out.println(tomat);

            stroberi.berkembang();
            stroberi.treatment();
            System.out.println(stroberi);

            persik.berkembang();
            persik.treatment();
            System.out.println(persik);
        }
    }
}

