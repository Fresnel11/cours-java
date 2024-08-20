public class Main {
  public static void main(String[] args) {
    // Exercice 1 : Affichage de nombres pairs
    int l = 0 ;
    for (int i = 0; i <= 20; i = i + 2){
    System.out.println(i);
    }

    // Exercice 2 : Somme des entiers avec while
    int b = 1; int sum = 0;
    while( b < 10){
      b++;
      sum += b;
    }
    System.out.println("La somme est: " + sum);

    // Exercice 3 : Inverser un nombre avec do-while

    // int g = 12345;
    // do {
    //    System.out.println(g);
    //       g--;
    //     }
    //     while (g > -12345);

  // Exercice 4 : Trouver le maximum d'une série d'entiers

    int numbers[] = {20, 26, 87, 70, 250};
    int length = numbers.length;
    int upperNumbers = numbers[0];
    for (int number : numbers) {
      if (upperNumbers < number){
        upperNumbers = number;
      }
    }
    System.out.println("Le maximum de la série est: " + upperNumbers);

    // Exercice 5 : Compter les chiffres pairs dans un nombre
    // int k = 123456;
    // while(k){

    // }
  }  
}