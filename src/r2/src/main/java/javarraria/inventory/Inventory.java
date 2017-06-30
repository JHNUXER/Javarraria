package javarraria.inventory;

public class Inventory {
  private String name = "";
  private ItemStack[] slots;
  
  public Inventory(String name,int slotsN) {
    this.name = name;
    this.slots = new ItemStack[slotsN];
  }
  
  public boolean isEmpty(int slot) {
    return slots[slot] == null;
  }
  public int getCount(int slot) {
    if (slots[slot].isEmpty()) return 0;
    return slots[slot].getCount();
  }
  public void swap(int slot1,int slot2) {
    ItemStack s1 = new ItemStack(slots[slot1]);
    slots[slot1] = new ItemStack(slots[slot2]);
    slots[slot2] = s1;
    s1 = null;
  }
}
