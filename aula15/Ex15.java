import javax.swing.*;

class Ex15 {
    public static void main(String entrada[])
    {
        //declarando as variáveis 
        int num1, num2, mult=1;
        char op=0;
        String msg="", msgEntr="Digite 1 para multiplicação\nDigite 2 para produtória\n";
        //Entrada de dados
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
        //processamento
        switch(op)
        {
            case'1':
            {
                if(num1>0 && num2>0)
                {
                    mult = num1 * num2;
                    msg = msg + num1 + " x " + num2 + " = " + mult; 
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
                    mult = mult * num1;

                }
                msg = msg + "Produtoria de " + num1 + ", " + num2 + " vezes é: " + mult + "\n\n";
                break;
            }
            default: msg = "ERROR: Opção inválida, calculos não realizados ";
        }

        JOptionPane.showMessageDialog(null, msg);
        System.exit(0);
    }
    
}
