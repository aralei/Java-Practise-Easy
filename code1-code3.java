class MyCode1 {
  public static void main (String[] args) {
    System.out.println(args);
  }
}


class MyCode2 {
  public static void main (String[] args) {
    System.out.println("128 * 28 :" + (128 * 28)); //donot forget () for calculate
    System.out.println("52 | 25 :" + (54 | 32));
    System.out.println("27 ^ 23:" + (27 ^ 23));
  }
}

import java.io.*;

class MyCode3 {
    String Country;
    String Identity;
    String City;
    String Block;
    String Postcode;
    
    public void setCountry(String country){
      Country = country;
    }
    public void setIdentity(String identity){
      Identity = identity;
    }
    public void setCity(String city){
      City = city;
    }
    public void setBlock(String block){
      Block = block;
    }
    public void setPostcode(String postcode){
      Postcode = postcode;
    }
  
    public String getCountry() {
        return Country;
    }
    public String getIdentity() {
        return Identity;
    }
    public String getCity() {
        return City;
    }
    public String getBlock() {
        return Block;
    }
    public String getPostcode() {
        return Postcode;
    }
  
  public static void main (String[] args) {
    MyCode3 address = new MyCode3();
    address.setCountry("Laos");
    address.setIdentity("Worker");
    address.setCity("LLL");
    address.setBlock("lao stress");
    address.setPostcode("020125");
    
    System.out.println(address.getCountry() + 
                       address.getIdentity() + 
                       address.getCity() + 
                       address.getBlock() + 
                       address.getPostcode());   
  }
}
