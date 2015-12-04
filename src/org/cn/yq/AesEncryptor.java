package org.cn.yq;

import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class AesEncryptor {

	private static final byte[] key = { 0x47, 0x75, 0x61, 0x6E, 0x67, 0x5A,
			0x68, 0x6F, 0x75, 0x47, 0x41, 0x53, 0x20, 0x20, 0x20, 0x20, 0x20,
			0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20,
			0x20, 0x20, 0x20, 0x20 };

	private static final String transform = "AES/CBC/NoPadding";

	private static final String algorithm = "AES";

	private static final SecretKeySpec keySpec = new SecretKeySpec(key,
			algorithm);

	public static String decrypt(String pHexText) {
		try {
			Cipher cipher = Cipher.getInstance(transform);

			byte[] encryptedBytes = Base64Util.decode(pHexText); // Hex.decode(pHexText);

			byte[] iv = { 0x4E, 0x65, 0x77, 0x61, 0x63, 0x65, 0x20, 0x20, 0x20,
					0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20 };

			cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv));

			byte[] decryptedBytes = cipher.doFinal(encryptedBytes);

			System.arraycopy(decryptedBytes, 0, encryptedBytes, 0,
					encryptedBytes.length);

			String result = new String(encryptedBytes);

			return result.trim();

		} catch (Exception ex) {
			return "";
		}
	}

	/**
 
*/

	public static String encrypt(String pData)
	{
		try {
			Cipher cipher = Cipher.getInstance(transform);

			byte[] iv = { 0x4E, 0x65, 0x77, 0x61, 0x63, 0x65, 0x20, 0x20, 0x20,
					0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20 };

			cipher.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv));

			byte[] output = cipher.doFinal(paddingData(pData));

			byte[] encryptedContent = new byte[output.length];

			System.arraycopy(output, 0, encryptedContent, 0,
					encryptedContent.length);
			String result = Base64Util.encode(encryptedContent);
			return result;
		} 
		catch (Exception ex) {
			return "";
		}
	}

	/**
	 * 
	 * 补齐的16位的整数倍
	 * 
	 * 
	 * 
	 * @param pData
	 * 
	 * @return
	 */

	private static byte[] paddingData(String pData) {

		byte[] bytes = pData.getBytes();

		int length = bytes.length / 16;

		if (length * 16 < bytes.length) {

			length++;

		}

		byte[] result = new byte[length * 16];

		System.arraycopy(bytes, 0, result, 0, bytes.length);

		for (int i = bytes.length; i < result.length; i++) {

			result[i] = 0x00;

		}

		return result;

	}

	/**
	 * 
	 * 初始化向量到16位
	 * 
	 * */

	@SuppressWarnings("unused")
	private static byte[] createIV(String pIv)
			throws UnsupportedEncodingException {

		byte[] bytes = pIv.getBytes("US-ASCII");

		int length = bytes.length / 16;

		if (length * 16 < bytes.length) {

			length++;

		}

		byte[] result = new byte[16];

		System.arraycopy(bytes, 0, result, 0, bytes.length > 16 ? 16
				: bytes.length);

		for (int i = bytes.length; i < result.length; i++) {

			result[i] = 0x00;

		}

		return result;

	}

	public static String changeCardID(String cardID) {
		if (null != cardID && cardID.length() > 0) {
			return cardID.substring(0, 4) + "********"
					+ cardID.substring(cardID.length() - 4, cardID.length());
		}
		return "";
	}
}
