class NamedCow extends Cow
{
  private String myName;
  public NamedCow(String type, String sound, String name)     
  {         
    myName = name;
    myType = type;
    mySound = sound;
  } 
  public String getName()
  {
    return myName;
  }  
}