/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.extracredit02;

import static com.mycompany.extracredit02.ratio.ratio;

/**
 *
 * @author ariana
 */
public class ExtraCredit02 {
//calling the  ratio method //
    public static void main(String[] args) {
  int[] arr = {6,14,29,10,20,98,101};
    double ratio = ratio(arr);
    System.out.println("Ratio: " + ratio);

    }
}
