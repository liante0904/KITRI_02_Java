public class WhileTwoLoop {
  public static void main(String[] args) {
    int dan = 1; //1단 (앞)
    while (dan <=9 ) {
    int col = 1; // *1~*9

    while ( col <= 9) { // *1~*9(뒤)
      System.out.print(dan*col);
      System.out.print('\t');
      col++;
    }
    System.out.println();
    dan++;
  }
  }
}
