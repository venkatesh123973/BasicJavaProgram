package selenium;

import org.testng.IAlterSuiteListener;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.TestListenerAdapter;
import org.testng.reporters.IReporterConfig;
import org.testng.xml.XmlSuite;

import java.util.List;

public class alter implements IReporter {

    @Override
    public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
        for(ISuite suite:suites){

        }
    }

    @Override
    public IReporterConfig getConfig() {
        return IReporter.super.getConfig();
    }
}
