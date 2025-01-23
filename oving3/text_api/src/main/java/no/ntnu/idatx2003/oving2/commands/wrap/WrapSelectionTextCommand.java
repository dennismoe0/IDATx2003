package no.ntnu.idatx2003.oving2.commands.wrap;

/**
 * A command that wraps a selected portion of text with a pre- and post-string.
 */
public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;

  /**
   * Constructs a WrapSelectionTextCommand with the specified pre-string,
   * post-string, and selection.
   *
   * @param preString  the string to prepend to the selection
   * @param postString the string to append to the selection
   * @param selection  the text selection to be wrapped
   */
  public WrapSelectionTextCommand(String preString, String postString, String selection) {
    super(preString, postString);
    this.selection = selection;
  }

  public String getSelection() {
    return selection;
  }

  @Override
  public String execute(String text) {
    if (text == null || selection == null) {
      return null;
    }

    if (getPreString() == null && getPostString() == null) {
      return text;
    }
    // Replaces the selection in text with selection + pre- & postString.
    return text.replace(selection, getPreString() + selection + getPostString());
  }
}
