package org.teachingkidsprogramming.recipes.finalexam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellThree
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("Please set the size of the shell.");
    if (shell < 350)
    {
      int updatedShell = MessageBox
          .askForNumericalInput("The shell is too small to be seen. Please enter an updated size of the shell.");
      for (int i = 1; i <= updatedShell; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = updatedShell / 150;
        length = 100;
        if (largeLength < 0)
        {
          length = length + 5;
        }
        else
        {
          drawTriangle();
        }
        int numberOfRotations = 7;
        Tortoise.turn(360 * numberOfRotations / shell);
      }
    }
    else
    {
      for (int i = 1; i <= shell; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shell / 150;
        length = 100;
        if (largeLength < 0)
        {
          length = length + 5;
        }
        else
        {
          drawTriangle();
        }
        int numberOfRotations = 7;
        Tortoise.turn(360 * numberOfRotations / shell);
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2.75; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.5);
    }
  }
}
