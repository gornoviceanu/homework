package tema_12_01_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStore {

	public VideoStore() {

	}

	// inner class
	static class Video {
		public final String title;
		public boolean available = true;
		public float rating = 0F;
		int i = 0;

		public Video(String title) {
			this.title = title;
			this.available = true;
		}

		public String getName() {
			return this.title;
		}

		public String toString() {
			return getName();
		}

		void receiveRating(int givenRating) {
			this.i++;
			this.rating = (this.rating + givenRating) / i;
		}
	}

	// lista
	public static List<Video> videos = new ArrayList<Video>();

// metodele
	static void viewAvailable() {
		for (Video video : videos) {
			System.out.println(video.toString() + " // Average rating: " + video.rating + " // Number of views: "
					+ video.i + " // Available: " + video.available);
		}
	}

	static void addVideo(String title) {
		videos.add(new Video(title));
	}

	static void checkOut(String title) {

		for (Video video : videos) {
			if ((video.title).equals(title) && video.available == true) {
				video.available = false;
				System.out.println("Enjoy viewing " + title);
				if (video.available == false) {
					System.out.println("Title is currently not available.");
				}
			}
		}
	}

	// in metoda checkIn am implementat metoda receiveRating pentru ca m-am gandit
	// ca nu poti lasa un Rating fara sa vezi filmul. As fi putut sa o adaug
	// individual in meniu dar m-am gandit ca e mai bine asa.
	static void checkIn(String title) {
		for (Video video : videos) {
			if ((video.title).equals(title) && video.available == false) {
				video.available = true;
				System.out.println(
						"Thank you for returning the video. Please leave an integer rating between 1-10 for the movie: ");
				Scanner reader4 = new Scanner(System.in);
				int givenRating = reader4.nextInt();
				video.receiveRating(givenRating);
			}
		}
	}

}
