/*
 * Copyright (c) 2019 TiempoMeta
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
package com.tiempometa.printer;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.EnumMap;
import java.util.Map;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.lowagie.text.pdf.Barcode128;

/**
 * A set of utilities to generate Barcodes and QR Codes
 * 
 * @author Gerardo Esteban Tasistro Giubetic
 * 
 */
public class Barcode {

	/**
	 * Generates a QR Code with the provided data value.
	 * 
	 * @param data Info to encode in QR Code
	 * @return
	 * @throws WriterException
	 */
	public static BufferedImage generateQrCode(String data) throws WriterException {
		if (data == null) {
			return null;
		}
		Map<EncodeHintType, Object> hintMap = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
		hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		BufferedImage qrCode = null;
		hintMap.put(EncodeHintType.MARGIN, 1); /* default = 4 */
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
		QRCodeWriter qrCodeWriter = new QRCodeWriter();
		BitMatrix byteMatrix = qrCodeWriter.encode(data, BarcodeFormat.QR_CODE, 100, 100, hintMap);
		int CrunchifyWidth = byteMatrix.getWidth();
		qrCode = new BufferedImage(CrunchifyWidth, CrunchifyWidth, BufferedImage.TYPE_INT_RGB);
		qrCode.createGraphics();

		Graphics2D graphics = (Graphics2D) qrCode.getGraphics();
		graphics.setColor(Color.WHITE);
		graphics.fillRect(0, 0, CrunchifyWidth, CrunchifyWidth);
		graphics.setColor(Color.BLACK);

		for (int i = 0; i < CrunchifyWidth; i++) {
			for (int j = 0; j < CrunchifyWidth; j++) {
				if (byteMatrix.get(i, j)) {
					graphics.fillRect(i, j, 1, 1);
				}
			}
		}
		return qrCode;
	}

	/**
	 * Generates a Barcode128 formatted barcode with the provided data.
	 * 
	 * @param data Info to encode in barcode
	 * @return
	 */
	public static Image generateBarcode(String data) {
		if (data == null) {
			return null;
		}
		Barcode128 barCode = new Barcode128();
		barCode.setCodeType(Barcode128.CODE128);
		barCode.setCode(data);
		barCode.setN(10f);
		barCode.setX(2f);
		return barCode.createAwtImage(Color.BLACK, Color.WHITE);
	}

	/**
	 * Generates a Barcode128 formatted barcode with the provided data.
	 * 
	 * @param data Info to encode in barcode
	 * @return
	 * @throws WriterException
	 */
	public static BufferedImage generateBarcodeCode(String data) throws WriterException {
		if (data == null) {
			return null;
		}
		Map<EncodeHintType, Object> hintMap = new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
		hintMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		BufferedImage qrCode = null;
		hintMap.put(EncodeHintType.MARGIN, 1); /* default = 4 */
		hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);
		Code128Writer barCodeWriter = new Code128Writer();
		BitMatrix byteMatrix = barCodeWriter.encode(data, BarcodeFormat.CODE_128, 300, 100, hintMap);
		// int CrunchifyWidth = byteMatrix.getWidth();
		int matrixWidth = byteMatrix.getWidth();
		int matrixHeight = byteMatrix.getHeight();
		qrCode = new BufferedImage(matrixWidth, matrixHeight, BufferedImage.TYPE_INT_RGB);
		qrCode.createGraphics();

		Graphics2D graphics = (Graphics2D) qrCode.getGraphics();
		graphics.setColor(Color.WHITE);

		graphics.fillRect(0, 0, matrixWidth, matrixHeight);
		graphics.setColor(Color.BLACK);

		for (int i = 0; i < matrixWidth; i++) {
			for (int j = 0; j < matrixHeight; j++) {
				if (byteMatrix.get(i, j)) {
					graphics.fillRect(i, j, 1, 1);
				}
			}
		}
		return qrCode;
	}
}
