/*
 * Activity 4.9.3
 */
public class Bait extends LakeObject
{
    //added in step 11 4.9.4
    public Bait()
    {
        super();
        super.setCost(10);
    }
    // added in step 15 of 4.9.3
    @Override
    public String say()
    {
        return "You now have a bait!";
    }
}