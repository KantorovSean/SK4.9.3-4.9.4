/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    /*---------- methods ----------*/
  //added for step 15 of 4.9.3
  @Override
  public String say()
  {
    return "You now have a fish!";
  }

  //added for step 9 of 4.9.4
  @Override
  public int getCost()
  {
    super.setCost(2);
    return super.getCost() * super.getWeight();
  }
}