package onmyown;

import java.util.Random;

public class OmOEventRoller{

   private final int MIN = 0;
   private final int MAX = 100;
   private Random rng = new Random();
   public OmOEventRoller(){
      //default constructor
   }
   
   public int rngNumber(){
      return rng.nextInt(MAX);
      //you may want to use or build the stat class in event roller
   }
   
   //create methods that use rngNumber / stats
   public void eatFood(){}
   public void goToWork(){}
   public void dumpsterDiving(){}
   public void sellJunk(){}
   public void goOut(){}
   public void party(){}   
}