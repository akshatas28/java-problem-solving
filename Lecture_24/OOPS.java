package Lecture_24;

import java.util.*;

// lect 24 = oops
// 
class Pens {
	String colour;
	String type;

	public void write() {
		System.out.println("write");
	}
}

public class OOPS {
	// main function in primary class
	public static void main(String[] args) {
		Pens pen1 = new Pens();
		pen1.colour = "blue";
		pen1.type = "ball";
		pen1.write();
	}
}
