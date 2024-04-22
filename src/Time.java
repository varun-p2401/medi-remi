 import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Time
{
	private int minutes;
	private int seconds;
	private int hours;
	
	public Time()
	{
		minutes = 0;
		seconds = 0;
		hours = 0;
	}
	
	public void setHours()
	{
		Scanner inputseconds = new Scanner(System.in);
		Scanner inputminutes = new Scanner (System.in);
		System.out.println("Please enter the number of seconds you want to rest");
		String counterhours = inputseconds.nextLine();
		int totalseconds = Integer.parseInt(counterhours);
		int neutralizer = 1;
		long timeStart = System.currentTimeMillis();  
		
		for(int q = 0; q<3; q++)
		{
			neutralizer*=10;
		}
		
		long estimatedTime = System.currentTimeMillis() - timeStart;
		
		while(estimatedTime/neutralizer<totalseconds)
		{
			try 
			{
				Thread.sleep(1000);
			} 
			
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			estimatedTime = System.currentTimeMillis()-timeStart;
			
		}
		
		System.out.println("SURPRISE");
		File ring = new File("siren.wav");
		Surprise(ring);
	}
		public  void Surprise(File Sound)
		{
			try{
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(Sound));
				clip.start();
				clip.loop(-1);
				long totalFrames = (long)(clip.getFrameLength() * clip.getFormat().getFrameRate());
			    Thread.sleep( ( totalFrames* 1000 ));
			}
			
			catch(Exception e)
			{
				e.printStackTrace(System.out);
			}
	}
}