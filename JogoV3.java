import java.util.Random;
public class JogoV3 {
    public static void main(String[] args) throws Expection{
        var cacador = new Personagem("John"); 
        var gerador = new Random();
        for( ; ; ){ //loop infinito
            //Sortear um número entre 1m 2 e 3
            int oQueFazer = gerador.nextInt(3) + 1;
            //Se for 1, o personagem caça
            //Se for 2, o personagem dorme
            //Se for 3, o personagem come
            Switch(oQueFazer) {
                case 1:
                cacador.cacar();
                break;
                case 2:
                cacador.comer();
                break;
                case 3:
                cacador.dormir();
                break;
            }
            cacador.exibirEstado();
            System.out.println("******************");
            Thread.sleep(8000);
        }
    }
}
