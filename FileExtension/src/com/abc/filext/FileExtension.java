package com.abc.filext;
//program to display files of a specific extension in a specific dir
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileExtension {

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// user input for path of the folder and file extension
		System.out.println("Enter Folder Path :: ");
		String path = in.readLine();
		System.out.println("Enter File Extension :: ");
		String extension = in.readLine();

		// creating file object
		File file = new File(path);

		// Create List of Files
		List<File> fileList = new ArrayList<>();
		File fileArr[] = new File[50];

		fileArr = file.listFiles();

		//adding files from array to list
		for (int i = 0; i < fileArr.length; i++)
			fileList.add(fileArr[i]);

		//lambda expression to display the files
		fileList.stream().filter(i -> !i.isDirectory() && i.toString().endsWith(extension)).forEach(System.out::println);
	}
}
