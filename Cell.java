public class Cell {
  private int x;
  private int y;
  private int w;
  private int count;

  public Cell(int x, int y, int w) {
    this.x = x;
    this.y = y;
    this.w = w;
    this.count = 0;
  }

  public void show() {
    rect(this.x*w, this.y*w, w, w);
    fill(155, 155, 0); //Yellow
  }
}
