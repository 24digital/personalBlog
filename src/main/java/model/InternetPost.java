package model;

import model.IMPL.Post;

import java.util.LinkedList;

/**
 * Created by Marion on 8/14/2015.
 */
public class InternetPost extends Posts {
private LinkedList<Post> list;
    @Override
    public void deletePost(Posts post) {
       list.remove(post);
    }

    @Override
    public void addPost(Post post) {
        list.add(post);
    }

    @Override
    public int total() {
     return list.size();
    }
}
