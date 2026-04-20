/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.pkg202557201017;
import javax.swing.JOptionPane;

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
        double totalGanjil=0;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total += data [i][j];
                penjumlahanArray++;
            }
        }
        
        
        //menampilkan array pada awal joptionpane
        String arrayAsliTeks = "";
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                arrayAsliTeks += data[i][j] + " ";
            }
            arrayAsliTeks += "\n";
        }
        JOptionPane.showMessageDialog(null, "isi array asli :\n"+arrayAsliTeks);
        
        //menampilkan fitur angka yang akan diganti 
        String inputCari =JOptionPane.showInputDialog("masukkan angka yang mau diganti : ");
        int elemenyangdiganti = Integer.parseInt(inputCari);
        
        //menampilkann fitur untuk menampilkan angka penggantinya 
        String inputBaru =JOptionPane.showInputDialog("masukkan angka yang mau diganti : ");
        int elemenpengganti = Integer.parseInt(inputBaru);
        
 //fitur pengganti angka
        String posisiIndex = "";
        String tampilanArray= "";
        System.out.println("angka setelah dirubah :");
         for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                
                //menambahkan logika untuk pencarian indeks sebelum data diganti 
                if (data[i][j] == elemenyangdiganti){
                    posisiIndex += "[" + i + "][" + j + "]";
                    data [i][j] = elemenpengganti;
                }
                System.out.print(data [i][j] + " ");
                //mengambil isi data untuk ditampilkan di joptionpane
                tampilanArray += data [i][j] + "";
            }
             System.out.println();
             tampilanArray += "\n";
            }
         
         
         //untuk mengenbalikan total nilai ke semula 
         total =0;
         penjumlahanArray=0;
         totalGanjil=0;
         //fitur menampilkan total ganjil
 
         for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                total +=data [i][j];
                penjumlahanArray++;
                if (j % 2==1){
                    totalGanjil += data [i][j];
                }
                
            }
         }
        
        double rataRata = total/penjumlahanArray;
        System.out.println("total semua angka : "+total);
        System.out.println("total rata rata :"+rataRata);
        System.out.println("total nilai ganjil :"+totalGanjil);
    }
    
}
