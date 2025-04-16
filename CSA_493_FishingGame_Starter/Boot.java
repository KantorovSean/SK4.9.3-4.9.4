/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{
  //added in step 11 4.9.4
  public Boot()
  {
    super();
    super.setCost(0);
  }
    /*---------- methods ----------*/
  //added for step 15 of 4.9.3
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
