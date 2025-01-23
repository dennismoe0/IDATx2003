package no.ntnu.idatx2003.oving2.commands.capitalize;

import no.ntnu.idatx2003.oving2.commands.base.TextCommand;

public class CapitalizeTextCommand implements TextCommand {

  @Override
  public String execute(String text) {
    if (text == null || text.isEmpty()) {
      return text;
    }

    String trimmedText = text.trim();
    if (trimmedText.isEmpty()) {
      return text; // IF the first part is just whitespace it doesnt do anything.
    }

    char firstCharacter = trimmedText.charAt(0); // First character

    if (!Character.isLetter(firstCharacter)) {
      return text;
    }

    String[] words = text.split("\\s+"); // Splits by any whitespace type
    StringBuilder capitalizedText 
  }

}
