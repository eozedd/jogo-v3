public class JogoV2 {
  public static void main(String[] args) throws Exception{
    Personagem p = new Personagem();
    var dormir = new Personagem(0, 4, 10);
    var fominha = new Personagem(5, 8, 21);
    p.nome = "John";
    while(true){
      p.cacar();
      p.comer();
      p.dormir();
      p.exibirEstado();
      //Exibir mensagem no terminal
      System.out.println("******************");
      Thread.sleep(8000);
    }
  }
}
