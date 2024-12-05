/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaberaksi;

/**
 *
 * @author FAJAR
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggih mc = new MatematikaCanggih();
        
        // Uji dengan 3 parameter dengan pecahan 12.5, 28.7, dan 14.2
        System.out.println("Pertambahan (3 parameter)= " + mc.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pengurangan (3 parameter)= " + mc.pengurangan(12.5, 28.7, 14.2));
        System.out.println("Perkalian (3 parameter)= " + mc.perkalian(12.5, 28.7, 14.2));
        System.out.println("Pembagian (3 parameter)= " + mc.pembagian(12.5, 28.7, 14.2));
        System.out.println("Modulus (3 parameter)= " + mc.modulus(12.5, 28.7, 14.2));
        
        // Uji dengan 2 parameter
        System.out.println("Pertambahan (2 parameter)= " + mc.pertambahan(23, 34));
        System.out.println("Pertambahan (2 parameter)= " + mc.pertambahan(3.4, 4.9));
        System.out.println("Pengurangan (2 parameter)= " + mc.pengurangan(10, 5));
        System.out.println("Perkalian (2 parameter)= " + mc.perkalian(5, 5));
        System.out.println("Pembagian (2 parameter)= " + mc.pembagian(20, 2));
        System.out.println("Modulus (2 parameter)= " + mc.modulus(25, 4));
        
        // Uji dengan 3 parameter
        System.out.println("Pertambahan (3 parameter)= " + mc.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan (3 parameter)= " + mc.pertambahan(12, 28, 14));
        System.out.println("Pengurangan (3 parameter)= " + mc.pengurangan(50, 20, 10));
        System.out.println("Perkalian (3 parameter)= " + mc.perkalian(6, 5, 4));
        System.out.println("Pembagian (3 parameter)= " + mc.pembagian(20, 5, 2));
        System.out.println("Modulus (3 parameter)= " + mc.modulus(50, 7, 3));
    }
    
}
