package Assgn1;

class Image {
    private int imageWidth;
    private int imageHeight;
    private String colorCode;

    // Default constructor
    public Image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = "#000000"; // Default color (black)
    }

    // Parameterized constructor
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    // Getter and Setter for imageWidth
    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    // Getter and Setter for imageHeight
    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    // Getter and Setter for colorCode
    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    // toString method to print object details
    @Override
    public String toString() {
        return "Image [Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode + "]";
    }
}

public class Q4 {

    public static void main(String[] args) {

        // Creating an object using the default constructor
        Image img1 = new Image();
        System.out.println("Default Constructor Image:");
        System.out.println(img1);

        // Creating an object using the parameterized constructor
        Image img2 = new Image(1920, 1080, "#FF5733");
        System.out.println("\nParameterized Constructor Image:");
        System.out.println(img2);

    }

}
