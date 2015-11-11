package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.slogger.Slogger;

public class JAXBSlogger {

  private final static String C_LOGGER_RESOURCE_NAME = "/logger.xml";

  private final static URL C_LOGGER_RESOURCE_URL = JAXBSlogger.class.getResource(C_LOGGER_RESOURCE_NAME);

  private final static String instance = "nl.pa3bmg.perform.srtg.generated.slogger";

  private Unmarshaller mUnmarshaller = null;

  private Marshaller mMarshaller = null;

  private boolean mIsConfigured = false;

  public JAXBSlogger() {
    try {
      JAXBContext context = JAXBContext.newInstance(instance);
      mUnmarshaller = context.createUnmarshaller();
      mMarshaller = context.createMarshaller();
      mIsConfigured = true;
    } catch (JAXBException e) {
      mIsConfigured = false;
    }
  }

  public Slogger readLoggerXML() {
    return readLoggerXML(C_LOGGER_RESOURCE_URL);
  }

  public Slogger readLoggerXML(String pFileName) {
    URL urlToFile = null;
    try {
      urlToFile = new File(pFileName).toURI().toURL();
    } catch (MalformedURLException e) {
      return null;
    }
    return readLoggerXML(urlToFile);
  }

  public Slogger readLoggerXML(URL pUrl) {
    if (!mIsConfigured) {
      return null;
    }
    Slogger logger = null;
    try {
      logger = (Slogger) mUnmarshaller.unmarshal(pUrl);
    } catch (JAXBException e) {
      return null;
    }
    return logger;
  }

  public boolean writeLoggerToXML(String fileName, Slogger logger) {
    if (!mIsConfigured) {
      return false;
    }
    try {
      FileWriter fw = new FileWriter(fileName);
      mMarshaller.marshal(logger, fw);
      fw.close();
      return true;
    } catch (IOException e) {
      return false;
    } catch (JAXBException e) {
      return false;
    }
  }

  public String writeLoggerToString(Slogger logger) {
    if (!mIsConfigured) {
      return null;
    }
    try {
      StringWriter writer = new StringWriter();
      mMarshaller.marshal(logger, writer);
      return writer.toString();
    } catch (JAXBException e) {
      return null;
    }
  }
}
