class Chick implements Animal 
{     
     private String myType;     
     private String mySound;  
     private String othermySound;
     public Chick(String type, String sound1, String sound2)     
     {         
         myType = type;         
         mySound = sound1;
         othermySound = sound2;
     }        
     public String getSound()
     {
       if(Math.random() > .5)
       {
         return mySound;
       }
       else
       {
         return othermySound;
       }
     }     
     public String getType()
     {
     return myType;
     } 
}