package com.abc.subdir;
import java.io.BufferedReader;
//program to view all subdirectories under a directory
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViewSubDir {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//user input for path of the folder
		System.out.println("Enter Folder Path :: ");
		String path = in.readLine();
		
		//creating file object
		File file = new File(path);

		// using file filter with lambda expression
		File listOfFolder[] = file.listFiles((fileElement) -> {
			return fileElement.isDirectory();
		});

		// iterating through each file element
		for (File eachFile : listOfFolder)
			System.out.println(eachFile.getName());

	}

}
