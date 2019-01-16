package videostore.tema;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VideoMenu {

	public VideoMenu() {
		
		VideoStore.addVideo("The_Matrix");
		VideoStore.addVideo("Godfather_II");
		VideoStore.addVideo("Star_Wars_Episode_IV:_A_New_Hope");
		
		
		boolean x = false;
		
		while (x == false) {
			System.out.println("Welcome!");
			System.out.println("1. List available videos.");
			System.out.println("2. Check out title.");
			System.out.println("3. Return title.");
			System.out.println("4. Add new title.");
			System.out.println("5. Exit.");
			System.out.println("Select desired option: ");
			Scanner reader = new Scanner(System.in);
			int option = reader.nextInt();
			
			switch(option) {
			
			case 1: VideoStore.viewAvailable();
				break;
				
			case 2: System.out.println("Type in the movie title you want to rent: ");
			        Scanner reader2 = new Scanner(System.in);
			        String title = reader2.next();
			        VideoStore.checkOut(title);
				break;
				
			case 3: System.out.println("Type in the movie title you are returning: ");
			        Scanner reader3 = new Scanner(System.in);
			        String title1 = reader3.next();
			        VideoStore.checkIn(title1);
				break;
			
			case 4: System.out.println("Enter the title of the video you want added: "); 
			        Scanner reader1 = new Scanner(System.in);
			        String name = reader1.next();
				    VideoStore.addVideo(name);
				break;
				
			case 5: x = true;
				break;
			}
		}
		
	}

}
