/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM :   
 */
package latihanpbo3.input;

import java.util.Scanner;

public class IF0110118039Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Nama Anda\t  : ");
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        System.out.println("Nama Anda adalah\t: " + nama);
    }

}
