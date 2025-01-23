package no.ntnu.idatx2003.oving2.commands.wrap;

import no.ntnu.idatx2003.oving2.commands.base.TextCommand;

/**
 * A command that wraps text with a specified prefix and suffix.
 */
public class WrapTextCommand implements TextCommand {
  private final String preString;
  private final String postString;

  /**
   * Constructs a new WrapTextCommand with the specified prefix and suffix.
   *
   * @param preString  the prefix string to wrap the text with
   * @param postString the suffix string to wrap the text with
   */
  public WrapTextCommand(String preString, String postString) {
    this.preString = preString;
    this.postString = postString;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null;
    }
    if (preString == null && postString == null) {
      return text;
    }
    return preString + text + postString;
  }

  public String getPreString() {
    return preString;
  }

  public String getPostString() {
    return postString;
  }
}
