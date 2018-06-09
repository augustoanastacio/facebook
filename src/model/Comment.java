
package model;

import java.util.ArrayList;
import java.util.Date;

public class Comment  extends DataModel{
	private ArrayList<Answer> answers;
        
	public Comment(String userName, String text, Date datePosted) {
		this.userName = userName;
		this.text = text;
		this.datePosted = datePosted;
	}
}
