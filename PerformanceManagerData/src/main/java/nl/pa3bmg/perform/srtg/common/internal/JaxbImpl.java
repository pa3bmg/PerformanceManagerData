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

public class JaxbImpl<T, K> {
  private JAXBContext mJaxbContext;

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
      mJaxbContext = JAXBContext.newInstance(pContextPath, JaxbImpl.class.getClassLoader());
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

  public T readXmlForKey(K pKey) {
    if (mKeyVsUrl == null) {
      return null;
    }
    return readXml(mKeyVsUrl.get(pKey));
  }

  @SuppressWarnings("unchecked")
  public T readXml(URL pUrl) {
    T jaxbElement = null;

    if (mIsConfigured) {
      try {
        jaxbElement = (T) mJaxbContext.createUnmarshaller().unmarshal(pUrl);
      } catch (Exception e) {
        // Swallow.
      }
    }
    return jaxbElement;
  }

  public boolean writeToXml(String pFileName, T pJaxbElement) {
    boolean resultOk = false;

    if (mIsConfigured) {
      try (FileWriter fileWriter = new FileWriter(pFileName)) {
        mJaxbContext.createMarshaller().marshal(pJaxbElement, fileWriter);
        resultOk = true;
      } catch (JAXBException | IOException e) {
        // Swallow.
      }
    }
    return resultOk;
  }

  public String writeToString(T pJaxbElement) {
    String resultOk = null;

    if (mIsConfigured) {
      StringWriter stringWriterx = new StringWriter();
      try (StringWriter stringWriter = stringWriterx) {
        mJaxbContext.createMarshaller().marshal(pJaxbElement, stringWriter);
        resultOk = stringWriter.toString();
      } catch (JAXBException | IOException e) {
        // Swallow.
      }
    }
    return resultOk;
  }
}
