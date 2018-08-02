interface InterfaceA
{
  public String faceA = "faceA";
}

interface InterfaceB extends InterfaceA
{
  public String faceB = "faceB";
}

interface InterfaceC extends InterfaceB
{
  public String faceC = "faceC";
}

class MyCode5 implements InterfaceC
{
  public static void main(String[] args){
  System.out.print(faceC);
  System.out.print(faceB);
  System.out.print(faceA);
    }
}
