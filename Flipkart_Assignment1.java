package package1;

import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver(); //To launch empty browser
		driver.get("https://www.flipkart.com"); //To navigate to any site
		Thread.sleep(1000);
		//driver.close(); //To close browser
		
		String title= driver.getTitle();
		System.out.println("Flipkart site title is:"+title);	
		
		
		
		String word[]=title.split(" ");
		System.out.println("length of array1:"+ word.length);
		
		for(int i=0;i<word.length;i++)
		{
			System.out.println(word[i]);
		
		}
		
		System.out.println(Arrays.toString(word));
		
	/* String w=""; 
	for(int i=0;i<title.length();i++)
	{
		char c= title.charAt(i);
				if(c!=' ')
				{
				w=w+c;
				
	            }
				else 
				{   
					ArrayList a1= new ArrayList();
						a1.add(w);
					System.out.print(a1);
			
				   w="";
				}
				
	} */


	}

}
