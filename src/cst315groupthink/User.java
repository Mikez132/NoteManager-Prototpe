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
public abstract class User {
    
     private String Username;
     private String passWord;
     
     public abstract void VerifyLogin();
     public abstract void VerifyUser();
    
}
