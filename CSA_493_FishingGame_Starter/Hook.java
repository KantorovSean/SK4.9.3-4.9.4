/**
 * Activity 4.9.3
 */

public class Hook extends LakeObject
{
  private int strength = 45;

  //added in step 2 of 4.9.4
  public Hook()
  {
    super();
    strength = 55;
    //added in step 10
    super.setCost(15);
    //added in step 4 of 4.9.4
    //System.out.println("Hook: " + getCost() + ":" + getWeight()); Commneted out in step 5 of 4.9.5
  }

  /*---------- accessors ----------*/
  public int getStrength() 
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }


  /*---------- methods ----------*/
  //added for step 12 of 4.9.3
  @Override
  public String say()
  {
    return "You now have a hook!";
  }
}