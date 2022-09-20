package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javaconstructprogramming.StudentDetails;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("F:/NewFile.txt");
		
		boolean isCreated = file.createNewFile();
		
		System.out.println("isCreated = "+isCreated);
		System.out.println("Path = "+file.getAbsolutePath());
		/*
		Scanner inputScanner = new Scanner(System.in);

		PrintWriter printWriter = new PrintWriter(file);
		
		int ch = 1;
		do {
			System.out.println("Enter the fname");
			String fname = inputScanner.next();
			
			System.out.println("Enter the lname");
			String lname = inputScanner.next();
			
			System.out.println("Enter the rollNo");
			int rollNo = inputScanner.nextInt();
			
			System.out.println("Enter the mobileNo");
			long mobileNo = inputScanner.nextLong();
			
			StudentDetails studentDetails = new StudentDetails(fname, lname, rollNo, mobileNo);
			printWriter.println(studentDetails);
			
			System.out.println("Do you want to contineu...press one..");
			ch = inputScanner.nextInt();
		}while(ch == 1);
		
		inputScanner.close();
		printWriter.close();
		*/
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
	}
}
