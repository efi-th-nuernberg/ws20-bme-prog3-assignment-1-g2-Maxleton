public class Zahlenfilter{
  public static void filter (int from, int to){
    for (int i =from; i<=to;i++){
       System.out.print(i + ": ");
      if(durchFuenfTeilbar(i)){
        System.out.print("ist durch 5 teilbar, ");
      }
      if(summeDurchDreiTeilbar(i,i-1)){
        System.out.print("Summe mit Vorherigen ist durch 3 teilbar, ");
      }
      if(endetAufNeun(i)){
        System.out.print("endet auf 9.");
      }
      System.out.println("");
    }
  }

  public static boolean durchFuenfTeilbar(int zahl){
    if(zahl % 5 == 0){
      return(true);
    }
    return(false);
  }

  public static boolean summeDurchDreiTeilbar(int sum1, int sum2){
    if((sum1 + sum2) % 3 == 0){
      return(true);
    }
    return(false);
  }
  
  public static boolean endetAufNeun(int zahl){
    if(zahl%10==9){
      return(true);
    }
    return(false);
  }
}