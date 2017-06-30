package javarraria.world;

public class World {
  public String name;
  public TileFrame[][] frames;
  
  public World(String name,int scale) {
    this.name = name;
    int width = 0;
    int height = 0;
    switch(scale) {
      case 0:width=4200;height=1200;break;
      case 1:width=6400;height=1800;break;
      default:width=8400;height=2400;break;
    }
    frames = new TileFrame[height][width];
    for (int x = 0; x < width; x++) {
      for (int y = 0; y < height; y++) {
        frames[y][x] = new TileFrame(x,y);
      }
    }
  }
  
  public TileFrame getTileFrame(int x,int y) {
    return frames[y][x];
  }
  public TileFrame getTileFrame(Position position) {
    Position tPos = position.convertTo('t');
    return getTileFrame(tPos.x,tPos.y);
  }
  public Tile getTile(int x,int y) {
    return frames[y][x].getTile();
  }
  public Tile getTile(Position position) {
    Position tPos = position.convertTo('t');
    return getTile(tPos.x,tPos.y);
  }
  public World setTile(int x,int y,Tile tile) {
    getTileFrame(x,y).setTile(tile);
  }
  public World setTile(Position position,Tile tile) {
    Position tPos = position.convertTo('t');
    return setTile(tPos.x,tPos.y,tile);
  }
  
  public void tick() {
    for (int x = 0; x < frames[0].length; x++) {
      for (int y = 0; y < frames[1].length; y++) {
        getTileFrame(x,y).tick();
      }
    }
  }
}
