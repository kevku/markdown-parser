// Imports the right packages for JUnit to run in the program
import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
    // Signifies this is a test case
    @Test
    public void addition() {
        // Ensures that the actual output is same as expected
        assertEquals(2, 1 + 1);
    }

    @Test
    public void linkCheck() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        System.out.print(links.get(0));
	    assertEquals("https://something.com", links.get(0));
        assertEquals("some-thing.html", links.get(1));
    }
}