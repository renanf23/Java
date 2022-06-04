import javax.swing.*;

class Prog07
{   
    public static void soma()
    {
        int soma =0, vetor[] = {1,2,3,4,5};
        
        for(int i=0; i< vetor.length; i++)
        {
            soma= soma + vetor[i];  
        }
        JOptionPane.showMessageDialog(null,"A soma é: " + soma);
    }
    public static int produto()
    {
        int mult=1, vetor[] = {1,2,3,4,5};
        
        for(int i=0; i<vetor.length; i++)
        {
            mult= mult*vetor[i];
        }
        return mult;
    }
    public static void main(String entrada[]) 
    {
        int p;

        soma();
        p = produto();
        JOptionPane.showMessageDialog(null,"A produtória é: " + p);
        System.exit(0);
    }
}