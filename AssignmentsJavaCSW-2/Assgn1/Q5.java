package Assgn1;

class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000"; // Default black color
    }

    // Parameterized constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Getter methods
    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public String getColorCode() {
        return colorCode;
    }

    // Setter methods
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // toString method to display image details
    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]";
    }
}

class ImageLibrary {
    private Image[] images;
    private int count;
    private static final int MAX_SIZE = 10;

    public ImageLibrary() {
        images = new Image[MAX_SIZE];
        count = 0;
    }

    public void addImage(Image image) {
        if (count < MAX_SIZE) {
            images[count++] = image;
        } else {
            System.out.println("Library is full, cannot add more images.");
        }
    }

    public Image searchImage(int width, int height) {
        for (int i = 0; i < count; i++) {
            if (images[i].getImageWidth() == width && images[i].getImageHeight() == height) {
                return images[i];
            }
        }
        return null;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < count) {
            return images[index];
        }
        return null;
    }
}

public class Q5 {

    public static void main(String[] args) {

        ImageLibrary library = new ImageLibrary();

        // Adding images to the library
        library.addImage(new Image(1920, 1080, "#FF5733"));
        library.addImage(new Image(1280, 720, "#00FF00"));
        library.addImage(new Image(800, 600, "#0000FF"));

        // Searching for an image
        Image foundImage = library.searchImage(1280, 720);
        if (foundImage != null) {
            System.out.println("Image found: " + foundImage);
        } else {
            System.out.println("Image not found");
        }

        // Retrieving an image by index
        Image imageAtIndex = library.getImage(1);
        if (imageAtIndex != null) {
            System.out.println("Image at index 1: " + imageAtIndex);
        } else {
            System.out.println("Invalid index");
        }

    }
}
