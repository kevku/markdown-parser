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
	    assertEquals("https://something.com", links.get(0));
        assertEquals("some-thing.html", links.get(1));
    }
    @Test
    public void checkMyLinkTest2() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\my-test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://www.google.com/");
        expected.add("https://canvas.ucsd.edu/");
        expected.add("https://cdn.thenewstack.io/media/2021/10/4f0ac3e0-visual_studio_code.png");
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest2() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://something.com");
        expected.add("some-page.html");
	    assertEquals(expected, links);
        // Added Comment
    }

    @Test
    public void checkLinkTest3() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest4() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest5() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page.com");
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest6() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("page.com");
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest7() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
	    assertEquals(expected, links);
    }

    @Test
    public void checkLinkTest8() throws IOException, NoSuchFileException{
        Path fileName = Path.of("C:\\Users\\kevin\\Documents\\GitHub\\markdown-parser\\test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a link on the first line");
	    assertEquals(expected, links);
    }
}