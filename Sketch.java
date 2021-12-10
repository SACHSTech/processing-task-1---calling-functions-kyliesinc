import java.awt.geom.Arc2D;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(80, 179, 250);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  // draw stem for the flower
	  stroke(100);
	  fill(21, 250, 0);
	  rect(304, 300, 5, 300);
	  
	  
	  
	  // draw flower with circles:
	  //first petal - purple
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(210, 300, 100, 100);
	  
	  // second petal - red
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(260, 370, 100, 100);
	  
	  // third petal - white
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(350, 370, 100, 100);
	  
	  // forth petal - black
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(390, 300, 100, 100);
	  
	  // fifth petal - green
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(350, 230, 100, 100);
	 
	  // sixth petal - orange
	  stroke(100);
	  fill(255, 255, 255);
	  ellipse(260, 230, 100, 100);
	  
	  // flower center - yellow
	  stroke(100);
	  fill(255, 241, 51);
	  ellipse(301, 301, 93, 93);
	  
	  }	  
  }
  
  // define other methods down here.