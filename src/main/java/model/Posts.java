package model;

import javafx.geometry.Pos;
import model.IMPL.Post;

/**
 * Created by Marion on 8/14/2015.
 */
public abstract class Posts {
    private String name;
    private String topic;
    private String description;
    public void deletePost(Posts post){};
    public void addPost(Post post){};
    public String getName(Post post){return null;};
    public void setDescription(Post post){};



    public int total(){return -1;};
    public String getDescription() {
        return description;
    }
    public String getTopic() {
        return topic;
    }
}
