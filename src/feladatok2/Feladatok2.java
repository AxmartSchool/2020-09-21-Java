/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladatok2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jager.balazs
 */
public class Feladatok2 {
    
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      
        
        //feladat7();
        //feladat8();
        //feladat9();
        //feladat10();
        //feladat11();
        //feladat12();
        //feladat13();
        //feladat14();
        //feladat15();
        //feladat16();
        //feladat17();
        //feladat18();
        feladat21();
        
        
    }

    private static void feladat7() {
        
        for (int i = 0; i < 30; i++) {
            System.out.println(Math.pow(i, 2));
            
        }
        
        
    }

    private static void feladat8() {
        
        for (int i = 0; i < 30; i++) {
            System.out.println(Math.pow(2, i));
            
        }
        
    }

    private static void feladat9() {
        
        for (int i = 0; i <= 100; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        
        
    }

    private static void feladat10() {
        
        for (int i = 100; i > 0; i--) {
            if (i%2 != 0) {
                System.out.println(i);
            }
        }
        
    }

    private static void feladat11() {
        int szam = 10;
        for (int i = 0; i < 50; i++) {
            System.out.println(szam);
            szam+=7;
        }
        
    }

    private static void feladat12() throws IOException {
        
        System.out.println("Kerem a szamsor elso tagjat :");
        int elsoTag = Integer.parseInt(br.readLine());
        System.out.println("Kerem a differenciat : ");
        int differencia = Integer.parseInt(br.readLine());
        System.out.println("Szamsor: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(elsoTag);
            elsoTag += differencia;
        }
    }

    private static void feladat13() throws IOException {
    
        System.out.println("Kerem az elso tagot :");
        int elsoTag = Integer.parseInt(br.readLine());
        System.out.println("Kerem a masodik tagot : ");
        int masodikTag = Integer.parseInt(br.readLine());
        
        int diff = masodikTag - elsoTag;
        
        System.out.println("Szamsor elozo 10 tagja: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(elsoTag);
            elsoTag = elsoTag-diff;
           
        }
        
        System.out.println("Szamsor kovetkezo 10 tagja: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(masodikTag);
            masodikTag = masodikTag+diff;
           
        }
        
    }

    private static void feladat14() {
        double farenh ;
        for (int i = -30; i < 31; i++) {
            farenh = + (i*1.8) + 32;
            System.out.println(i+" Celsius = " + farenh + " Farenheit ");
        }
    }

    private static void feladat15() {
        
        for (int i = 10; i < 100; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
            
        }
        
    }

    private static void feladat16() throws IOException {
        
        System.out.println("Kerem a szamot : ");
        int szam = Integer.parseInt(br.readLine());
        for (int i = 1; i <= szam; i++) {
            if (szam%i == 0) {
                System.err.println(i);
            }
        }
        
    }

    private static void feladat17() throws IOException {
        
        System.out.println("Kerem a szamot : ");
        int szam = Integer.parseInt(br.readLine());
        int osztokSzama = 0;
        for (int i = 1; i <= szam; i++) {
            if (szam%i == 0) {
                osztokSzama++;
            }
        }
        if (osztokSzama == 2) {
            System.out.println("Prim");
        }else{
            System.out.println("Nem Prim");
        }
        
    }

    private static void feladat18() throws IOException {
        
        System.out.println("Kerem az elso szamot : ");
        int elsoSzam = Integer.parseInt(br.readLine());
        System.out.println("Kerem az elso szamot : ");
        int masodikSzam = Integer.parseInt(br.readLine());
        int nagyobbSzam;
        int legnagyobbKozos = 1;
        if (elsoSzam > masodikSzam) {
            nagyobbSzam = elsoSzam;
        }else{
            nagyobbSzam = masodikSzam;
            
        } 
        
        for (int i = 1; i < nagyobbSzam; i++) {
            
            if (elsoSzam % i  == 0 && masodikSzam % i == 0 && i > legnagyobbKozos) {
                legnagyobbKozos = i;
            }
            
        }
        
        System.out.println(legnagyobbKozos);
        
        
        
    }

    private static void feladat21() {
        
        for (Integer i = 100; i < 1000; i++) {
            
            
            char[] s = i.toString().toCharArray();
            int[] szamjegyek = new int[s.length];
            for (int j = 0; j < szamjegyek.length; j++) {
                szamjegyek[j] = Character.getNumericValue(s[j]);
            }
            int szamjegyekOsszege = 0;
            for (int j = 0; j < szamjegyek.length; j++) {
                
                szamjegyekOsszege += Math.pow(szamjegyek[j], 3);
                
            }
            
            if (szamjegyekOsszege == i) {
                System.out.println(i);
            }
            
            

            
        }
        
        
    }
    
   
    
}
