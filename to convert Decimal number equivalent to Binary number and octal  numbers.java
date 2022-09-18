public class DecimalToBinary
{
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    int num = 14, tmp;
    tmp = num;
    //int numberSystem = 2;
    String binary = "";
    while(num >= 2)
    {
      binary = num%2 + binary ;
      num = num /2;
    }
    binary = num + binary ;
    System.out.println("Binary of " + tmp + " is " + binary);
    while(num >= 8)
    {
      octal = num%8 + octal;
      num = num /8;
    }
    octal = num + octal ;
    System.out.println("Octal of " + tmp + " is " + octal);
  }
}
