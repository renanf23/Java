import javax.swing.*;

class ProgMod{
    public static void soma()
    {
        int n1, n2, soma;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro: "));
        soma= n1 + n2;
        JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + soma);
    }
    public static void subtracao(int x, int y)
    {
        int sub;
        sub = x - y;
        JOptionPane.showMessageDialog(null, x + " - " + y + " = " + sub);
    }
    public static int produto()
    {
        int n1, n2, p;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro: "));
        p = n1 * n2;
        return p;
    
    }
    public static double divisao(int x, int y)  
    {
        double div;
        div = (double)x / (double)y;
        return div;
    }
    public static void main(String entrada[]) 
    {
        int n1,n2, p;
        double r;
        soma();
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro: "));
        subtracao(n1, n2);
        p = produto();
        JOptionPane.showMessageDialog(null, n1 + " x " + n2 + " = " + p );
        r = divisao(n1, n2);
        JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + r );
        System.exit(0);
    }

}
