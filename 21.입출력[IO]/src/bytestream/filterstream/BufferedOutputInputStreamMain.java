package bytestream.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputInputStreamMain {

	public static void main(String[] args) throws Exception{
		/***************BufferdOutputStream 출력************/
		FileOutputStream fos = new FileOutputStream("bufferedOut.dat");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(65);
		bos.write(66);
		bos.write(67);
		bos.write(2147483647);
		for(int i = 0; i < 256; i++) {
			bos.write(i);
		}
		bos.close();
		System.out.println("BufferedOutputStream.write --> bufferedOut.dat");
		/***************BufferdInputStream 입력************/		
		BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream("bufferedOut.dat"));
		
		int readByte = bis.read();
		System.out.println("1. byte : "+Integer.toBinaryString(readByte));
		readByte = bis.read();
		System.out.println("2. byte : "+Integer.toBinaryString(readByte));
		readByte = bis.read();
		System.out.println("3. byte : "+Integer.toBinaryString(readByte));
		while(true) {
			readByte=bis.read();
			if(readByte == -1) break;
			System.out.print(Integer.toBinaryString(readByte));
		}
		bis.close();
		System.out.println();
		System.out.println("BufferedInputputStream.read <-- bufferedOut.dat");
		
	}

}
