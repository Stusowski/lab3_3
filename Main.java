import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random liczba = new Random();
    int[][] znak = new int[10][10];
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        znak[i][j]=liczba.nextInt(50+50)-50;
        System.out.print(znak[i][j]+" ");
      }
      System.out.println("\n");
    }
  }
}