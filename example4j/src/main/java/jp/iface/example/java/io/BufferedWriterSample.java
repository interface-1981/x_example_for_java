package jp.iface.example.java.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BufferedWriterSample {

	/*
	 * 実行時引数（eclipseから実行する場合は、本プログラムファイルを右クリックし「実行の構成」の「引数」タブより指定）
	 *
	 * 第1引数：出力先のディレクトリ（未指定の場合は「d:」が指定される） 第2引数：ファイルのエンコード（未指定の場合は「UTF-8」が指定される）
	 * 第3引数：出力ファイル名（未指定の場合は「test.txt」が指定される）
	 *
	 */
	public static void main(String[] args) {
		BufferedWriter bw = null;

		// 出力先ディレクトリ
		String dir = "d:";
		if (args.length > 0 && args[0] != null) {
			dir = args[0];
		}

		// エンコーディング
		String encode = "UTF-8";
		if (args.length > 1 && args[1] != null) {
			encode = args[1];
		}

		// ファイル名
		String filename = "test.txt";
		if (args.length > 2 && args[2] != null) {
			filename = args[2];
		}

		// ファイル出力の実行
		try {

			//BufferedWriterインスタンスの生成
			File f = new File(dir + "\\" + filename);
			OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(f), encode);
			bw = new BufferedWriter(osw);

			bw.write("１行目");
			bw.newLine();// 改行コードの出力
			bw.write("２行目");
			bw.newLine();// 改行コードの出力
			bw.write("３行目");

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
