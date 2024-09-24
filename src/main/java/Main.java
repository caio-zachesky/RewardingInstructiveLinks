// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

class Main {

  public static int calculaVolume(int lado){
    int v = lado*lado*lado;
    
    return v;
  }


  
  public static void main(String[] args) {
    int l;
    int r;

    Scanner reader = new Scanner(System.in);
    System.out.print("Digite o lado do cubo (em cm): ");
    l = reader.nextInt();
    int volume = calculaVolume(l);
    System.out.print("Volume do cubo = "+volume);
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}