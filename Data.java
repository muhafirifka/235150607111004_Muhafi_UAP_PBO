import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private ArrayList<Tanaman> tanamans = new ArrayList<>();
    private ArrayList<Integer> lokasi = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    public Data() {
}

public void mulai() {
    System.out.println("Selamat datang di program simulasi tanaman!");
    System.out.println("Anda dapat memilih jenis tanaman berikut:");
    System.out.println("1. Tomat");
    System.out.println("2. Stroberi");
    System.out.println("3. Persik");
    System.out.print("Pilih jenis tanaman (1-3): ");
    int pilihanTanaman = in.nextInt();

    switch (pilihanTanaman) {
        case 1:
    tanamans.add(new Tomat());
        break;
        case 2:
    tanamans.add(new Stroberi());
        break;
        case 3:
    tanamans.add(new Persik());
        break;
        default:
    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        return;
}

System.out.print("Masukkan lokasi tanam: ");
    int lokasiTanam = in.nextInt();
    lokasi.add(lokasiTanam);
}

public void menanam() {
    if (tanamans.isEmpty()) {
    System.out.println("Belum ada tanaman yang dipilih.");
        return;
}
    for (Tanaman tanaman : tanamans) {
    System.out.println("Tanaman " + tanaman.status() + " ditanam di lokasi " + lokasi.get(tanamans.indexOf(tanaman)));
        for (int i = 0; i < 10; i++) {
    tanaman.berkembang();
    System.out.println("Tanaman berkembang...");
}
    System.out.println("Tanaman " + tanaman.status() + " telah selesai tumbuh.");
    }
}

public void info() {
    if (tanamans.isEmpty()) {
    System.out.println("Belum ada tanaman yang dipilih.");
    return;
}

for (Tanaman tanaman : tanamans) {
    System.out.println("Informasi Tanaman " + tanaman.status() + ":");
    System.out.println(tanaman);
    }
}
}