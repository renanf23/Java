import javax.swing.*;

class ProgRepeticao
{
    public static void main (String entrada[])
    {
        //declaração das variáveis
        int Tabuada;
        char op=0;
        String msg="", msgEntr= "Digite 1 para repetição com for\nDigite 2 para repetição com while\nDigite 3 para repetição com do/while";

        //entrada de dados
        Tabuada= Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);

        //processamento
        switch(op)
        {
            case'1':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo for: \n \n";
                for(int i=1; i<=10; i++)
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n"; 
                }
                break;
            }
            case'2':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo while: \n \n";
                int i = 1;
                while(i <= 10)
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n"; 
                    i++;
                }
                break;
            }
            case'3':
            {
                msg = msg + "Tabuada do " + Tabuada + " pelo do/while: \n \n";
                int i = 1;
                do
                {
                    msg = msg + Tabuada + " x " + i + " = " + Tabuada*i + "\n"; 
                    i++;
                }while(i<=10);
                break;
            }
            default: msg = "ERROR: Opção inválida, calculos não realizados ";
        }
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}