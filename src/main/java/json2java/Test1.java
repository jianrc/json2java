package json2java;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.AnnotationStyle;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GsonAnnotator;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.rules.RuleFactory;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.sun.codemodel.JCodeModel;

public class Test1 {
    

	public static void main(String[] args) throws IOException {
		JCodeModel codeModel = new JCodeModel();
		
		URL source = Test1.class.getResource("/example.json");


		
		SchemaGenerator sg = new SchemaGenerator();
		
		ObjectNode jsonschema = sg.schemaFromExample(source);
		
		DefaultGenerationConfig generationConfig = new DefaultGenerationConfig() {
			@Override
			public boolean isIncludeHashcodeAndEquals() {
				return false;
			}

			@Override
			public boolean isIncludeToString() {
				return false;
			}

			@Override
			public String getClassNamePrefix() {
				return "Poloniex";
			}
		};
		
		RuleFactory ruleFactory = new RuleFactory(generationConfig, new GsonAnnotator(generationConfig), new SchemaStore());
		
		SchemaMapper mapper = new SchemaMapper(ruleFactory, sg);
		
		
		mapper.generate(codeModel, "Currency", "com.jianrc.trade.poloniex.rest", jsonschema.toString());
		
		codeModel.build(new File("src/main/java"));

	}
}
