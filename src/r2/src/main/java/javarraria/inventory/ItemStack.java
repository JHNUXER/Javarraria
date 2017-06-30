package javarraria.inventory;

import javarraria.item.*;

public class ItemStack {
  private Item item;
  private int count;
  
  public Item getItem() {
    return item;
  }
  public int getCount() {
    return count;
  }
}
