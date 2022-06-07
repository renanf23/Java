import javax.swing.*;

class AP14
{
    public static void main(String entrada[])
    {
        //declaração das variáveis
        int n1, n2, div;
        double pot;
        String msg;

        //entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro", "Numero 1");
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro", "Numero 2"));

        //processamento
        div = n1 / n2;
        pot = Math.pow(n1, n2);

        //saída de dados
        msg = "O quociente da divisao de " + n1 + " por " + n2 + " = " + div + "\n";
        msg = msg + n1 + " elevado a " + n2 + " = " + pot;
        JOptionPane.showMessageDialog(null, msg);
        
        System.exit(0);
    }
    
}
