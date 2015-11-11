package nl.pa3bmg.perform.srtg.common;

import java.net.URL;

import nl.pa3bmg.perform.srtg.common.internal.JAXBInexport;
import nl.pa3bmg.perform.srtg.common.internal.JAXBInfo;
import nl.pa3bmg.perform.srtg.common.internal.JAXBModels;
import nl.pa3bmg.perform.srtg.common.internal.JAXBReporter;
import nl.pa3bmg.perform.srtg.common.internal.JAXBRrd;
import nl.pa3bmg.perform.srtg.common.internal.JAXBSla;
import nl.pa3bmg.perform.srtg.common.internal.JaxbImpl;

/*
 * (C) 2008 ... 2015 Ton Smink PA3BMG
 */

import nl.pa3bmg.perform.srtg.generated.inexport.Inexport;
import nl.pa3bmg.perform.srtg.generated.info.Info;
import nl.pa3bmg.perform.srtg.generated.models.Models;
import nl.pa3bmg.perform.srtg.generated.rep.RrdGraphDef;
import nl.pa3bmg.perform.srtg.generated.report.Report;
import nl.pa3bmg.perform.srtg.generated.reporter.Reporter;
import nl.pa3bmg.perform.srtg.generated.sla.RttMonCtrlAdmin;
import nl.pa3bmg.perform.srtg.generated.slogger.Slogger;

public class JAXBHelperPM {
  private JAXBInexport JBInexport = null;

  private JAXBInfo JBInfo = null;

  private JAXBModels JBModels = null;

  private JAXBReporter JBReporter = null;

  private JAXBRrd JBRrd = null;

  private JAXBSla JBSla = null;

  private final static JaxbImpl<Report> C_JAXB_REPORT = new JaxbImpl<Report>("nl.pa3bmg.perform.srtg.generated.report", "/report.xml");

  private final static JaxbImpl<Slogger> C_JAXB_SLOGGER = new JaxbImpl<Slogger>("nl.pa3bmg.perform.srtg.generated.slogger", "/logger.xml");

  //// JBInexport //////////////////////////////////////////////
  public Inexport readImportXML(String fileName) {
    if (JBInexport == null) {
      JBInexport = new JAXBInexport();
    }
    return JBInexport.readImportXML(fileName);
  }

  public String writeImportToString(Inexport inexport) {
    if (JBInexport == null) {
      JBInexport = new JAXBInexport();
    }
    return JBInexport.writeImportToString(inexport);
  }

  public boolean writeImportToXML(String fileName, Inexport inexport) {
    if (JBInexport == null) {
      JBInexport = new JAXBInexport();
    }
    return JBInexport.writeImportToXML(fileName, inexport);
  }

  ////JAXBInfo //////////////////////////////////////////////
  public Info readInfoXML(String fileName) {
    if (JBInfo == null) {
      JBInfo = new JAXBInfo();
    }
    return JBInfo.readInfoXML(fileName);
  }

  public String writeInfoToString(Info info) {
    if (JBInfo == null) {
      JBInfo = new JAXBInfo();
    }
    return JBInfo.writeInfoToString(info);
  }

  public boolean writeInfoToXML(String fileName, Info info) {
    if (JBInfo == null) {
      JBInfo = new JAXBInfo();
    }
    return JBInfo.writeInfoToXML(fileName, info);
  }

  ////JAXBModels //////////////////////////////////////////////
  public Models readModelsXML(String fileName) {
    if (JBModels == null) {
      JBModels = new JAXBModels();
    }
    return JBModels.readModelsXML(fileName);
  }

  public boolean writeModelsToXML(String fileName, Models models) {
    if (JBModels == null) {
      JBModels = new JAXBModels();
    }
    return JBModels.writeModelsToXML(fileName, models);
  }

  public String writeModelsToString(Models models) {
    if (JBModels == null) {
      JBModels = new JAXBModels();
    }
    return JBModels.writeModelsToString(models);
  }

  ////JAXBReport //////////////////////////////////////////////
  public static Report readReportXML(String pFileName) {
    return C_JAXB_REPORT.readXml(pFileName);
  }

  public static boolean writeReportToXML(String pFileName, Report pReport) {
    return C_JAXB_REPORT.writeToXml(pFileName, pReport);
  }

  public static String writeReportToString(Report pReport) {
    return C_JAXB_REPORT.writeToString(pReport);
  }

  ////JAXBReporter //////////////////////////////////////////////
  public Reporter readReporterXML(String fileName) {
    if (JBReporter == null) {
      JBReporter = new JAXBReporter();
    }
    return JBReporter.readReporterXML(fileName);
  }

  public boolean writeReporterToXML(String fileName, Reporter reporter) {
    if (JBReporter == null) {
      JBReporter = new JAXBReporter();
    }
    return JBReporter.writeReporterToXML(fileName, reporter);
  }

  public String writeReporterToString(Reporter reporter) {
    if (JBReporter == null) {
      JBReporter = new JAXBReporter();
    }
    return JBReporter.writeReporterToString(reporter);
  }

  ////JAXBSla //////////////////////////////////////////////
  public RttMonCtrlAdmin readSlaXML(String fileName) {
    if (JBSla == null) {
      JBSla = new JAXBSla();
    }
    return JBSla.readSlaXML(fileName);
  }

  public boolean writeSlaToXML(String fileName, RttMonCtrlAdmin info) {
    if (JBSla == null) {
      JBSla = new JAXBSla();
    }
    return JBSla.writeSlaToXML(fileName, info);
  }

  public String writeSlaToString(RttMonCtrlAdmin info) {
    if (JBSla == null) {
      JBSla = new JAXBSla();
    }
    return JBSla.writeSlaToString(info);
  }

  ////JAXBSlogger //////////////////////////////////////////////
  public static Slogger readLoggerXML() {
    return C_JAXB_SLOGGER.readXml();
  }

  public static Slogger readLoggerXML(URL pUrl) {
    return C_JAXB_SLOGGER.readXml(pUrl);
  }

  public static Slogger readLoggerXML(String pFileName) {
    return C_JAXB_SLOGGER.readXml(pFileName);
  }

  public static boolean writeLoggerToXML(String pFileName, Slogger pSlogger) {
    return C_JAXB_SLOGGER.writeToXml(pFileName, pSlogger);
  }

  public static String writeLoggerToString(Slogger pSlogger) {
    return C_JAXB_SLOGGER.writeToString(pSlogger);
  }

  ////JAXBSlogger //////////////////////////////////////////////
  public RrdGraphDef readRrdXML(String fileName) {
    if (JBRrd == null) {
      JBRrd = new JAXBRrd();
    }
    return JBRrd.readRrdXML(fileName);
  }

  public boolean writeRrdToXML(String fileName, RrdGraphDef info) {
    if (JBRrd == null) {
      JBRrd = new JAXBRrd();
    }
    return JBRrd.writeRrdToXML(fileName, info);
  }

  public String writeRrdToString(RrdGraphDef info) {
    if (JBRrd == null) {
      JBRrd = new JAXBRrd();
    }
    return JBRrd.writeRrdToString(info);
  }
}
