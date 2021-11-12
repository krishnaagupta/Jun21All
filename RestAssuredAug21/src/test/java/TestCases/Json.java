package TestCases;

import java.io.IOException;
import java.lang.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

public class Json {

	public 	static ObjectMapper mapper = getDefaultObjectMapper();

	public static ObjectMapper getDefaultObjectMapper() {
		ObjectMapper defaultObjMapper =new ObjectMapper();
		return defaultObjMapper;
	}

	//https://www.youtube.com/watch?v=Hv_a3ZBSO_g
	// above site for parsing json
	public static JsonNode parse(String src) throws IOException {
		return mapper.readTree(src);
	}

	// POJO
	public static <A> A fromJson(JsonNode node, Class<A> clazz) throws JsonProcessingException {
		try {
			return mapper.treeToValue(node, clazz);
		}
		catch (Exception e) {

		}
		return null;
	}


}
