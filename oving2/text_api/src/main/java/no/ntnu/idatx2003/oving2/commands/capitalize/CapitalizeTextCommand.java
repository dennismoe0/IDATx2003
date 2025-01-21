package no.ntnu.idatx2003.oving2.commands.capitalize;

import no.ntnu.idatx2003.oving2.commands.base.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    if (text == null) {
      return null; // Handle null input gracefully
    }
    return "PLACEHOLDER: Command not implemented yet. Input: " + text;
  }

}
