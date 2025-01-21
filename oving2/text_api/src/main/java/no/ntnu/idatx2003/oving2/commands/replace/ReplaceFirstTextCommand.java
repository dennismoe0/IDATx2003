package no.ntnu.idatx2003.oving2.commands.replace;

import java.util.regex.Pattern; // For special characters

public class ReplaceFirstTextCommand extends ReplaceTextCommand {

  /**
   * Constructs a new ReplaceFirstTextCommand.
   *
   * @param target      the target string to be replaced
   * @param replacement the replacement string
   */
  public ReplaceFirstTextCommand(String target, String replacement) {
    super(target, replacement);
  }

  @Override
  public String execute(String text) {
    if (text == null || getTarget() == null || getReplacement() == null) {
      return text; // No change if a field is empty.
    }
    return text.replaceFirst(Pattern.quote(getTarget()), getReplacement());
  }
}
