import java.awt.Graphics;

public abstract class Figuur {

    int x1, y1, x2, y2;

    public abstract void draw(Graphics g);
}

    class Rechthoek extends Figuur {

    @Override
        public void draw(Graphics g) {
        g.drawRect(x1, y1, x2-x1, y2-y1);
        }
    }

    class Ovaal extends Figuur {

    public void draw(Graphics g) {
        g.drawOval(x1, y1, x2-x1, y2-y1);
        }
    }

    class Lijn extends Figuur {

    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2-x1, y2-y1);
    }
}
