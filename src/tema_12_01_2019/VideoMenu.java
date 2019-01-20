package tema_12_01_2019;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class VideoMenu {

    private Scanner reader = new Scanner(System.in);

	public VideoMenu() {
	}

	public void start() {

		VideoStore.addVideo("The Matrix");
		VideoStore.addVideo("Godfather II");
		VideoStore.addVideo("Star Wars Episode IV: A New Hope");
		
		
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
			        String title = reader.nextLine();
			        VideoStore.checkOut(title);
				break;
				
			case 3: System.out.println("Type in the movie title you are returning: ");
			        String title1 = reader.nextLine();
			        VideoStore.checkIn(title1);
				break;
			
			case 4: System.out.println("Enter the title of the video you want added: "); 
			        String name = reader.nextLine();
				    VideoStore.addVideo(name);
				break;
				
			case 5: x = true;
				break;
			}
		}
	}
}
