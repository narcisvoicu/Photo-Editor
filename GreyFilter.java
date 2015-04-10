import java.awt.image.BufferedImageOp;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
class GreyFilter implements MyFilter {
    @Override
    public BufferedImage processImage(BufferedImage image) {    
        BufferedImage colorFrame = image;
        BufferedImage grayFrame = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_GRAY);
        BufferedImageOp grayscaleConv = new ColorConvertOp(colorFrame.getColorModel().getColorSpace(), grayFrame.getColorModel().getColorSpace(), null);
        grayscaleConv.filter(colorFrame, grayFrame);
        return grayFrame;
    }
}
