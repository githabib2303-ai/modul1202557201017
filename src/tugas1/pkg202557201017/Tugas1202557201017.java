/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.pkg202557201017;

/**
 *
 * @author acer
 */
public class Tugas1202557201017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        
        //isi array asli
        System.out.println("isi array asli : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
              System.out.print(data [i][j] +" ");  
            }
            System.out.println("");
        }
        
        //menampilkan total semua angka
        double total =0;
        double penjumlahanArray=0;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data [i][j];
                penjumlahanArray++;
            }
        }
        double rataRata = total/penjumlahanArray;
        System.out.println("total semua angka : "+total);
        System.out.println("total rata rata :"+rataRata);
    }
    
}
