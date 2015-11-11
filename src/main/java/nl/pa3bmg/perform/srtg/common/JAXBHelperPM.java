package nl.pa3bmg.perform.srtg.common;

import java.net.URL;

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

  private JAXBReport JBReport = null;

  private JAXBReporter JBReporter = null;

  private JAXBRrd JBRrd = null;

  private JAXBSla JBSla = null;

  private JAXBSlogger JBSlogger = null;

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
  public Report readReportXML(String fileName) {
    if (JBReport == null) {
      JBReport = new JAXBReport();
    }
    return JBReport.readReportXML(fileName);
  }

  public boolean writeReportToXML(String fileName, Report report) {
    if (JBReport == null) {
      JBReport = new JAXBReport();
    }
    return JBReport.writeReportToXML(fileName, report);
  }

  public String writeReportToString(Report report) {
    if (JBReport == null) {
      JBReport = new JAXBReport();
    }
    return JBReport.writeReportToString(report);
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
  public Slogger readLoggerXML(URL pUrl) {
    if (JBSlogger == null) {
      JBSlogger = new JAXBSlogger();
    }
    return JBSlogger.readLoggerXML(pUrl);
  }

  public Slogger readLoggerXML(String fileName) {
    if (JBSlogger == null) {
      JBSlogger = new JAXBSlogger();
    }
    return JBSlogger.readLoggerXML(fileName);
  }

  public boolean writeLoggerToXML(String fileName, Slogger logger) {
    if (JBSlogger == null) {
      JBSlogger = new JAXBSlogger();
    }
    return JBSlogger.writeLoggerToXML(fileName, logger);
  }

  public String writeLoggerToString(Slogger logger) {
    if (JBSlogger == null) {
      JBSlogger = new JAXBSlogger();
    }
    return JBSlogger.writeLoggerToString(logger);
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
