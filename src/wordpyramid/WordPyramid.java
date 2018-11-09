/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String letters = JOptionPane.showInputDialog("Enter a word");
        pyramid(letters);
     }
      public static void pyramid(String letters) {
        for(int i=0;letters.length()>2;i++)
        {
         letters = letters.substring(1,letters.length()-1);
        System.out.println(letters);
        }
         }
  }
