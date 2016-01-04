
package cst315groupthink;
public interface Subject 
{
    public void regObserver(Observer obs,String name);
    public void delObserver(Observer obs);
    public void notifyObserver(Note n,Student s);//Sends a Note to a specific Student
    public void notifyObserver(Note n);//Sends a Note to ALL students
}
