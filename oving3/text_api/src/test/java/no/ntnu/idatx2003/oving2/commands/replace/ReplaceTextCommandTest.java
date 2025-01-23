package no.ntnu.idatx2003.oving2.commands.replace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceTextCommandTest {

  @Test
  public void testExecute() {
    // Arrange: Create a ReplaceTextCommand with "target" to be replaced with
    // "replacement"
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    String inputText = "text with target and target";

    // Act: Executes the command
    String result = command.execute(inputText);

    // Assert: Verify
    assertEquals("text with replacement and replacement", result);
  }

  @Test
  public void testGetters() {
    // Arrange:
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");

    // Assert: Verify
    assertEquals("target", command.getTarget());
    assertEquals("replacement", command.getReplacement());
  }
}
