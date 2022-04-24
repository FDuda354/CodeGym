package pl.codegym.task.task16.task1631;

import pl.codegym.task.task16.task1631.common.*;

public class ImageReaderFactory
{
    static public ImageReader getImageReader(ImageTypes imageType)
    {
        if(imageType == ImageTypes.BMP)
            return new BmpReader();
        if(imageType == ImageTypes.JPG)
            return new JpgReader();
        if(imageType == ImageTypes.PNG)
            return new PngReader();
        else
            throw new IllegalArgumentException("Nieznany typ obrazu");

    }

}
