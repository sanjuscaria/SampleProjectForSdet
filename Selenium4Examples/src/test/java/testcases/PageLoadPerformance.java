package testcases;

import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v132.performance.Performance;
import org.openqa.selenium.devtools.v132.performance.model.Metric;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class PageLoadPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Performance.enable(Optional.empty()));
		List<Metric> metrics = devTools.send(Performance.getMetrics());
		metrics.forEach(metric -> System.out.println(metric.getName() + ": " + metric.getValue()));	

	}

}
