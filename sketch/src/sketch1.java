import processing.core.PApplet;

public class sketch1 extends PApplet{
    public void setup() {
        size(100,100);
        stroke(128);
        rect(width/2,height/2,10,20);
    }

    static public void main(String args[]) {
        PApplet.main(new String[] {"sketch1"});
    }
}
