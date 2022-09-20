package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

import javaconstructprogramming.StudentDetails;

public class FileHandlingUsingJson {

	public static void main(String[] args) throws IOException {
		File file = new File("StudentDetails.json");
		
		boolean isCreated = file.createNewFile();
		
		/*
		System.out.println("isCreated = "+isCreated);
		System.out.println("Path = "+file.getAbsolutePath());
		
		Scanner inputScanner = new Scanner(System.in);

		PrintWriter printWriter = new PrintWriter(file);
		
		List<StudentDetails> studentDetails = new ArrayList<StudentDetails>();
		
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
			
			StudentDetails studentDetail = new StudentDetails(fname, lname, rollNo, mobileNo);
			studentDetails.add(studentDetail);
			System.out.println("Do you want to contineu...press one..");
			ch = inputScanner.nextInt();
		}while(ch == 1);
		
		Gson gson = new Gson();
		final String jsonString = gson.toJson(studentDetails);
		printWriter.write(jsonString);
		inputScanner.close();
		printWriter.close();
		*/
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		Gson gson = new Gson();
		
		StudentDetails[] obj = gson.fromJson(bufferedReader, StudentDetails[].class);
		
		List<StudentDetails> list = Arrays.asList(obj);
		
		list.forEach(data -> System.out.println(data));
		
	}
}
