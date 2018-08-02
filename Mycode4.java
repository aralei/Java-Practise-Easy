public class MyCode4 {
  String dogName;
  String dogColor;
  String dogAge;
  
  //コンストラクタ
  public MyCode4(String dogName, String dogColor, String dogAge){
    this.dogName = dogName;
    this.dogColor = dogColor;
    this.dogAge = dogAge;
  }
  
  //output info of dog
  void Dog()
  {
    System.out.println(dogName + dogColor + dogAge);
  }
  
  //program
  public static void main(String[] args){
    //build instance
    MyCode4 dogclass = new MyCode4("bobo","blue","32");
    dogclass.Dog();
  }     
}
