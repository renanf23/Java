import javax.swing.*;

class Prog05
{
    public static void main(String entrada[])
    {
        //declaração das variáveis
        int num1, num2, soma=0;
        char op=0;
        String msg="", msgEntr="Digite 1 para adição\nDigite 2 para somatória\n";
        //entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        op= (JOptionPane.showInputDialog(msgEntr)).charAt(0);
        //processamento
        switch(op)
        {
            case'1':
            {
                if(num1%2==0 && num2%2==0)
                {
                    soma = num1 + num2;
                    msg = msg + num1 + " + " + num2 + " = " + soma; 
                }
                else{
                    msg = "ERROR: Opção inválida, calculos não realizados ";
                }
                break;
            }
            case'2':
            {
                for(int i=1; i<=num2; i++)
                {
                    soma = soma + num1;
                }
                msg = msg + soma;
                break;
            }
            default: msg = "ERROR: Opção inválida, calculos não realizados ";
        }

        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}