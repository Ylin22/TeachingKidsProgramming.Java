package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

import com.spun.util.NumberUtils;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    // lower y coordinate by 100
    turtle.setY(turtle.getY() + 10);
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int length = 70;
    drawBranch(turtle, length);
  }
  private static void drawBranch(Turtle turtle, int length)
  {
    if (0 < length)
    {
      adjustColor(turtle, length);
      turtle.move(length);
      drawLowerBranches(turtle, length);
    }
  }
  private static void adjustColor(Turtle turtle, int length)
  {
    if (length == 10)
    {
      turtle.setPenWidth(1);
      turtle.setPenColor(Colors.Greens.Lime);
    }
    else if (length <= 20)
    {
      turtle.setPenWidth(2);
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    else if (length <= 30)
    {
      turtle.setPenWidth(4);
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    else if (length <= 40)
    {
      turtle.setPenWidth(6);
      turtle.setPenColor(Colors.Greens.Olive);
    }
    else if (length <= 50)
    {
      turtle.setPenWidth(8);
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    else if (length <= 60)
    {
      turtle.setPenWidth(10);
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
    else if (length <= 70)
    {
      turtle.setPenWidth(12);
      turtle.setPenColor(Colors.Browns.BlanchedAlmond);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int length)
  {
    int rightAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(rightAngle);
    drawShorterBranch(turtle, length);
    int leftAngle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(leftAngle - rightAngle);
    drawShorterBranch(turtle, length);
    turtle.turn(-leftAngle);
    adjustColor(turtle, length);
    turtle.move(-length);
  }
  private static void drawShorterBranch(Turtle turtle, int length)
  {
    int difference = NumberUtils.getRandomInt(5, 15);
    drawBranch(turtle, length - difference);
  }
}