package examples1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo3 {
	
	public static void main(String[] args) {
		
		String data [][] = new String[][] {
			{"a", "b"},
			{"c", "d"},
			{"e", "f"},
			{"e", "a"},
			{"a", "a"}
		};
		
		// Converting To Stream
		Stream<String[]> dataStream = Arrays.stream(data);
		//Apply Flatmap on dataStream
		Stream<String> flatMapStream = dataStream.flatMap(x -> Arrays.stream(x));
		//Apply Filter Operation
		//long result = flatMapStream.filter(n -> "a".equals(n.toString())).count();//Number of Occuring character
		//System.out.println(result);
		Stream<String> result2 = flatMapStream.filter(m -> "e".equals(m.toString()));
		result2.forEach(System.out::println);
		System.out.println("====Another Way=======");
		
		// Another Way
		
		Stream<String> data2 = Arrays.stream(data).flatMap(f -> Arrays.stream(f)).filter(b -> "a".equals(b.toString()));
		data2.forEach(System.out::println);
		// Another Way
		
		Stream.of(data).flatMap(x -> Stream.of(x)).map(f -> " Hello"+f.toString()).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
