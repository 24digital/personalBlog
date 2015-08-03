package model;

import java.util.List;

/**
 * Created by 24digital on 7/26/15.
 */
public interface BlogRepository {
    List<Post> findPost(String name);
}
