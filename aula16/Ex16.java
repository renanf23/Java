import javax.swing.*;

class Ex16
{   
    public static void soma(int x[])
    {
        int soma =0;
        
        for(int i=0; i< x.length; i++)
        {   
            soma= soma + x[i];  
        }
        JOptionPane.showMessageDialog(null,"A soma é: " + soma);

    }
    public static int produto(int x[])
    {
        int mult=1;
        
        for(int i=0; i<x.length; i++)
        {
            mult= mult*x[i];
        }
        return mult;
    }
    public static void main(String entrada[]) 
    {
        int s, p, vetor[]= new int[5];

        for(int i=0; i<vetor.length;i++)
        {
            vetor[i]= Integer.parseInt(JOptionPane.showInputDialog("Digite o item " + i));
        }

        soma(vetor);
        p = produto(vetor);
        JOptionPane.showMessageDialog(null,"A produtória é: " + p);
        System.exit(0);
    }
}