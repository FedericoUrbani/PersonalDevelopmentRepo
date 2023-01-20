package it.develhope.classes;

public class Tester {
    public static void main(String[] args) {

      SmartphonePrice retail= new SmartphonePrice("Euros","99");
      SmartphonePrice retail2= new SmartphonePrice("Dollars","130");
      SmartphonePrice Producer= new SmartphonePrice("Yen","20000");
      SmartphonePrice Producer2= new SmartphonePrice("Lira","2");

      Smartphone cell1=new Smartphone("nokia","nokia 1100",200,Producer,retail);
      Smartphone cell2=new Smartphone("iphone","10",200,Producer2,retail2);

      System.out.println(cell1.toString());
      System.out.println(cell2.toString());

      System.out.println("the cellphones are equal? "+cell1.equals(cell2));
      Smartphone cell3= new Smartphone();
      try {
          cell3 = cell2.clone();
          System.out.println(cell3);
      }catch(Exception exe){
          exe.printStackTrace();
      }
        System.out.println("the cellphones are equal? "+cell2.equals(cell3));
    }
}