package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare
{
  public static void main(String[] args)
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#8
    //  Do the following 4 times --#9
    //      drawSquare (recipe below) --#7
    //      ------------- Recipe for drawSquare --#6
    for (int i = 1; i <= 4; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    //      Repeat
    //      ------------- End of drawSquare recipe --#6
    //      Turn the tortoise 90 degrees to the right --#10
    //  Repeat
  }
}
