package nl.pa3bmg.perform.srtg.common.internal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbImpl<T, K> {

  private Unmarshaller mUnmarshaller = null;

  private Marshaller mMarshaller = null;

  private boolean mIsConfigured = false;

  private URL mDefaultResourceUrl;

  private Map<K, URL> mKeyVsUrl;

  public JaxbImpl(String pContextPath) {
    this(pContextPath, null, null);
  }

  public JaxbImpl(String pContextPath, URL pDefaultResourceUrl) {
    this(pContextPath, pDefaultResourceUrl, null);
  }

  public JaxbImpl(String pContextPath, Map<K, URL> pKeyVsUrl) {
    this(pContextPath, null, pKeyVsUrl);
  }

  /**
   * @param pContextPath
   * @param pDefaultResourceUrl
   * @param pKeyVsUrl
   *          <p>
   *          <b>Remark:</b> The java objects (representing the XML files) must be internal present in the jar!
   */
  public JaxbImpl(String pContextPath, URL pDefaultResourceUrl, Map<K, URL> pKeyVsUrl) {
    mDefaultResourceUrl = pDefaultResourceUrl;
    mKeyVsUrl = pKeyVsUrl;

    try {
      JAXBContext context = JAXBContext.newInstance(pContextPath, JaxbImpl.class.getClassLoader());
      mUnmarshaller = context.createUnmarshaller();
      mMarshaller = context.createMarshaller();
      mIsConfigured = true;
    } catch (JAXBException e) {
      mIsConfigured = false;
    }
  }

  public T readXml() {
    if (mDefaultResourceUrl == null) {
      return null;
    }
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

  public T readXmlForKey(K pKey) {
    if (mKeyVsUrl == null) {
      return null;
    }
    return readXml(mKeyVsUrl.get(pKey));
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
