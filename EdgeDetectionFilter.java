import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.BufferedImage;
class EdgeDetectionFilter implements MyFilter {
    @Override
    public BufferedImage processImage(BufferedImage image) {  
            float[] colorMatrix = {0.0f, -1.0f, 0.0f,-1.0f, 4.f, -1.0f, 0.0f, -1.0f, 0.0f };
            ConvolveOp op = new ConvolveOp (new Kernel (3, 3, colorMatrix), ConvolveOp.EDGE_NO_OP, null);
            return op.filter (image, null);
    }
}
