/**
 *
 */
package nl.pa3bmg.perform.srtg.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.lang3.StringEscapeUtils;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import nl.pa3bmg.perform.srtg.generated.models.Models;
import nl.pa3bmg.perform.srtg.generated.models.Models.Minfo;

/**
 * @author Sam van Sabben
 *
 */
public class JAXBHelperPMTest {

  private static Path cTempTestPath;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    cTempTestPath = Files.createTempDirectory(JAXBHelperPMTest.class.getSimpleName() + "-");
    cTempTestPath.toFile().deleteOnExit();
  }

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

  @Test
  public void testWriteModelsToXMLEmptyModelsWrongPath() throws Exception {
    Models models = new Models();

    File file = new File(cTempTestPath.toFile(), "\test\testModelsEmptyWrongPath.xml");
    file.delete();
    file.mkdirs();
    file.deleteOnExit();
    JAXBHelperPM.writeModelsToXML(file.toString(), models);
    assertFalse("File may not exist.", file.exists());
  }

  @Test
  public void testWriteModelsToXMLEmptyModels() throws Exception {
    Models models = new Models();

    File file = new File(cTempTestPath.toFile(), StringEscapeUtils.escapeJava("\test\testWriteModelsToXMLEmptyModels.xml"));
    file.delete();
    file.mkdirs();
    file.deleteOnExit();
    JAXBHelperPM.writeModelsToXML(file.toString(), models);
    assertTrue("File must exist.", file.exists());
  }

  @Test
  public void testWriteModelsToXMLEmptyModelsRelatief() throws Exception {
    Models models = new Models();

    File file = new File(cTempTestPath.toFile(), "./data/store/statistic_data/rrdb/models.xml");
    file.delete();
    file.mkdirs();
    file.deleteOnExit();
    JAXBHelperPM.writeModelsToXML(file.toString(), models);
    assertTrue("File must exist.", file.exists());
  }

  @Test
  public void testWriteModelsToXMLModels() throws Exception {
    Models models = new Models();

    Minfo minfo = new Minfo();
    minfo.setName("Name");
    minfo.setNameid("NameId");
    minfo.setTypeid("TypeId");
    minfo.setType("Type");
    models.getMinfo().add(minfo);

    File file = new File(cTempTestPath.toFile(), StringEscapeUtils.escapeJava("\test\testWriteModelsToXMLModels.xml"));
    file.delete();
    file.mkdirs();
    file.deleteOnExit();
    JAXBHelperPM.writeModelsToXML(file.toString(), models);
    assertTrue("File must exist.", file.exists());
  }
}
