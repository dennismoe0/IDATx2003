package no.ntnu.idatx2003.oving2.commands.replace;

import no.ntnu.idatx2003.oving2.commands.base.TextCommand;

/**
 * A command that replaces occurrences of a target string with a replacement
 * string in a given text.
 */
public class ReplaceTextCommand implements TextCommand {
  private final String target;
  private final String replacement;

  /**
   * Constructor to initialize the target and replacement strings.
   *
   * @param target      The string of text to be replaced.
   * @param replacement The string of text to replace the target with.
   */
  public ReplaceTextCommand(String target, String replacement) {
    this.target = target;
    this.replacement = replacement;
  }

  @Override
  public String execute(String text) {
    if (text == null) {
      return null; // Handles empty inputs
    }
    return text.replace(target, replacement);
  }

  public String getTarget() {
    return target;
  }

  public String getReplacement() {
    return replacement;
  }
}
