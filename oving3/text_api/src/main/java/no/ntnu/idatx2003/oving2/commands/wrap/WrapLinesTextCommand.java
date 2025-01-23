package no.ntnu.idatx2003.oving2.commands.wrap;

/**
 * A command that wraps each line of text with a specified prefix and suffix.
 */
public class WrapLinesTextCommand extends WrapTextCommand {

  /**
   * Constructs a new WrapLinesTextCommand with the specified prefix and suffix.
   *
   * @param preString  the prefix string to wrap each line with
   * @param postString the suffix string to wrap each line with
   */
  public WrapLinesTextCommand(String preString, String postString) {
    super(preString, postString);
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    if (getPreString() == null && getPostString() == null) {
      return text;
    }

    String[] lines = text.split("\n"); // Splits up parts by line break.
    StringBuilder wrappedText = new StringBuilder();
    for (String line : lines) { // Iterates through all the lines in the array
      wrappedText.append(getPreString()).append(line).append(getPostString()).append("\n");
    }
    return wrappedText.toString().trim();
  }

}