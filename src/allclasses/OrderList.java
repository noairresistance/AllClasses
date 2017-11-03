/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allclasses;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Jesus
 */
public class OrderList implements Serializable
{
    private ArrayList<RestaurantItem> Order = null;
    private ArrayList<Food> Drinks = null;
    private int TableNum;
    
    public OrderList()
    {
        Order = new ArrayList();
        Drinks = new ArrayList();
    }
    
    public int GetOrderSize()
    {
        return this.Order.size();
    }
    public int GetDrinkList()
    {
        return this.Drinks.size();
    }
    
    public void AddToOrder(RestaurantItem newItem)
    {
        Order.add(newItem);
    }
    
    public void AddDrink(Food newDrink)
    {
        Drinks.add(newDrink);
    }
    
    public RestaurantItem GetItem(int i)
    {
        return Order.get(i);
    }
    
    public Food GetDrink(int i)
    {
        return Drinks.get(i);
    }
    public void SetTableNum(int i)
    {
        this.TableNum = i;
    }
    public int GetTableNum()
    {
        return this.TableNum;
    }
}
