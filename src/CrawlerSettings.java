
public class CrawlerSettings {
	/* Primitive types */
	private int screen_width;
	private int screen_height;
	private boolean fullscreen;
	/*******************/
	
	/* Java types */
	String title;
	/**************/
	
	public CrawlerSettings(int w, int h, boolean f, String t) {
		screen_width = w;
		screen_height = h;
		fullscreen = f;
		title = t;
	}
	
	public int getScreenWidth() {
		return screen_width;
	}
	
	public int getScreenHeight() {
		return screen_height;
	}
	
	public boolean getFullscreen() {
		return fullscreen;
	}
}
