package br.com.edumaxsantos.creational.factoryMethod.example1;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args[0];
        String format = image.substring(image.indexOf(".") + 1);
        if(format.equals("gif")) {
            reader = new GifReader(image);
        }
        if(format.equals("jpeg")) {
            reader = new JpegReader(image);
        }

        assert reader != null;
        decodedImage = reader.getDecodeImage();
        System.out.println(decodedImage);
    }
}
