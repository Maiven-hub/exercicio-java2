import java.util.Random;
class registro {
  
public static int novo(){
  Random rand = new Random();
  int alea = rand.nextInt(1,1000);
  return alea; 
 }
  
}