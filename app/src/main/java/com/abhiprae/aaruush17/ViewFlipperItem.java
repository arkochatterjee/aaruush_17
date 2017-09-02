package com.abhiprae.aaruush17;

/**
 * Created by Arko Chatterjee on 26-07-2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Rishi on 03-09-2016.
 */
public class ViewFlipperItem {

    public String img_id;
    private int avatar;
    private String nickname;
    private int background;
    private List<String> interests = new ArrayList<>();

    public ViewFlipperItem(int avatar, String nickname, int background, String... interest) {
        this.avatar = avatar;
        this.nickname = nickname;
        this.background = background;
        interests.addAll(Arrays.asList(interest));
    }

    public int getAvatar() {
        return avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public int getBackground() {
        return background;
    }

    public List<String> getInterests() {
        return interests;
    }

}
