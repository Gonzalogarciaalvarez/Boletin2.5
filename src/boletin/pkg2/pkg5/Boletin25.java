/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg2.pkg5;

import java.util.Scanner;

/**
 *
 * @author ggarciaalvarez
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n;
        int paso;
        Scanner obx1 = new Scanner (System.in);
        n = obx1.nextInt();
        paso=n*1852;
        System.out.println(n+" millas son "+paso+" metros");
    }
    
}
