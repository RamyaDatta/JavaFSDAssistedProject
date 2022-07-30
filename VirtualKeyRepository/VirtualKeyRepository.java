package simplilearn.virtualkeyrepository;

import java.util.*;
import java.io.File;


public class VirtualKeyRepository {
	
	public static File projectfolder = new File("G:\\files");

	public static void main(String[] args) {

		// printing welcome Page
	
		System.out.println("*******Welcome to Lockers Pvt. Ltd******* \n");
		features();
	}

	public static void features() {

		System.out.println(" \n ......The List of Operations are...... \n");
		String arr[] = { "1. To retrive Current file names in an ascending order",
						 "2. Features to accept the user input for some User Enabled Operations", 
						 "3. To Close the application" };
		
		// display all the menu mentioned in the String array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);	
		}
		
		System.out.println("\nSelect one of the options listed above\n");
		
		Scanner sc = new Scanner(System.in);
		int option1 = sc.nextInt();
		
		
		switch (option1) {
		
		case 1:
			File arr1[] = projectfolder.listFiles();
			Arrays.sort(arr1);

			for (int i = 0; i < arr1.length; i++)
				System.out.println(arr1[i]);
			features();
			break;
			
		case 2:
			boolean temp = true;
			while (temp) {
				System.out.println("User Enabled Operations\n");
				System.out.println(" 1 : To Add a file in the existing Directory");
				System.out.println(" 2 : To Delete a file from the existing Directory. ");
				System.out.println(" 3 : To Search a user specified file from the Directory");
				System.out.println(" 4 : Navigate to the main menu");

				int option2 = sc.nextInt();
				
				switch (option2) {
				
				case 1:
					System.out.println("Enter the File Name to create");
					String s = sc.next();
					File file = new File(projectfolder, s);

					try {
						boolean value = file.createNewFile();
						if (value) {
							System.out.println("The  file is created. \n");
						} else {
							System.out.println("The file already exists.");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					
					break;
					
				case 2:
					
					System.out.println("Enter the File Name to delete");
					String name = sc.next();
					File file1 = new File(projectfolder, name);

					try {
						boolean value = file1.delete();
						if (value) {
							System.out.println("The  file is Deleted.");
						} else {
							System.out.println("File Not Found");
						}
					} catch (Exception e) {
						e.getStackTrace();
					}
					break;
					
				case 3:
					
					System.out.println("Enter filename to search");
					String search = sc.next();
					boolean flag = false;
					File arr2[] = projectfolder.listFiles();
					System.out.println("File :\n");
					
					for (int i = 0; i < arr2.length; i++) {
						if (arr2[i].getName().startsWith(search)) {
							flag = true;
							System.out.println(arr2[i]);
						}
					}
					if (flag == false) {
						System.out.println("Not found");
					}

					break;
					
				case 4:
					
					temp = false;
					features();
					break;
				default:
					System.out.println("You have made an invalid choice!");
					System.out.println("Please enter valid choice\n");

				}
			}
			break;
			
		case 3:
			System.out.println("Closing Your Application\n");
			System.out.println("********Thank You**********");
			break;
			
		default:
			System.out.println("You have made an invalid choice!");
			System.out.println("Please enter valid choice\n");
			features();
			break;

		}
	}		



}
