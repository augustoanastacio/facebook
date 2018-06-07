package model;
import java.io.File;

public class Photo extends File{
	private String path;
	private String description;
	
	public Photo(String path) {
		super(path);
		this.path = path;
	}

	public String getPath() {
		return this.path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
