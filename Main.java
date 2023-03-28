class Main {
  public static void main(String[] args) {
    for (int i = 1; i<= 10; i++){
      for (int j = 1; j<=10; j++){
        int a = i * j;
        if (a < 10)
          System.out.println(" " + i * j);
        else
          System.out.println(i * j);
        System.out.println(" ");
      }
      System.out.println("");
    }
  }
}