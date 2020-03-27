package pilhacominterfacegrafica;

import javax.swing.JOptionPane;

public class PilhaComInterfaceGrafica {
    //criar um objeto da pilha;
    private Pilha p = null;//Instanciando a classe Pilha e criando o objeto "p", que recebe null;
    
    public static void main(String[] args) {
        //aki declaramos uma classe que iniciaremos abaixo: (OBS: a classe precisa ter o mesmo nome deste classe = PilhaComInterfaceGrafica;
        new PilhaComInterfaceGrafica(); 
    }  
    
    public PilhaComInterfaceGrafica(){
        LeituraDeDados();
        //não mostrou nada no console pois falta mostrar abaixo:
        //JOptionPane.showMessageDialog(null, "PILHA INICIAL: ");
        System.out.println("PILHA INICIAL: ");
        //JOptionPane.showMessageDialog(null, p.toString());//chamamos o método toString apartir do objeto criado "p", chamamos o método para mostrar toda a PILHA(todos os dados que o usuário digitou: placa, marca, modelo, ano etc...);
        System.out.println(p.toString());
        //JOptionPane.showMessageDialog(null, "Retirando e esvaziando a PILHA");
        System.out.println("Retirando e esvaziando a PILHA");
        while(!p.EstaVazio()){//enquanto não está vazio faça ...
            Veiculo tr = (Veiculo)p.ExcluiUltimoItem();//tr recebe um método que "tr" poderá excluir os dados da PILHA;
            //JOptionPane.showMessageDialog(null, tr);//aki está "tr" excluindo os dados da PILHA;
            System.out.println(tr);
            if(tr.getAnoDeFabricacao() > 2020){
                //JOptionPane.showMessageDialog(null, "O carro adiciona é dos anos 2020 para cima");
                System.out.println("O carro adicionado é dos anos 2020 para cima");
            }
        }
        if(p.EstaVazio()){//se a PILHA estiver vazio...
            //JOptionPane.showMessageDialog(null, "Impossivel exclui os dados da PILHA, pois todos os dados já foram excluidos");
            System.out.println("Impossivel excluir os dados da PILHA, pois todos os dados já foram excluidos");
        }               
    }
    
    public void LeituraDeDados(){
        String placa, marca, modelo; int anoDeFabricacao;
        //não esquecer de armazenar memória na PILHA
        int N;
        N = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de carros: ", "CARROS", JOptionPane.INFORMATION_MESSAGE));
        //blz, já a quantidade de carro que o usuario vai digitar(alocação de mémoria para o vetor)
        p = new Pilha(N);//alocamos mémoria para a PILHA(pilha = vetor);
        
        for(int i = 0; i < N; i++){
            placa = JOptionPane.showInputDialog(null, "Digite a placa: ", "PLACA", JOptionPane.INFORMATION_MESSAGE);
            marca = JOptionPane.showInputDialog(null, "Digite a marca: ", "MARCA", JOptionPane.INFORMATION_MESSAGE);
            modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ", "MODELO", JOptionPane.INFORMATION_MESSAGE);
            anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano de fabricação: ", "ANO DE FABRICAÇÃO", JOptionPane.INFORMATION_MESSAGE));
            p.AdicionarDado(new Veiculo(placa, marca, modelo, anoDeFabricacao));//guardando os dados na pilha(1 OBJETO);            
        }    
    }
}

