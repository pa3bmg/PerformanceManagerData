package nl.pa3bmg.perform.srtg.common.internal;

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

public class JaxbImpl<T> {

  private Unmarshaller mUnmarshaller = null;

  private Marshaller mMarshaller = null;

  private boolean mIsConfigured = false;

  private final URL mDefaultResourceUrl;

  public JaxbImpl(String pContextPath, String pDefaultResourceName) {
    mDefaultResourceUrl = JaxbImpl.class.getResource(pDefaultResourceName);
    try {
      JAXBContext context = JAXBContext.newInstance(pContextPath);
      mUnmarshaller = context.createUnmarshaller();
      mMarshaller = context.createMarshaller();
      mIsConfigured = true;
    } catch (JAXBException e) {
      mIsConfigured = false;
    }
  }

  public T readXml() {
    return readXml(mDefaultResourceUrl);
  }

  public T readXml(String pFileName) {
    URL urlToFile = null;
    try {
      urlToFile = new File(pFileName).toURI().toURL();
    } catch (MalformedURLException e) {
      return null;
    }
    return readXml(urlToFile);
  }

  @SuppressWarnings("unchecked")
  public T readXml(URL pUrl) {
    if (!mIsConfigured) {
      return null;
    }
    T jaxbElement = null;
    try {
      jaxbElement = (T) mUnmarshaller.unmarshal(pUrl);
    } catch (Exception e) {
      return null;
    }
    return jaxbElement;
  }

  public boolean writeToXml(String pFileName, T pJaxbElement) {
    if (!mIsConfigured) {
      return false;
    }
    try (FileWriter fileWriter = new FileWriter(pFileName)) {
      mMarshaller.marshal(pJaxbElement, fileWriter);
      return true;
    } catch (JAXBException | IOException e) {
      return false;
    }
  }

  public String writeToString(T pJaxbElement) {
    if (!mIsConfigured) {
      return null;
    }
    try (StringWriter stringWriter = new StringWriter()) {

      mMarshaller.marshal(pJaxbElement, stringWriter);
      return stringWriter.toString();
    } catch (JAXBException | IOException e) {
      return null;
    }
  }
}
