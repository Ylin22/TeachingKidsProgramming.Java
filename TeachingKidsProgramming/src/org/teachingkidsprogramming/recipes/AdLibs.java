package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    Words words = new Words();
    words.adverb = MessageBox.askForTextInput("Please enter an adverb");
    words.edVerb = MessageBox.askForTextInput("Please enter an -ed verb.");
    words.bodyPart = MessageBox.askForTextInput("Please state a body part");
    String story = Parser.parseRtfFile("view.rtf", words);
    Viewer.displayRtfFile(story);
  }
}