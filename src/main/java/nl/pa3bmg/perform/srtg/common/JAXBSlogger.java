package nl.pa3bmg.perform.srtg.common;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.URL;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import nl.pa3bmg.perform.srtg.generated.slogger.Slogger;

public class JAXBSlogger {
  private Unmarshaller unmarshaller = null;

  private Marshaller marshaller = null;

  private final String instance = "nl.pa3bmg.perform.srtg.generated.slogger";

  private boolean Status = false;

  public JAXBSlogger() {
    try {
      JAXBContext context = JAXBContext.newInstance(instance);
      unmarshaller = context.createUnmarshaller();
      marshaller = context.createMarshaller();
      Status = true;
    } catch (JAXBException e) {
      Status = false;
    }
  }

  public Slogger readLoggerXML(URL pUrl) {
    if (!Status) {
      return null;
    }
    Slogger logger = null;
    try {
      logger = (Slogger) unmarshaller.unmarshal(pUrl);
    } catch (JAXBException e) {
      return null;
    }
    return logger;
  }

  public Slogger readLoggerXML(String fileName) {
    if (!Status) {
      return null;
    }
    Slogger logger = null;
    try {
      File f = new File(fileName);
      logger = (Slogger) unmarshaller.unmarshal(f);
    } catch (JAXBException e) {
      return null;
    }
    return logger;
  }

  public boolean writeLoggerToXML(String fileName, Slogger logger) {
    if (!Status) {
      return false;
    }
    try {
      FileWriter fw = new FileWriter(fileName);
      marshaller.marshal(logger, fw);
      fw.close();
      return true;
    } catch (IOException e) {
      return false;
    } catch (JAXBException e) {
      return false;
    }
  }

  public String writeLoggerToString(Slogger logger) {
    if (!Status) {
      return null;
    }
    try {
      StringWriter writer = new StringWriter();
      marshaller.marshal(logger, writer);
      return writer.toString();
    } catch (JAXBException e) {
      return null;
    }
  }
}
