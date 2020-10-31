/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan21_rataratanilai;

import java.util.Scanner;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskripsi : Membuat program nilai rata-rata siswa
 */
public class PBOIF2_10119074_Latihan21_RataRataNilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, banyakmahasiswa;
        float totalnilaimahasiswa, nilaimahasiswa, rataratanilai;
        System.out.print ("Masukkan Banyaknya Mahasiswa : ");
        banyakmahasiswa = scanner.nextInt();
        totalnilaimahasiswa = 0;
        i=1;
        while (i <= banyakmahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+" : ");
                nilaimahasiswa = scanner.nextFloat ();
                totalnilaimahasiswa += nilaimahasiswa;
                i++;
        }
        rataratanilai = totalnilaimahasiswa / banyakmahasiswa;
        System.out.println("\nMaka, Rata-rata Nilainya adalah "+rataratanilai);
        System.out.println("Developed by : HANDRIAN RIVALDI");
    }
    
}
