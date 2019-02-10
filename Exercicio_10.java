package nivelamento.java;

import javax.swing.JOptionPane;

public class Exercicio_10 {

	public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;
        int aux;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3"));

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;

        }
         
        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }
         
        JOptionPane.showMessageDialog(null, "Ordem crescente: " + num1 + " " + num2 + " " + num3);
		}
	}


