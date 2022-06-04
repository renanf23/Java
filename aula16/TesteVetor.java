import javax.swing.*;

class TesteVetor 
{
    public static void main(String entrada[])
    {
        int vetor[] = new int[5];

        String msg =  "vetor = ";

        for(int i=0; i<vetor.length;i++)
        {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
        }
          //vetor = 
        for (int i=0; i < vetor.length; i++)
        {
            msg = msg + vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null,msg);
        
        System.exit(0);
    }
}