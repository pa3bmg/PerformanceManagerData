/**
 *
 */
package nl.pa3bmg.perform.srtg.common;

import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;

/**
 * @author Sam van Sabben
 *
 */
public class JAXBHelperPMTest {

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.JAXBHelperPM#readLoggerXML()}.
   */
  @Test
  public final void testReadLoggerXML() {
    assertNotNull("An object must be returned.", JAXBHelperPM.readLoggerXML());
  }

  @Test
  @Ignore
  public final void testReadRrdXmlForKey() {
    assertNotNull("An object must be returned.", JAXBHelperPM.readRrdXmlForKey("SLA_html"));
  }
}
