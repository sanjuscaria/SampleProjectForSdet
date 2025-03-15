package codeTesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.rmi.NotBoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.*;

import javax.xml.stream.events.Characters;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

import org.openqa.selenium.chrome.ChromeOptions;

public class Compare {

	public static void main(String[] args) throws NotBoundException, FileNotFoundException   {
		Runnable ar = ()->{
			for(int i = 0; i < 100; i++ ) {
				System.out.println("from A");
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
		};
		
		Runnable br = ()->{
			for (int j = 0; j <100; j++)
			{
			System.out.println("from B");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};

//		A a = new A();
//		B b = new B();
//		
		Thread at = new Thread(ar);
		Thread bt = new Thread(br);
		
		at.start();
		bt.start();
		
		
		

		
		
		
		
	}

}



class A implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 100; i++ ) {
		System.out.println("from A");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}

class B implements Runnable
{
	@Override
	public void run()
	{
		for (int j = 0; j <100; j++)
		{
		System.out.println("from B");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

