/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan20.targetsaldotabungan;

/**
 *
 * @author Gery Akbar Fauzi 
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mneghitung berapa
 * lamanya menabung untuk mencapai target tabungan dengan ditambah bunga
 * perbulannya
 */
public class PBO210117049Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        int i = 0;
        int saldoTabungan = 3500000;
        double bunga = 0.08;
        double saldoBulanan;

        while (saldoTabungan <= 6000000) {
            i = i + 1;
            saldoBulanan = bunga * saldoTabungan;
            saldoTabungan = (int) (saldoTabungan + saldoBulanan);
            System.out.println("Saldo di Bulan ke-" + i + " Rp."
                    + saldoTabungan);
        }
    }

}
