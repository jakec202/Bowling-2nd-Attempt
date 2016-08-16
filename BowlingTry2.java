package com.BowlingTry2;

public class BowlingTry2 {

	public static int pins = 11;
	public static int frames = 10;
//	 public static int throw1PerFrame = (int) (Math.random() * pins);
//	 public static int throw2PerFrame = (int)((pins - throw1PerFrame)*
	// Math.random());

	public static void main(String[] args) {

		for (int i = 1; i <= frames; i++) {
			System.out.println("Frame " + i);

			int throw1PerFrame = (int) (Math.random() * pins);
			int throw2PerFrame = (int) ((pins - throw1PerFrame) * Math.random());

			System.out.print("Your first roll for this frame is " + throw1PerFrame);

			if (throw1PerFrame == 10) {
				System.out.println(" \n   X STRIKE X \nYou do not get a second roll for this frame.");
				// System.out.println("You do not get a second roll for this
				// frame.\n");
			} else
				System.out.println("\nYour second roll for this frame is " + throw2PerFrame);

			if ((throw1PerFrame !=10) && (throw1PerFrame + throw2PerFrame) == 10) {
				System.out.println("  / SPARE / \n ");
			}else System.out.println("");
			
			

		} // for loop for frames

	} // main

} // class
