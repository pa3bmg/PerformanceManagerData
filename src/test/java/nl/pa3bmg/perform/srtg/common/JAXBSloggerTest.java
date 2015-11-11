/**
 *
 */
package nl.pa3bmg.perform.srtg.common;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * @author Sam van Sabben
 *
 */
public class JAXBSloggerTest {

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.JAXBSlogger#readLoggerXML()}.
   */
  @Test
  public final void testTestReadLoggerXML() {

    JAXBSlogger jaxbSlogger = new JAXBSlogger();
    assertNotNull("An object must be returned.", jaxbSlogger.readLoggerXML());
  }
}
