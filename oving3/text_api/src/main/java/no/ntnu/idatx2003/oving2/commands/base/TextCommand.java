package no.ntnu.idatx2003.oving2.commands.base;

/**
 * Basic interface for a text manipulation API for class in IDATX2003.
 * Both the input and the output is required to be a string.
 *
 * @author Dennis Moe
 */
public interface TextCommand {

  /**
   * Executes a text manipulation command.
   *
   * @param text the input text to be manipulated
   * @return the manipulated text
   */
  String execute(String text);
}
