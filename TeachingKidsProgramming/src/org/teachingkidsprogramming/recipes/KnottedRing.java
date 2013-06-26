package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class KnottedRing
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 1; i <= 30; i++)
    {
      Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
      drawOctagonWithOverlap();
      int degreesToTheRight = 360 / 30;
      Tortoise.turn(degreesToTheRight);
      Tortoise.turn(5 + degreesToTheRight);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Colors.Pinks.HotPink);
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Pinks.Fuchsia);
    ColorWheel.addColor(Colors.Reds.OrangeRed);
    ColorWheel.addColor(Colors.Pinks.DeepPink);
    ColorWheel.addColor(Colors.Reds.MediumVioletRed);
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Reds.Tomato);
  }
  private static void drawOctagonWithOverlap()
  {
    for (int i = 1; i <= 8 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 8);
    }
  }
}
