package machine_learning;

import com.aliasi.classify.BaseClassifier;
import com.aliasi.classify.Classification;

import com.aliasi.util.AbstractExternalizable;

import java.io.File;

//J2SE 提供的最后一个批注是 @SuppressWarnings。该批注的作用是给编译器一条指令，告诉它对被批注的代码元素内部
    //的某些警告保持静默。
public class RunLanguageId {

	public String get_languageid(String args)throws Exception
	{
		
		File modelFile = new File("train_data/langid-leipzig.classifier");
		//System.out.println("Reading classifier from " + modelFile + "\n");
		@SuppressWarnings("unchecked")
		// required for deserialization    反序列化
		BaseClassifier<CharSequence> classifier = (BaseClassifier<CharSequence>) AbstractExternalizable可外部化的 
				.readObject(modelFile);
		
			//System.out.println("Input=" + sentences[i]);
			Classification classification = classifier.classify(args);
			System.out.println("  Language Id= "+classification.bestCategory().toString());
			// classification.bestCategory();
			return classification.bestCategory().toString();
	
	}

	public static void main(String[] args) throws Exception {
		File modelFile = new File("train_data/langid-leipzig.classifier");
		System.out.println("Reading classifier from " + modelFile + "\n");
		@SuppressWarnings("unchecked")
		// required for deserialization
		BaseClassifier<CharSequence> classifier = (BaseClassifier<CharSequence>) AbstractExternalizable
				.readObject(modelFile);
		String[] sentences = { "book", "libri", "にほんご",
				"La Présidence de la République", "Guten Tag","Google identify language - Google Search" };
		for (int i = 0; i < sentences.length; ++i) {
			System.out.println("Input=" + sentences[i]);
			Classification classification = classifier.classify(sentences[i]);
			System.out.println(classification.bestCategory().toString());
			// classification.bestCategory();
		}
	}

}