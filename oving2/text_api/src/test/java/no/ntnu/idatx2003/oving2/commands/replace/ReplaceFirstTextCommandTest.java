package no.ntnu.idatx2003.oving2.commands.replace;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ReplaceFirstTextCommand class.
 */
public class ReplaceFirstTextCommandTest {

  @Test
  public void testExecute() {
    // Arrange: Create a ReplaceFirstTextCommand with "target" to be replaced with
    // "replacement"
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
    String inputText = "text with target and target";

    // Act: Execute the command
    String result = command.execute(inputText);

    // Assert: Verify that only the first occurrence is replaced
    assertEquals("text with replacement and target", result);
  }

  @Test
  public void testExecuteWithNoMatch() {
    // Arrange: Create a ReplaceFirstTextCommand with a target that doesn't exist in
    // the text
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("notfound", "replacement");
    String inputText = "text with target and target";

    // Act: Execute the command
    String result = command.execute(inputText);

    // Assert: Verify that the text remains unchanged
    assertEquals("text with target and target", result);
  }

  @Test
  public void testExecuteWithNullText() {
    // Arrange: Create a ReplaceFirstTextCommand
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");

    // Act: Execute the command with null text
    String result = command.execute(null);

    // Assert: Verify that null is returned
    assertEquals(null, result);
  }

  @Test
  public void testExecuteWithSpecialCharacters() {
    // Arrange: Create a ReplaceFirstTextCommand for a special character target
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("$target$", "replacement");
    String inputText = "text with $target$ and $target$";

    // Act: Execute the command
    String result = command.execute(inputText);

    // Assert: Verify that only the first occurrence is replaced
    assertEquals("text with replacement and $target$", result);
  }

  @Test
  public void testGetters() {
    // Arrange: Create a ReplaceFirstTextCommand
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");

    // Assert: Verify the getter methods
    assertEquals("target", command.getTarget());
    assertEquals("replacement", command.getReplacement());
  }
}
