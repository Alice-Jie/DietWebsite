package com.ssh.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.PixelGrabber;
import java.awt.image.Raster;
import java.awt.image.RenderedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**TODO
 * @author：Alice
 * @date: 2018年5月7日
 * @version 0.0.1
 * @description：实现文件上传
 */
public class ImageUtil {

	public static BufferedImage change2jpg(File f) {
		try {
			// 在内存中创建的Image对象
			java.awt.Image i = Toolkit.getDefaultToolkit().createImage(f.getAbsolutePath());
			// 创建PixelGrabber对象
			PixelGrabber pg = new PixelGrabber(i, 0, 0, -1, -1, true);
			pg.grabPixels();  // 生成图像像素数组
			// 获取图像宽和高
			int width = pg.getWidth();
			int height = pg.getHeight();
			// 生成bufferedImage对象
			final int[] RGB_MASKS = { 0xFF0000, 0xFF00, 0xFF };
			final ColorModel RGB_OPAQUE = new DirectColorModel(32, RGB_MASKS[0], RGB_MASKS[1], RGB_MASKS[2]);
			DataBuffer buffer = new DataBufferInt((int[]) pg.getPixels(), pg.getWidth() * pg.getHeight());
			WritableRaster raster = Raster.createPackedRaster(buffer, width, height, width, RGB_MASKS, null);
			BufferedImage img = new BufferedImage(RGB_OPAQUE, raster, false, null);
			return img;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void resizeImage(File srcFile, int width, int height, File destFile) {
		try {
			Image i = ImageIO.read(srcFile);
			i = resizeImage(i, width, height);
			ImageIO.write((RenderedImage) i, "jpg", destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Image resizeImage(Image srcImage, int width, int height) {
		try {
			BufferedImage buffImg = null;
			buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			buffImg.getGraphics().drawImage(srcImage.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
			return buffImg;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
