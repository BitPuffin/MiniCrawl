import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.util.Display;


public final class CrawlerGame {
	
	/* Primitive types */
	private boolean initialized;    // Ugly but I don't wanna rewrite code
	/*******************/
	
	/* LWJGL types */
	private Display crawler_window;
	private DisplayMode display_mode;
	/***************/
	
	/* Engine types */
	private CrawlerSettings settings;
	/****************/
	
	// Constructor
	public CrawlerGame(CrawlerSettings s) {
		initialized = false;
		setSettings(s);
		initialized = true;
		crawler_window = new Display();
		display_mode = new DisplayMode(
				settings.getScreenWidth(),
				settings.getScreenWidth()
				);
		
	}
	
	/* Setters */
	public void setSettings(CrawlerSettings s) {
		settings = s;
		if(initialized) {
			// Call methods for updating settings mid game...
		}
	}
	/***********/
	
	/* Public methods */
	public void startGame() {
		
	}
	/******************/
	
}
