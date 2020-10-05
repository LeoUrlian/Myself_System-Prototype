package entities;

public class About {

    private String about;

    public About(){}

    public About(String about){
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    @Override
    public String toString() {
        return about;
    }

}
