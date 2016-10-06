
package rectangulo;

import javax.swing.JOptionPane;


public class Rectangulo {

 
    public static void main(String[] args) {
        float base;
        float altura;
        base = Float.parseFloat(JOptionPane.showInputDialog("base "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("altura "));
                System.out.println("área rectangulo de base " + base + "cm e altura " + altura + "cm = " + base * altura + "cm²");
    }
    
}
