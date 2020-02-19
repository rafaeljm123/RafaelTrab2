package Rafael;
import javax.swing.JOptionPane;

public class Rafael {

    public static void main(String[] args) {
   
        String Primeironumero = 
             JOptionPane.showInputDialog("Digite um numero inteiro");   
        String Segundonumero =
             JOptionPane.showInputDialog("Digite outro  numero inteiro");
        
        double numero1 = Double.parseDouble(Primeironumero);
        double numero2 = Double.parseDouble(Segundonumero);
        
        
         
        String Operacao =        
        JOptionPane.showInputDialog("Que operação deseja realizar? 1-Adição 2- Divisão 3- Multiplicação 4- Subtração");
         
        int Escolha = Integer.parseInt(Operacao);
         
        if(Escolha == 1){
             Double soma = numero1 + numero2;
             JOptionPane.showMessageDialog(null , "A soma é igual a"+ soma , "Soma dos 2 inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{
        if(Escolha == 2){
             double div = numero1/numero2;
             JOptionPane.showMessageDialog(null , "A divisão é igual a"+ div , "Divisão dos 2 inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{       
        if(Escolha == 3){
             Double mult = numero1*numero2;
             JOptionPane.showMessageDialog(null , "A multiplicação é igual a"+ mult , "Multiplicação dos 2 inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{
        if(Escolha == 4){
             Double sub = numero1 - numero2;
             JOptionPane.showMessageDialog(null , "A subtração é igual a"+ sub , "Subtração dos 2 inteiros", JOptionPane.PLAIN_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(null , "Valor digitado inválido","ERROR", JOptionPane.PLAIN_MESSAGE);
        }
    
        }
        }
        }
    }
}

         
