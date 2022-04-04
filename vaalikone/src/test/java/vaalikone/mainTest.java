package vaalikone;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class mainTest {

  @Test
  public void test() throws IOException {
    MockHttpServletResponse response = new MockHttpServletResponse();
    new main().doGet(null, response);
    Assert.assertEquals("text/plain", response.getContentType());
    Assert.assertEquals("UTF-8", response.getCharacterEncoding());
    Assert.assertEquals("Hello App Engine!\r\n", response.getWriterContent().toString());
  }
}
