/**
 *
 */
package nl.pa3bmg.perform.srtg.common.internal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.net.URL;
import java.util.HashMap;

import org.junit.Test;

import nl.pa3bmg.perform.srtg.common.JAXBHelperPM;
import nl.pa3bmg.perform.srtg.generated.slogger.Slogger;

/**
 * @author Sam van Sabben
 *
 */
public class JaxbImplTest {

  private final static String C_ASSERT_NOT_NULL_MESSAGE = "An object must be returned and not null.";

  private final static String C_WRONG_VALUE_MESSAGE = "Wrong value of object.";

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.internal.JaxbImpl#readXml()}.
   */
  @Test
  public final void testReadXmlNull() {
    JaxbImpl<Slogger, String> jaxbSlogger = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.slogger", JAXBHelperPM.class.getResource("/logger_default.xml"));
    Slogger sloggerXml = jaxbSlogger.readXml();
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXml);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_default", sloggerXml.getGroup().get(0).getName());
  }

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.internal.JaxbImpl#readXml(java.lang.String)}.
   */
  @Test
  public final void testReadXmlString() {
    JaxbImpl<Slogger, String> jaxbSlogger = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.slogger");
    Slogger sloggerXml = jaxbSlogger.readXml("./target/test-classes/logger_default.xml");
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXml);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_default", sloggerXml.getGroup().get(0).getName());
  }

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.internal.JaxbImpl#readXmlForKey(java.lang.Object)}.
   */
  @Test
  public final void testReadXmlForKey() {
    JaxbImpl<Slogger, String> jaxbSlogger = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.slogger", JAXBHelperPM.class.getResource("/logger_default.xml"),
        new HashMap<String, URL>() {
          private static final long serialVersionUID = 362498820777181265L;

          {
            put("log_1", JAXBHelperPM.class.getResource("/logger_1.xml"));
            put("log_2", JAXBHelperPM.class.getResource("/logger_2.xml"));
          }
        });

    Slogger sloggerXml = jaxbSlogger.readXml(JAXBHelperPM.class.getResource("/logger_default.xml"));
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXml);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_default", sloggerXml.getGroup().get(0).getName());

    Slogger sloggerXmlKeyLog1 = jaxbSlogger.readXmlForKey("log_1");
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXmlKeyLog1);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_1_name", sloggerXmlKeyLog1.getGroup().get(0).getName());

    Slogger sloggerXmlKeyLog2 = jaxbSlogger.readXmlForKey("log_2");
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXmlKeyLog2);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_2_name", sloggerXmlKeyLog2.getGroup().get(0).getName());
  }

  /**
   * Test method for {@link nl.pa3bmg.perform.srtg.common.internal.JaxbImpl#readXml(java.net.URL)}.
   */
  @Test
  public final void testReadXmlURL() {
    JaxbImpl<Slogger, String> jaxbSlogger = new JaxbImpl<>("nl.pa3bmg.perform.srtg.generated.slogger");
    Slogger sloggerXml = jaxbSlogger.readXml(JAXBHelperPM.class.getResource("/logger_default.xml"));
    assertNotNull(C_ASSERT_NOT_NULL_MESSAGE, sloggerXml);
    assertEquals(C_WRONG_VALUE_MESSAGE, "logger_default", sloggerXml.getGroup().get(0).getName());
  }
}
