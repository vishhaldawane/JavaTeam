public class PhotographyTest {
    public static void main(String[] args) {

        Photographer photographerObj = new Photographer("Sandeep",0);
        photographerObj.printPhotographer();

        photographerObj.clickPictures();
        photographerObj.clickPictures();
        photographerObj.clickPictures();

        photographerObj.printPhotographer();

        photographerObj.clickPictures();
        photographerObj.clickPictures();

        photographerObj.printPhotographer();

        photographerObj.deleteAPic();
        photographerObj.printPhotographer();

        System.out.println("------------------------");

        Cinematographer cinematographerObj = new Cinematographer("Sonam",0,0);
        cinematographerObj.printCinematographer();
        cinematographerObj.clickPictures();
        cinematographerObj.clickPictures();

        cinematographerObj.recordVideo();
        cinematographerObj.recordVideo();
        cinematographerObj.recordVideo();

        cinematographerObj.printCinematographer();
        cinematographerObj.deleteAPic();
        cinematographerObj.deleteAVideo();

        cinematographerObj.printCinematographer();

    }
}
class Photographer
{
    String name;
    int numberOfClicks;

    public Photographer(String name, int numberOfClicks) {
        System.out.println("Photographer(String,int)....");
        this.name = name;
        this.numberOfClicks = numberOfClicks;
    }
    void clickPictures() {
        System.out.println(name+" has clicked a pic...");
        numberOfClicks++; //increase by one
    }
    void deleteAPic() {
        System.out.println(name+" has deleted a pic...");
        numberOfClicks--;
    }
    void printPhotographer() {
        System.out.println(name+" has clicked "+numberOfClicks+" pictures till now");
    }
}
class A
{
    A() { }
}
class B extends A
{

}
class Cinematographer extends Photographer
{
    int numberOfVideos;

    public Cinematographer(String name, int numberOfClicks, int numberOfVideos) {
        super(name, numberOfClicks); //invokes the nearest super class constructor
        System.out.println("Cinematographer(String,int,int) constructor ....");
        this.numberOfVideos = numberOfVideos;
    }
    void printCinematographer() {
        super.printPhotographer();
        System.out.println(name+" has recorded "+numberOfVideos+" videos   till now");
    }
    void recordVideo() {
        System.out.println(name+" has recorded a video....");
        numberOfVideos++;
    }
    void deleteAVideo() {
        System.out.println(name+" has deleted a video...");
        numberOfVideos--;
    }
}
/*
class Cinematographer
{
    String name;
    int numberOfClicks;
    int numberOfVideos;

    public Cinematographer(String name, int numberOfClicks, int numberOfVideos) {
        this.name = name;
        this.numberOfClicks = numberOfClicks;
        this.numberOfVideos = numberOfVideos;
    }

    void clickPictures() {
        System.out.println(name+" has clicked a pic...");
        numberOfClicks++; //increase by one
    }

    void recordVideo() {
        System.out.println(name+" has recorded a video....");
        numberOfVideos++;
    }
    void deleteAPic() {
        System.out.println(name+" has deleted a pic...");
        numberOfClicks--;
    }
    void deleteAVideo() {
        System.out.println(name+" has deleted a video...");
        numberOfVideos--;
    }
    void printCinematographer() {
        System.out.println(name+" has clicked  "+numberOfClicks+" pictures till now");
        System.out.println(name+" has recorded "+numberOfVideos+" videos   till now");
    }
}
*/

