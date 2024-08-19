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
    
}

    
}

