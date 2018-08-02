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


//以下为改良版
//添加抽象方法
//インタフェースは抽象クラスと同様に処理の中身がなくメソッド名や引数だけを定義する
interface InterfaceA
{
  public String faceA = "faceA";
  abstract void ShowA();
}

interface InterfaceB extends InterfaceA
{
  public String faceB = "faceB";
  abstract void ShowB();
}

interface InterfaceC extends InterfaceB
{
  public String faceC = "faceC";
  abstract void ShowC();
}

class MyCode5 implements InterfaceC
{
  public void ShowA(){
    System.out.println(faceA);
  }
  public void ShowB(){
    System.out.println(faceB);
  }
  public void ShowC(){
    System.out.println(faceC);
  }

  public static void main(String[] args){
  //インスタンス
    MyCode5 my = new MyCode5();
    my.ShowA();
    my.ShowB();
    my.ShowC();
    }
}
