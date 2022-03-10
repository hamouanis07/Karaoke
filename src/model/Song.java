package model;

public class Song {

    protected String mArtist;
    protected String mTitle;
    protected String mVideoUrl;

    public Song(String mArtist, String mTitle, String mVideoUrl) {
        this.mArtist = mArtist;
        this.mTitle = mTitle;
        this.mVideoUrl = mVideoUrl;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }

    @Override
    public String toString(){
        return String.format("Song: %s by %s",mTitle,mArtist);
    }



}

