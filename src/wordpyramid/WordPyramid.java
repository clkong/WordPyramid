/*
 *Sean Luo 09/11/2018
 *WordPyramid.java
 *This is progrem calculates the WordPyramid.
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
