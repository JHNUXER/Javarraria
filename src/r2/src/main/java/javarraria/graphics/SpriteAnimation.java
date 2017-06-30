package javarraria.graphics;

import java.awt.image.BufferedImage;

public class SpriteAnimation extends ArrayList<BufferedImage> {
  public enum RepeatType {
    STOP,LOOP,REVERSE;
  }

  private RepeatType repeatType;
  private int index = 0;
  private int incr = 1;

  public void tick() {
    index+=incr;
    if (index >= size()) {
      if (repeatType == RepeatType.STOP) index = size()-1;
      else if (repeatType == RepeatType.LOOP) index -= size();
      else if (repeatType == RepeatType.REVERSE) {index = size()-2;incr=-incr;}
    }
  }
  
  public BufferedImage draw() {
    return get(index);
  }
}
