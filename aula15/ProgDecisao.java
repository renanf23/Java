import javax.swing.*;

class ProgDecisao
{
	public static void main(String entrada[])
	{
		int num;
		char op=0;
		String msg="", msgEntr="Digite 1 para par/impar \nDigite 2 para positivo/negativo";
		//entrada de dados
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		//processamento
		switch(op)
		{
			case '1':
			{
				if(num % 2 == 0)
				{
					msg = msg + "É PAR";
				}
				else
				{
					msg = "É IMPAR";
				}
				break;
			
			}
			case '2':
			{
				if(num > 0)
				{
					msg = "É positivo";
				}
				else
				{
					msg = "É negativo";
				}
				break;
			}
			default: msg = "ERROR: Opção inválida, calculos não realizados ";
		}
		//saída  de resultados
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	
	}
}	