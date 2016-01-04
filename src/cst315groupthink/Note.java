
package cst315groupthink;
import java.util.ArrayList;
public class Note
{
   private String NoteName;
   private StringBuilder content;
   private final static String NOTECONTENT = "Example Test Conentent in Note";
    
    
    public Note(String name,String NoteContent){
        
       content = new StringBuilder(NoteContent);
       NoteName = name;
       
        
        
    }
    public Note(String name){
        
       content = new StringBuilder(NOTECONTENT);
        NoteName = name;
        
        
    }
    
    
    public void EditNote(String s){
        
        content.append(s);
        
        
    }
    
  

   @Override
    public String toString(){
        return content.toString();    
    }
    
   

}
