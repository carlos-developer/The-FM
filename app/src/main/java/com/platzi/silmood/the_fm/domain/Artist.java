package com.platzi.silmood.the_fm.domain;

import com.google.gson.annotations.SerializedName;
import com.platzi.silmood.the_fm.io.model.JsonKeys;

import java.util.ArrayList;

/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p/>
 *
 * Created by Pedro Hernández on 07/2015.
 */

public class Artist {

    @SerializedName(JsonKeys.ARTIST_NAME)
    private String name;

    @SerializedName(JsonKeys.ARTIST_LISTENERS)
    private int listeners;

    @SerializedName(JsonKeys.ARTIST_PLAY_COUNT)
    private int playCount;

    @SerializedName(JsonKeys.ARTIST_IMAGES)
    ArrayList<ArtistImage> images;

    public Artist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlMediumImage(){
        return images.get(3).getUrl();
    }

    public String getUrlLargeImage(){
        return images.get(4).getUrl();
    }

    public int getListeners() {
        return listeners;
    }

    public int getPlayCount() {
        return playCount;
    }

    private class ArtistImage {
        @SerializedName(JsonKeys.IMAGE_URL)
        private String url;

        @SerializedName(JsonKeys.IMAGE_SIZE)
        private String size;

        public String getUrl() {
            return url;
        }

        public String getSize() {
            return size;
        }
    }
}
