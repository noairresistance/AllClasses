/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

import java.io.Serializable;

public class RestaurantItem implements Serializable{
    
    private String Name;
    private String Description;
    private Double Price;
    //private Image Picture; // imported java.awt.Image;
    private Boolean IsAvailable;
    
    //extending original class.
    public RestaurantItem(String Name, Double Price, Boolean IsAvailable)
    {
        /*  TODO:
        *   Needs the following variables:
        *   Image Picture
        */
        this.Name = Name;
        this.Description = null;
        this.Price = Price;
        //this.Picture = Picture;
        this.IsAvailable = IsAvailable;
    }
        
        /*  TODO:
        *   Needs the following methods:
        *   GetPicture()
        *   SetPicture()
        */
    
    /*=====Getters=====
    *
    */
    public String GetName()
    {
        return this.Name;
    }
    
    public String GetDescription()
    {
        return this.Description;
    }
    
    public Double GetPrice()
    {
        return this.Price;
    }
   /* 
    public Image GetPicture()
    {
        return this.Picture;
    }
    */
    
    public Boolean GetIsAvailable()
    {
        return this.IsAvailable;
    }
    
    /*=====Setters=====
    *
    */
    public void SetName(String Name)
    {
        this.Name = Name;
    }
    
    public void SetDescription(String Desc)
    {
        this.Description = Desc;
    }
    
    public void SetPrice(Double Price)
    {
        this.Price = Price;
    }
    
    /*
    public void SetPicture(Image Picture)
    {
        this.Picture = Picture;
    }
    */
    
    public void SetIsAvailable(Boolean IsAvailable)
    {
        this.IsAvailable = IsAvailable;
    }   
}