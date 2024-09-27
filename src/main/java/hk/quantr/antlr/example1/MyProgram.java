package hk.quantr.antlr.example1;

import hk.quantr.antlr.example1.antlr.CSVLexer;
import hk.quantr.antlr.example1.antlr.CSVParser;
import hk.quantr.antlr.example1.antlr.CSVParser.CsvFileContext;
import java.io.File;
import java.io.IOException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.FileUtils;

public class MyProgram {

	public static void main(String args[]) throws IOException {
		String str = FileUtils.readFileToString(new File("a.csv"), "utf-8");
		CSVLexer lexer = new CSVLexer(CharStreams.fromString(""));
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);

		CSVParser parser = new CSVParser(tokenStream);
		CsvFileContext context = parser.csvFile();
	}
}
