/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
    /*---------- methods ----------*/
  //added for step 15
  @Override
  public String say()
  {
    return "You now have a boot!";
  }

  @Override
  public boolean wasCaught(Hook h)
  {
    return true;
  }
}
