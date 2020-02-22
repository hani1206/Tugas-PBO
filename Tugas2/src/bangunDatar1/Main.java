package bangunDatar1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double p, l, t, r;
        int pilih, pilih1;
        Scanner baca = new Scanner (System.in);
        char lagi=0, lagi2=0;

        do {
            System.out.println("Menu Perhitungan\n" +
                    "-------WELCOME BISS"
                    + "----------\n" +
                    "1. Persegi Panjang \n" +
                    "2. Lingkaran \n" +
                    "-----------------");
            System.out.print("Pilih Menu : ");
            pilih = baca.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukan Panjang = ");
                    p = inputUser.nextDouble();
                    System.out.println("Masukan Lebar = ");
                    l = inputUser.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang();
                    do {
                        System.out.println("Silahkan Pilih lagi mau yang mana\n" +
                                "-----------------\n" +
                                "1. Luas Persegi Panjang \n" +
                                "2. Volume Balok\n" +
                                "3. Volume Limas Persegi Panjang\n" +
                                "-----------------");
                        System.out.print("Pilih Menu : ");
                        pilih1 = baca.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Luas Persegi Panjang = " + persegipanjang.luas(p, l));
                                break;
                            case 2:
                                System.out.print("Tinggi Balok: ");
                                t = inputUser.nextDouble();
                                Balok volumeBalok = new Balok();
                                volumeBalok.setT(t);
                                System.out.println("Volume Balok = " + volumeBalok.luas(p, l));
                                break;
                            case 3 :
                                System.out.print("Tinggi Limas: ");
                                t = inputUser.nextDouble();
                                LimasPersegiPanjang volulimas = new LimasPersegiPanjang();
                                System.out.println("Volume Limas Persegi Panjang = " + volulimas.volumeLimas(p, l, t));
                                break;
                        }
                            System.out.print("Pilih menu lagi [y/n]?");
                            lagi2 = baca.next().charAt(0);
                        }while (lagi2 == 'y' || lagi2 =='Y') ;
                        break;
                case 2:
                    System.out.println("Masukan Jari-Jari 1 = ");
                    r = inputUser.nextDouble();
                    Lingkaran lingkaran = new Lingkaran();
                    //lingkaran.setR(r);
                    do {
                        System.out.println("Silahkan Pilih lagi mau yang mana\n" +
                                "-----------------\n" +
                                "1. Luas Lingkaran \n" +
                                "2. Volume Bola\n" +
                                "3. Volume Kerucut\n" +
                                "4. Volume Tabung\n" +
                                "5. Volume Kerucut Terpancung\n" +
                                "-----------------");
                        System.out.print("Pilih Menu : ");
                        pilih1 = baca.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Luas Lingkaran = " + lingkaran.lingLuas(r));
                                break;
                            case 2:
                                Lingkaran volbola = new Bola();
                                System.out.println("Volume Balok = " + volbola.lingLuas(r));
                                break;
                            case 3 :
                                System.out.print("Tinggi Kerucut: ");
                                t = inputUser.nextDouble();
                                Lingkaran volumeKerucut = new Kerucut();
                                volumeKerucut.setT(t);
                                System.out.println("Volume Kerucut = " + volumeKerucut.lingLuas(r));
                                break;
                            case 4 :
                                System.out.print("Tinggi Tabung: ");
                                t = inputUser.nextDouble();
                                Lingkaran volumeTabung = new Tabung();
                                volumeTabung.setT(t);
                                System.out.println("Volume Tabung = " + volumeTabung.lingLuas(r));
                                break;
                            case 5 :
                                Lingkaran terpancung = new KerucutTerpancung();
                                System.out.print("Tinggi Kerucut: \n");
                                t = inputUser.nextDouble();
                                terpancung.setT(t);
                                System.out.print("Jari-jari 2 Kerucut: ");
                                p = inputUser.nextDouble();
                                terpancung.setP(p);
                                System.out.println("Volume Kerucut Terpancung = " + terpancung.lingLuas(r));
                                break;
                        }
                        System.out.print("Pilih menu lagi [y/n]?");
                        lagi2 = baca.next().charAt(0);
                    }while (lagi2 == 'y' || lagi2 =='Y') ;
                    break;
                case 3 :
                    break;
                        default:
                            System.out.println("menu ada 2 pilihan");
                    }
                    System.out.print("Pilih menu lagi [y/n]?");
                    lagi = baca.next().charAt(0);
            } while (lagi == 'y' || lagi == 'Y') ;

    }

}

