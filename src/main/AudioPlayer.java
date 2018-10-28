package main;

public class AudioPlayer extends Product implements MultiMediaControl {

	String audioSpecification;
	ItemType mediaType;

	public AudioPlayer(String name, String audioSpecification) {
		super(name);
		this.audioSpecification = audioSpecification;
		mediaType = ItemType.Audio;

	}

	public void play() {
		System.out.println("Playing...");
	}

	public void stop() {
		System.out.println("Stopped...");
	}

	public void previous() {
		System.out.println("Previous...");
	}

	public void next() {
		System.out.println("Next...");
	}

	public String toString() {
		String info = super.toString();
		info += "Audio Spec: "  + audioSpecification + "\n";
		info += "Media Type: "  + mediaType + "\n";
		return info;
	}

}
