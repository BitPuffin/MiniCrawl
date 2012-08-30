import org.lwjgl.opengl.Display;


public class Main {

	public static void main(String[] trosor) {
		CrawlerSettings settings = new CrawlerSettings(1024, 720, false, "Mini Crawl");
		CrawlerGame game = new CrawlerGame(settings);
	}

}
