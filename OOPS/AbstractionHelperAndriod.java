package OOPS;

public abstract class AbstractionHelperAndriod {
     // an abstract class contains abstract and non abstract methods
     // You can't create objects using abstract class
     //Abstract methods do not have implemenation in the abstract class. You have to implement them when you extend it with Concrete Class

     public abstract void buttons();

     public abstract void screenShot();
     public abstract void Animations();

     public void playStore(){
          System.out.println("Get all Basic Apps");
     }

}

class RedmiUI extends AbstractionHelperAndriod{
     
     @Override
     public void buttons(){
          System.out.println("All icons in MI UI Will be of 25*25 Pixels each");
     }

     @Override
     public void screenShot(){
          System.out.println("Three finger slide down");
     }

     @Override
     public void Animations(){
          System.out.println("0.5 Transitions");
     }

     public void playStore(){
          System.out.println("Redmi Apps");
     }
}

class OxygenUI extends AbstractionHelperAndriod{
     
     @Override
     public void buttons(){
          System.out.println("All icons in MI UI Will be of 20*20 Pixels each");
     }

     @Override
     public void screenShot(){
          System.out.println("pinch");
     }

     @Override
     public void Animations(){
          System.out.println("0.75 Transitions");
     }

}

class Main1{
     public static void main(String[] args) {
          AbstractionHelperAndriod redmiUi = new RedmiUI();
          redmiUi.buttons();
          redmiUi.screenShot();
          redmiUi.Animations();
          redmiUi.playStore();

          AbstractionHelperAndriod oxygen = new OxygenUI();

          oxygen.buttons();
          oxygen.screenShot();
          oxygen.Animations();
          oxygen.playStore();
     }

     
     
}
