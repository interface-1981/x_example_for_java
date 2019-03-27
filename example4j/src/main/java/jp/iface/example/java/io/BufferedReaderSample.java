package jp.iface.example.java.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderSample {

	/*
	 * 実行時引数（eclipseから実行する場合は、本プログラムファイルを右クリックし「実行の構成」の「引数」タブより指定）
	 *
	 * 第1引数：入力ファイルのフルパス（未指定の場合は「d:\test.txt」が指定される）
	 * 第2引数：ファイルのエンコード（未指定の場合は「UTF-8」が指定される）
	 *
	 */
	public static void main(String[] args) {
		BufferedReader br = null;

		// 入力ファイルのフルパス
		String inputFilePath = "d:\\test.txt";
		if (args.length > 0 && args[0] != null) {
			inputFilePath = args[0];
		}

		// エンコーディング
		String encode = "UTF-8";
		if (args.length > 1 && args[1] != null) {
			encode = args[1];
		}

		// ファイル入力の実行
		try {

			//BufferedReaderインスタンスの生成
			File f = new File(inputFilePath);
			InputStreamReader isr = new InputStreamReader(new FileInputStream(f), encode);
			br = new BufferedReader(isr);

			// 改行コードまでの1行を読み込む
			String line = br.readLine();

			//入力データが存在するまで繰り返す
			while (line != null) {
				//読み込んだ1行をコンソールへ出力
				System.out.println(line);
				//次の1行を読み込む
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
