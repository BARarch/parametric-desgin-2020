import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class complex_pattern extends PApplet {
  public void setup() {

fill(255); 
rect(10, 10, 100, 800);
rect(20, 20, 100, 700);
rect(30, 30, 700, 600);
fill(0);
rect(40, 40, 100, 500);
fill(200); 
rect(100, 100, 50, 50);
rect(200, 200, 50, 50);
rect(300, 300, 50, 50);
fill(0);
rect(400, 400, 50, 50);
fill(235); 
rect(100, 100, 100, 300);
rect(200, 200, 300, 400);
rect(300, 300, 100, 500);
fill(0);
rect(400, 400, 100, 600);
fill(300); 
rect(150, 150, 100, 100);
rect(250, 250, 100, 100);
rect(350, 350, 100, 100);
fill(0);
rect(450, 450, 100, 100);
fill(255); 
rect(400, 400, 100, 150);
rect(500, 500, 100, 150);
rect(600, 600, 100, 150);
fill(0);
rect(700, 700, 100, 100);
fill(255); 
rect(415, 415, 100, 200);
rect(515, 515, 100, 300);
rect(615, 615, 100, 400);
fill(0);
rect(715, 715, 100, 500);
    noLoop();
  }

  public void settings() { size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "complex_pattern" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
