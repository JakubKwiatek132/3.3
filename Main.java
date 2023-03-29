import java.util.Random;

class Main {
  public static void main(String[] args) {

  int[][] array = new int [10][10];
    Random rand = new Random();
    
    for(int i = 0; i<10; i++){
      for(int j =0; j<10; j++){
      array[i][j] = rand.nextInt(101) -50;
      System.out.print(array[i][j]+ "\t");
    }
    System.out.println();
    }
  }
}