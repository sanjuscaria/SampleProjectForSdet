package codeTesting;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   ArrayList<String> lst = new ArrayList<String>();
	   lst.add("grapes");
	   lst.add("banana");
	   lst.add("pineapple");
	   lst.add("apple");
	   lst.add("dragonfruit");
	   lst.add("papaya");
	   lst.add("banana");
	   
	   
	Set<String> slist = new HashSet<>(lst);
	//Set<Integer> set = new HashSet<>(arrayList);
	   
		Stream<String> result = lst.stream().filter(a->a.startsWith("p")).map(a->a.toUpperCase()).sorted((a,b) ->b.compareTo(a));
		
		slist.forEach(System.out::println);
	   
	   
	
		
		

	}

}
