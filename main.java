public class Main {
  public static void main(String[] args) {
    byte a = 15;
    short b = 12;
    int c = 122;
    long d = 15000000000L;
    float e = 15.2f;
    double f = 14.22d;
    char g = 'G';
    boolean h = true;
    System.out.println("Taille de int: " + Integer.BYTES + " octets");
    System.out.println("Taille de long: " + Long.BYTES + " octets");
    System.out.println("Taille de short: " + Short.BYTES + " octets");
    System.out.println("Taille de float: " + Float.BYTES + " octets");
    System.out.println("Taille de byte: " + Byte.BYTES + " octets");
    System.out.println("Taille de double: " + Double.BYTES + " octets");
    System.out.println("Taille de char: " + Character.BYTES + " octets");

    //EXERCICE 2 Concaténation et comparaison de chaînes de caractères
    String str1 = "Hello";
    String str2 = "World";
    String str3 = str1 +' '+ str2;
    String str6 = str1.concat(str2);
    boolean str4 = str1 == str2;
    boolean str5 = str1.equals(str2);
    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
    System.out.println(str4);
    System.out.println(str5);
    System.out.println(str6);

    // EXERCICE 3 Opérateurs logiques et d'affectation
    int x = 45;
    int y = x + 2;
    int z = y * 2;
    if (x > y && y < z){
      System.out.println("La condition est vraie");
    }else{
      System.out.println("La condition est Fausse");
    }

    // EXERCICE 4 Conversion de types (Widening et Narrowing)
    int intVar = 45;
    System.out.println(intVar);
    double doubleVar = intVar;
    System.out.println(doubleVar);
    short shortVar = (short) doubleVar;
    System.out.println(shortVar);
    
    // EXERCICE 5 Comparaison de valeurs et opérations combinées
    int i = 50;
    float j = 22.35f;
    float k = (float) i;
    boolean n = k > j;
    System.out.println(k);
    System.out.println(n);

    String langue = "USA";
    switch (langue) {
      case "Fr":
      System.out.println("France");
      break;
      case "US":
      System.out.println("USA");
      break;
      default:
      System.out.println("Bénin");
      break;
    }
    boolean t = true;
    String test = (t)? "valeur vraie" : "valeur fausse";
    System.out.println(test);


    // EXERCICE STRUCTURE DE CONTROLE
    //  Exercice 1 : Vérification d'un nombre pair ou impair
     int num = 40;
     String text = (num % 2 == 0)? "Le nombre X est pair" : "Le nombre X est impair";
     System.out.println(text);


    // Exercice 2
    int aa = 3;
    int jj = 5;
    int u = 9;
    if (aa < jj && aa < u){
      System.out.println("Le plus grand nombre est: " + u);
    }else if (jj < u && jj < a){
    System.out.println("Le plus grand nombre est: " + u);
    }

    //EXERCICE 3
  int age = -12;
    if (age >= 0 && age < 12 ){
      System.out.println("Enfant");
    }else if (age >= 13 && age <19){
      System.out.println("Adolescent");
    }else if (age >= 20 && age < 64){
      System.out.println("Adulte");
    }else if (age > 65 ) {
      System.out.println("Sénior");
    }else{
      System.out.println("Cette personne n'existe pas");
    }

    int note = 5;
    String tht = (note > 50)? "Reussir" : "Echoué";
    System.out.println(tht);

    int achat = 500;
    if (achat < 100){
      System.out.println("Pas de remise");
    }else if(achat >= 100 && achat < 500){
      int remise = achat - (achat * 10) /100;
      System.out.println("Vous avez 10% de remise = " + remise );
    }else if(achat >= 500){
      int remise = achat - (achat * 20) /100;
      System.out.println("Vous avez 20% de remise = " + remise);
    }

}




  
    
}

