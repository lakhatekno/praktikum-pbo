package baloktabung;

import java.util.Scanner;

public class BalokTabung {

    public static void main(String[] args) {
        
        double panjang, lebar, tinggi, jariJari;
        Scanner input = new Scanner(System.in);
        char ulangProgram = 'y', pilihan;
        
        do {
            System.out.println("====================");
            System.out.println("    MENU PROGRAM");
            System.out.println("====================");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.next().charAt(0);
            switch (pilihan) {
                case '1' -> {
                    System.out.print("Panjang: ");
                    panjang = input.nextDouble();
                    System.out.print("Lebar: ");
                    lebar = input.nextDouble();
                    System.out.print("Tinggi: ");
                    tinggi = input.nextDouble();
                    Balok menghitungBalok = new Balok(panjang, lebar, tinggi);
                    System.out.println("Keliling Persegi Panjang: " + menghitungBalok.getKeliling());
                    System.out.println("Luas Persegi Panjang: " + menghitungBalok.getLuas());
                    System.out.println("Volume Balok: " + menghitungBalok.volume());
                    System.out.println("Luas Permukaan Balok: " + menghitungBalok.luasPermukaan());
                }
                case '2' -> {
                    System.out.print("Jari-Jari: ");
                    jariJari = input.nextDouble();
                    System.out.print("Tinggi: ");
                    tinggi = input.nextDouble();
                    Tabung menghitungTabung = new Tabung(jariJari, tinggi);
                    System.out.println("Luas Alas Tabung: " + menghitungTabung.getLuas());
                    System.out.println("Keliling Alas Tabung: " + menghitungTabung.getKeliling());
                    System.out.println("Luas Permukaan Tabung: " + menghitungTabung.luasPermukaan());
                    System.out.println("Volume Tabung: " + menghitungTabung.volume());
                }
                case '0' -> ulangProgram = 'n';
                default -> System.out.println("Tidak ada dalam pilihan!");
            }
            if ( ulangProgram != 'n' ) {
                System.out.print("Ulang Program? ");
                ulangProgram = input.next().charAt(0);
            }
        } while ( ulangProgram == 'y' || ulangProgram == 'Y' );
        
    }
    
}
