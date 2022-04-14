import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        MovieSearch data = new MovieSearch();
        
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah movie: ");
        int jmlM = sc.nextInt();
        Movie[] movie = new Movie[jmlM];
        data.listMovie = movie;

        for (int i = 0; i < movie.length; i++) {

            int id = i + 1;
            System.out.println("===================");
            System.out.println("Data Movie ke-" + id);
            System.out.println("Judul: ");
            String judul = input.nextLine();
            System.out.println("Tahun: ");
            int tahun = sc.nextInt();
            System.out.println("Rating: ");
            float rating = sc.nextFloat();

            Movie m = new Movie(id, judul, tahun, rating);
            data.tambah(m);
        }

        System.out.println("------------------------------------");
        System.out.println("Data keseluruhan Film");
        data.bubbleSort();
        data.tampil();

        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian data : ");
        System.out.println("Masukkan Rating Film yang di cari : ");
        System.out.println("Rating : ");
        float cari = sc.nextFloat();
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jmlM - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println();

        s1.close();
        s.close();
        sc.close();
        input.close();
    }
}