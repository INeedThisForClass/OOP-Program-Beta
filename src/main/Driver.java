package main;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Driver {

	private static Comparator<Product> sorter = new Comparator<Product>() {
		public int compare(Product p0, Product p1) {
			if (p0.getName().toCharArray()[0] > p1.getName().toCharArray()[0]) return 1;
			if (p0.getName().toCharArray()[0] < p1.getName().toCharArray()[0]) return -1;
			return 0;
		}
	};

	public static void main(String[] args) {
		Product product = new Product("Ford");
		System.out.println(product.toString());

		AudioPlayer audioPlayer = new AudioPlayer("AudioPlayer", "Audio Spec Test");
		// from the MultiMediaControl class
		audioPlayer.play();
		audioPlayer.stop();
		audioPlayer.previous();
		audioPlayer.next();
		System.out.println(audioPlayer.toString());

		Screen screen = new Screen("1080p", 10, 5);
		System.out.println(screen.toString());

		MoviePlayer moviePlayer = new MoviePlayer("MoviePlayer", MonitorType.LED, screen);
		System.out.println(moviePlayer.toString());
		// from the MultiMediaControl class
		moviePlayer.play();

		List<Product> products = new ArrayList<Product>();
		char name = 'A';
		for (int i = 0; i < 5; i++) {
			name += (char) 1;
			products.add(new Product("Ford " + String.valueOf(name)));

		}
		System.out.println("Before Sorting:");
		for (int i = 0; i < 5; i++)
			System.out.println(products.get(i));
		Collections.sort(products, sorter);
		System.out.println("After Sorting:");
		for (int i = 0; i < 5; i++)
			System.out.println(products.get(i));
	}
}
