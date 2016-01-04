/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst315groupthink;

/**
 *
 * @author Mike
 */
public interface Observer {
    
    public abstract void update(Note n,Student s);//Update to a specific Student
    public abstract void update(Note n);//Update to all Students
}
